package com.fanduel.modelgenerator.cleaner;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.squareup.javapoet.AnnotationSpec;
import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.TypeSpec;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;

import javax.annotation.processing.Generated;
import javax.lang.model.element.Modifier;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Slf4j
public class PackageCleaner {

    public void clean(String packageName) throws IOException {
        File rootDirectory = new File("src/main/java/com/fanduel/modelgenerator/generated/sportradar/" + packageName);
        if (rootDirectory.listFiles() == null) {
            return;
        }

        for (File file : rootDirectory.listFiles()) {
            try {
                clean(file);
            } catch (ClassNotFoundException e) {
                log.error("Class {} cannot be accessed on the classpath. You will need to rebuild/restart the application to clean this folder.", e.getMessage());
                return;
            }
        }
    }

    private void clean(File rootDirectory) throws IOException, ClassNotFoundException {
        final String targetPackage = rootDirectory.getParentFile().getName() + '.' + rootDirectory.getName();
        Map<String, List<Class<?>>> classMap = new HashMap<>();
        Collection<File> filesToDelete = new LinkedList<>();
        LinkedList<File> files = new LinkedList<>(List.of(rootDirectory));
        while (!files.isEmpty()) {
            File root = files.pop();
            if (root.listFiles() == null) {
                continue;
            }

            for (File file : root.listFiles()) {
                if (file.isDirectory()) {
                    files.addLast(file);
                } else {
                    String name = file.getName();
                    if (name.endsWith(".java")) {
                        String fileString = FileUtils.readFileToString(file, "UTF-8");
                        String packageName = fileString.substring(fileString.indexOf("package ") + 8, fileString.indexOf(";"));
                        if (name.contains("__")) {
                            filesToDelete.add(file);
                        }
                        Class<?> clazz = Class.forName(packageName + "." + name.split("\\.")[0]);
                        String key = clazz.getSimpleName().split("_")[0];
                        if (!classMap.containsKey(key)) {
                            classMap.put(key, new LinkedList<>());
                        }
                        classMap.get(key).add(clazz);
                    }
                }
            }
        }

        classMap.forEach((String baseClassName, List<Class<?>> classes) -> {
            TypeSpec.Builder typeSpecBuilder = TypeSpec
                    .classBuilder(baseClassName)
                    .addModifiers(Modifier.PUBLIC)
                    .addAnnotation(Data.class)
                    .addAnnotation(
                            AnnotationSpec
                                    .builder(Generated.class)
                                    .addMember("value", "\"model-generator\"")
                                    .build());
            Map<String, Field> fieldMap = new HashMap<>();
            classes.stream().flatMap(clazz -> Arrays.stream(clazz.getFields()))
                    .forEach(field -> {
                        String fieldName = field.getName();
                        fieldMap.put(fieldName, field);
                    });
            fieldMap.forEach((fieldName, field) -> {
                FieldSpec.Builder fieldSpecBuilder = FieldSpec
                        .builder(getBaseTypeForField(classMap, field), fieldName)
                        .addModifiers(Modifier.PRIVATE);
                Arrays.stream(field.getDeclaredAnnotations()).forEach(annotation ->
                        fieldSpecBuilder.addAnnotation(
                                AnnotationSpec
                                        .builder(annotation.annotationType())
                                        .addMember("value", '"' + ((JsonProperty) annotation).value() + '"')
                                        .build()
                        ));
                typeSpecBuilder.addField(fieldSpecBuilder.build());
            });
            JavaFile javaFile = JavaFile
                    .builder("com.fanduel.modelgenerator.generated.sportradar." + targetPackage, typeSpecBuilder.build())
                    .indent("    ")
                    .build();

            try {
                javaFile.writeTo(System.out);
                Path path = Paths.get("src/main/java/");
                javaFile.writeTo(path);
                for (File file : filesToDelete) {
                    file.deleteOnExit();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    private Type getBaseTypeForField(Map<String, List<Class<?>>> classMap, Field field) {
        String name = field.getType().getSimpleName().split("_")[0];
        Optional<Class<?>> clazzOpt = classMap.getOrDefault(name, new LinkedList<>())
                .stream()
                .filter(clazz -> clazz.getSimpleName().equals(name))
                .findAny();
        if (clazzOpt.isPresent()) {
            return clazzOpt.get();
        }
        if (field.getGenericType() instanceof ParameterizedType) {
            System.out.println(Arrays.toString(field.getType().getTypeParameters()));
            ParameterizedType stringListType = (ParameterizedType) field.getGenericType();
            Type[] genericTypeArr = stringListType.getActualTypeArguments();
            return new ParameterizedType() {
                @Override
                public Type[] getActualTypeArguments() {
                    Type[] arr = new Type[genericTypeArr.length];
                    for (int index = 0; index < arr.length; index++) {
                        arr[index] = getBaseTypeForType(classMap, genericTypeArr[index]);
                    }
                    return arr;
                }

                @Override
                public Type getRawType() {
                    return field.getType();
                }

                @Override
                public Type getOwnerType() {
                    return field.getType();
                }
            };
        }
        return field.getGenericType();
    }

    private Type getBaseTypeForType(Map<String, List<Class<?>>> classMap, Type type) {
        String[] typeNameArr = type.getTypeName().split("\\.");
        String name = typeNameArr[typeNameArr.length - 1].split("_")[0];
        Optional<Class<?>> clazzOpt = classMap.getOrDefault(name, new LinkedList<>())
                .stream()
                .filter(clazz -> clazz.getSimpleName().equals(name))
                .findAny();
        if (clazzOpt.isPresent()) {
            return clazzOpt.get();
        } else {
            return type;
        }
    }
}

package com.fanduel.modelgenerator.codegen;

import com.fanduel.modelgenerator.collector.request.model.RequestMetadata;
import com.fanduel.modelgenerator.collector.response.model.ResponseMetadata;
import com.fanduel.modelgenerator.constants.Files;
import com.fanduel.modelgenerator.utils.FileUtils;
import com.fanduel.modelgenerator.utils.TypeUtils;
import com.fanduel.modelgenerator.utils.UrlUtils;
import com.google.common.base.CaseFormat;
import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.ParameterSpec;
import com.squareup.javapoet.TypeSpec;
import lombok.extern.slf4j.Slf4j;
import org.springframework.lang.NonNull;
import reactor.core.publisher.Mono;

import javax.lang.model.element.Modifier;
import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
public class ClientGeneratorImpl implements ClientGenerator {

    private final String requestName; // golfv3
    private final String generatedClientClassName; // SportRadarClient
    private final File outputDirectory;//= "temp";
    private final String generationBasePackage;// = "com.fanduel.modelgenerator.generated";
    private final ClassLoader tempPackageClassLoader;
    private final Map<String, Class<?>> variableTypeMap = Map.ofEntries(
            Map.entry("year", Integer.class),
            Map.entry("month", Integer.class),
            Map.entry("day", Integer.class)
    );

    private final Map<String, String> variableConstantOverrides = Map.ofEntries(
            Map.entry("access_level", "trial"),
            Map.entry("version", "v7"),
            Map.entry("language_code", "en"),
            Map.entry("format", "json")
    );

    public ClientGeneratorImpl(String requestName, String generatedClientClassName, File outputDirectory, String generationBasePackage) {
        this.requestName = requestName;
        this.generatedClientClassName = generatedClientClassName;
        this.generationBasePackage = generationBasePackage;
        this.outputDirectory = outputDirectory;
        try {
            tempPackageClassLoader = new URLClassLoader(new URL[]{outputDirectory.toURI().toURL()});
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void generateClient(@NonNull List<ResponseMetadata> responseMetadata) {
        List<RequestMetadata> requestMetadataList =
                responseMetadata.stream().map(ResponseMetadata::requestMetadata).collect(Collectors.toList());
        System.out.println("Generating client interface.");
        File rootDirectory = new File(String.join("/",
                outputDirectory.getPath(),
                FileUtils.packagePathToFilePath(generationBasePackage),
                requestName.toLowerCase()));
        List<File> allFiles = FileUtils.getAllFilesInDirectory(rootDirectory);
        // compile the java file
        System.out.println("Compiling files under " + rootDirectory.getName());
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        int result = compiler.run(null, null, null,
                allFiles.stream()
                        .filter(file -> file.getName().endsWith(".java"))
                        .filter(file -> !file.getName().endsWith(generatedClientClassName))
                        .map(File::getAbsolutePath)
                        .toArray((String[]::new)));
        if (result == 0) {
            System.out.println("Compilation successful.");
        } else {
            log.error("Compilation could not be completed, finished with exit code {}.", result);
            throw new RuntimeException();
        }
        log.info("Generating client " + generatedClientClassName);
        File clientFile = generateClientInterface(requestMetadataList, requestName.toLowerCase());
        log.info("Generated client file {}.", clientFile.getAbsolutePath());
        // Compile file
        log.info("Generating client implementation.");
        generateClientImpl(requestMetadataList, requestName.toLowerCase());
        log.info("{}Impl generated successfully.", generatedClientClassName);

        List<File> allClassFiles = FileUtils.getAllFilesInDirectory(rootDirectory)
                .stream()
                .filter(file -> file.getName().endsWith(".class"))
                .toList();
        allClassFiles.forEach(File::delete);
    }

    private File generateClientInterface(List<RequestMetadata> requestMetadataList, String packageName) {
        List<MethodSpec> methodSpecs = requestMetadataList
                .stream()
                .map(requestMetadata -> requestMetadataToAbstractMethodSpecBuilder(requestMetadata, packageName))
                .map(MethodSpec.Builder::build)
                .collect(Collectors.toList());
        TypeSpec.Builder interfaceBuilder =
                ClientSpecBuilderFactory.createTypeSpecForClient(generatedClientClassName, methodSpecs);

        return createFileFromTypeSpec(interfaceBuilder.build(), outputDirectory, generationBasePackage + "." + packageName);
    }

    private MethodSpec.Builder requestMetadataToAbstractMethodSpecBuilder(RequestMetadata requestMetadata, String packageName) {
        String packagePath = generationBasePackage + "." + packageName + "." + requestMetadata.requestName().toLowerCase();
        String typeName = getResponseModelFileForRequest(packagePath, requestMetadata)
                .getName().replace(".java", "");
        Class<?> baseClass;
        try {
            baseClass = tempPackageClassLoader.loadClass(packagePath + "." + typeName);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        MethodSpec.Builder methodSpecBuilder = MethodSpec
                .methodBuilder("get" + CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_CAMEL, typeName))
                .addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
                .addJavadoc(
                        "Documentation sample: " +
                                UrlUtils.replaceApiKey(requestMetadata.exampleUrl(), "{your_api_key}") +
                                Optional.ofNullable(requestMetadata.variableUrl())
                                        .map(variableUrl -> System.lineSeparator() +
                                                "Variable URL: " +
                                                variableUrl)
                                        .orElse("")

                )
                .returns(TypeUtils.parameterizedType(Mono.class, baseClass));
        List<String> pathVariables = UrlUtils.getPathVariableNames(
                        Optional.ofNullable(requestMetadata.variableUrl())
                                .orElse(requestMetadata.exampleUrl()))
                .stream()
                .filter(param -> !variableConstantOverrides.containsKey(param))
                .map(param -> CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_UNDERSCORE, param))
                .toList();
        addRequiredParametersToMethodSpec(methodSpecBuilder, pathVariables, variableTypeMap);
        return methodSpecBuilder;
    }

    private void generateClientImpl(List<RequestMetadata> requestMetadataList, String packageName) {
        String clientBasePath = UrlUtils.getClientCommonBasePathFromUrls(requestMetadataList.stream()
                .map(RequestMetadata::variableUrl).toList());
        List<MethodSpec> methodSpecs = requestMetadataList
                .stream()
                .map(requestMetadata -> requestMetadataToMethodSpecBuilder(requestMetadata, packageName, clientBasePath))
                .map(MethodSpec.Builder::build)
                .collect(Collectors.toList());
        MethodSpec fetchClassMethod =
                ClientSpecBuilderFactory.createMethodSpecForClientFetchByClass()
                        .build();
        MethodSpec fetchTypeMethod =
                ClientSpecBuilderFactory.createMethodSpecForClientFetchByParameterizedTypeReference()
                        .build();
        methodSpecs.addAll(List.of(fetchClassMethod, fetchTypeMethod));
        TypeSpec.Builder classBuilder = ClientSpecBuilderFactory
                .createTypeSpecForClientImpl(generatedClientClassName, methodSpecs)
                .addField(FieldSpec.builder(String.class, "API_BASE_PATH")
                        .addModifiers(Modifier.PRIVATE, Modifier.FINAL)
                        .initializer('"' + clientBasePath + '"')
                        .build())
                .addField(FieldSpec.builder(String.class, "API_KEY")
                        .addModifiers(Modifier.PRIVATE, Modifier.FINAL)
                        .initializer("\"your_key_here\"")
                        .build());
        variableConstantOverrides.entrySet()
                .stream()
                .filter(entry -> !entry.getKey().equals("format"))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue))
                .forEach((key, value) ->
                classBuilder.addField(FieldSpec.builder(String.class,
                                CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_UNDERSCORE, key))
                        .addModifiers(Modifier.PRIVATE, Modifier.FINAL)
                        .initializer('"' + value + '"')
                        .build()));

        createFileFromTypeSpec(classBuilder.build(), outputDirectory, generationBasePackage + "." + packageName);
    }

    private MethodSpec.Builder requestMetadataToMethodSpecBuilder(RequestMetadata requestMetadata, String packageName, String clientBasePath) {
        String packagePath = generationBasePackage + "." + packageName + "." + requestMetadata.requestName().toLowerCase();
        String typeName = getResponseModelFileForRequest(packagePath, requestMetadata)
                .getName().replace(".java", "");
        Class<?> baseClass;
        try {
            baseClass = tempPackageClassLoader.loadClass(packagePath + "." + typeName);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        MethodSpec.Builder methodSpecBuilder = MethodSpec
                .methodBuilder("get"
                        + Character.toUpperCase(typeName.charAt(0))
                        + typeName.substring(1))
                .addModifiers(Modifier.PUBLIC)
                .returns(TypeUtils.parameterizedType(Mono.class, baseClass));
        List<String> pathVariables = UrlUtils.getPathVariableNames(
                        Optional.ofNullable(requestMetadata.variableUrl())
                                .orElse(requestMetadata.exampleUrl()))
                .stream()
                .filter(param -> !variableConstantOverrides.containsKey(param))
                .toList();
        String variableUrl = requestMetadata.variableUrl();
        List<String> pathSegments = UrlUtils.getPathSegments(variableUrl.substring(clientBasePath.length()))
                .stream()
                .map(path -> path.replace(".{format}", ".json"))
                .map(path -> path.startsWith("{") && path.endsWith("}") ?
                        Optional.of(path.replace("{", "").replace("}", ""))
                                .map(param -> pathVariables.contains(param) ?
                                        CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, param) :
                                        CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_UNDERSCORE, param))
                                .map(param -> variableTypeMap.containsKey(param) ? param + ".toString()" : param)
                                .orElse(null)
                        : '"' + path + '"'
                )
                .collect(Collectors.toList());
        methodSpecBuilder.addCode(
                ClientSpecBuilderFactory.createClientImplMethodCodeBlock(pathSegments, baseClass)
                        .build());
        addRequiredParametersToMethodSpec(methodSpecBuilder, pathVariables, variableTypeMap);
        return methodSpecBuilder;
    }

    private File getResponseModelFileForRequest(String packagePath, RequestMetadata requestMetadata) {
        return FileUtils.getAllFilesInDirectory(new File(Files.TEMP_DIRECTORY.getPath() +
                        "/" +
                        FileUtils.packagePathToFilePath(packagePath)))
                .stream()
                .filter(file -> file.getName().endsWith(requestMetadata.requestName() + "Response.java"))
                .findFirst()
                .orElseThrow();
    }

    private void addRequiredParametersToMethodSpec(
            MethodSpec.Builder methodSpecBuilder,
            List<String> parameters, Map<String,
            Class<?>> variableTypeMap) {
        parameters.stream()
                .map(param -> CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, param))
                .forEach(param ->
                        methodSpecBuilder.addParameter(
                                ParameterSpec.builder(variableTypeMap.getOrDefault(param, String.class), param)
                                        .addAnnotation(NonNull.class)
                                        .build()));
    }

    private File createFileFromTypeSpec(TypeSpec typeSpec, File outputDirectory, String packagePath) {
        JavaFile javaFile = JavaFile
                .builder(packagePath, typeSpec)
                .indent("    ")
                .build();
        try {
            if (log.isTraceEnabled()) {
                javaFile.writeTo(System.out);
            }
            javaFile.writeTo(outputDirectory.toPath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new File(String.join("/", outputDirectory.getPath(), FileUtils.packagePathToFilePath(packagePath), typeSpec.name + ".java"));
    }

}

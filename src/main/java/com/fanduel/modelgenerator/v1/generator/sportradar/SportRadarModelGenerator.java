package com.fanduel.modelgenerator.v1.generator.sportradar;

import com.fanduel.modelgenerator.utils.FileUtils;
import com.fanduel.modelgenerator.v1.generator.ModelGenerator;
import com.google.common.base.CaseFormat;
import com.squareup.javapoet.AnnotationSpec;
import com.squareup.javapoet.CodeBlock;
import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.ParameterSpec;
import com.squareup.javapoet.TypeSpec;
import com.squareup.javapoet.TypeVariableName;
import com.sun.codemodel.JCodeModel;
import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jsonschema2pojo.DefaultGenerationConfig;
import org.jsonschema2pojo.GenerationConfig;
import org.jsonschema2pojo.Jackson2Annotator;
import org.jsonschema2pojo.SchemaGenerator;
import org.jsonschema2pojo.SchemaMapper;
import org.jsonschema2pojo.SchemaStore;
import org.jsonschema2pojo.SourceType;
import org.jsonschema2pojo.exception.GenerationException;
import org.jsonschema2pojo.rules.RuleFactory;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.springframework.lang.NonNull;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import javax.annotation.processing.Generated;
import javax.lang.model.element.Modifier;
import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Slf4j
public class SportRadarModelGenerator implements ModelGenerator {

    private final String docsUrl;
    private final List<SportRadarRequestMetadata> requestMetadataList = new LinkedList<>();
    private static final String CLIENT_NAME = "SportRadarClient";
    @Getter
    private final String outputDirectory = "src/main/java/";
    @Getter
    private final String basePackage = "com.fanduel.modelgenerator.generated.sportradar";

    public SportRadarModelGenerator(String docsUrl) {
        this.docsUrl = docsUrl;
        collectDocumentationUrls();
    }

    public void collectDocumentationUrls() {
        WebDriverManager.safaridriver().setup();
        WebDriver webDriver = new SafariDriver();
        webDriver.get(docsUrl);
        Document doc = Jsoup.parse(webDriver.getPageSource());
        webDriver.quit();
        Elements elements = doc.getElementById("main")
                .select(".better-docs-content")
                .first()
                .children();
        SportRadarRequestMetadata requestMetadata = null;
        requestMetadataList.clear();
        for (Element element : elements) {
            if (element.nodeName().equals("h2")) {
                requestMetadata = new SportRadarRequestMetadata().setHeaderName(element.text());
                requestMetadataList.add(requestMetadata);
            } else if (element.nodeName().equals("pre") && !element.select(".language-shell").isEmpty()) {
                element = element.selectFirst(".shell");
                if (element != null) {
                    requestMetadata.setSampleUrl(element.text());
                }
            } else if (element.nodeName().equals("p") && requestMetadata != null && !element.select("code").isEmpty()) {
                requestMetadata.setVariableUrl(element.text());
            }
        }
        requestMetadataList.removeIf(SportRadarRequestMetadata::isInvalid);
        requestMetadataList.removeIf(SportRadarRequestMetadata::isStreamApi);

        Set<String> remainingTokens = findUnmatchedParams();
        if (!remainingTokens.isEmpty()) {
            log.warn("{} path variables could not be filled.", remainingTokens.size());
            System.out.println(remainingTokens);
        }
    }

    @Override
    public void generate(String packageName) {
        requestMetadataList.stream()
                .filter(requestMetadata ->
                        !new File(outputDirectory
                                + basePackage.replaceAll("\\.", "/")
                                + "/"
                                + packageName
                                + "/"
                                + requestMetadata.getHeaderName().toLowerCase()
                                + "/"
                                + requestMetadata.getHeaderName()
                                + "Response.java").exists())
                .forEach(requestMetadata -> {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                convertJsonToJavaClass(requestMetadata, packageName);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        File rootDirectory = new File(outputDirectory + basePackage.replaceAll("\\.", "/") + "/" + packageName);
        List<File> allFiles = FileUtils.getAllFilesInDirectory(rootDirectory);

        // compile the java file
        System.out.println("Compiling files under " + rootDirectory.getName());
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        int result = compiler.run(null, null, null,
                allFiles.stream()
                        .filter(file -> file.getName().endsWith(".java"))
                        .map(File::getAbsolutePath)
                        .toArray((String[]::new)));
        if (result == 0) {
            System.out.println("Compilation successful.");
        } else {
            log.error("Compilation could not be completed, finished with exit code {}.", result);
            throw new RuntimeException();
        }
        System.out.println("Generating client interface.");
        File clientFile = generateClientInterface(requestMetadataList, packageName);
        // Compile file
        compiler.run(null, null, null, clientFile.getAbsolutePath());
        try {
            Class<?> clientClass =
                    ClassLoader.getSystemClassLoader().loadClass(basePackage + "." + packageName + "." + CLIENT_NAME);
            System.out.println("Generating client implementation.");
            generateClientImpl(requestMetadataList, packageName, clientClass);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Generation completed.");
    }

    private File generateClientInterface(List<SportRadarRequestMetadata> requestMetadataList, String packageName) {
        List<MethodSpec> methodSpecs = requestMetadataList
                .stream()
                .map(requestMetadata -> {
                    String typeName = requestMetadata.getHeaderName();
                    Class<?> baseClass;
                    try {
                        baseClass = ClassLoader.getSystemClassLoader().loadClass(
                                basePackage + "." + packageName + "." + typeName.toLowerCase() + "." + typeName + "Response");
                    } catch (ClassNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                    MethodSpec.Builder methodSpecBuilder = MethodSpec
                            .methodBuilder("get"
                                    + Character.toUpperCase(typeName.charAt(0))
                                    + typeName.substring(1))
                            .addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
                            .addJavadoc(
                                    "Documentation sample: " +
                                            requestMetadata.getSampleUrl() +
                                            System.lineSeparator() +
                                            "Variable URL: " +
                                            requestMetadata.getVariableUrl()
                            )
                            .returns(new ParameterizedType() {
                                @Override
                                public Type[] getActualTypeArguments() {
                                    return new Type[]{baseClass};
                                }

                                @Override
                                public Type getRawType() {
                                    return Mono.class;
                                }

                                @Override
                                public Type getOwnerType() {
                                    return null;
                                }
                            });
                    requestMetadata.getPathParams()
                            .stream()
                            .map(param -> CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, param))
                            .filter(param -> !Set.of("accessLevel", "version", "languageCode").contains(param))
                            .forEach(param ->
                            methodSpecBuilder.addParameter(
                                    Set.of("year", "month", "day").contains(param) ?
                                            Integer.class : String.class,
                                    param));
                    return methodSpecBuilder.build();
                })
                .collect(Collectors.toList());
        TypeSpec.Builder interfaceBuilder = TypeSpec
                .interfaceBuilder(CLIENT_NAME)
                .addModifiers(Modifier.PUBLIC)
                .addAnnotation(
                        AnnotationSpec
                                .builder(Generated.class)
                                .addMember("value", "\"fanduel-model-generator\"")
                                .build());
        methodSpecs.forEach(interfaceBuilder::addMethod);

        JavaFile javaFile = JavaFile
                .builder(basePackage + "." + packageName, interfaceBuilder.build())
                .indent("    ")
                .build();

        try {
            if (log.isTraceEnabled()) {
                javaFile.writeTo(System.out);
            }
            Path path = Paths.get(outputDirectory);
            javaFile.writeTo(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File interfaceClassFile = new File(outputDirectory + basePackage.replaceAll("\\.", "/") + "/" + packageName + "/" + CLIENT_NAME + ".class");
        if (interfaceClassFile.exists()) {
            interfaceClassFile.delete();
        }
        return interfaceClassFile;
    }

    private void generateClientImpl(List<SportRadarRequestMetadata> requestMetadataList, String packageName, Class<?> clientClass) {
        String clientBasePath = requestMetadataList.stream()
                .map(SportRadarRequestMetadata::getVariableUrl)
                .map(url -> url.contains("{") ? url.substring(0, url.indexOf("{")) : url)
                .reduce(this::greatestCommonPrefix)
                .orElse(null);
        List<MethodSpec> methodSpecs = requestMetadataList
                .stream()
                .map(requestMetadata -> {
                    String typeName = requestMetadata.getHeaderName();
                    Class<?> baseClass;
                    try {
                        baseClass = ClassLoader.getSystemClassLoader().loadClass(
                                basePackage + "." + packageName + "." + typeName.toLowerCase() + "." + typeName + "Response");
                    } catch (ClassNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                    MethodSpec.Builder methodSpecBuilder = MethodSpec
                            .methodBuilder("get"
                                    + Character.toUpperCase(typeName.charAt(0))
                                    + typeName.substring(1))
                            .addModifiers(Modifier.PUBLIC)
                            .returns(new ParameterizedType() {
                                @Override
                                public Type[] getActualTypeArguments() {
                                    return new Type[]{baseClass};
                                }

                                @Override
                                public Type getRawType() {
                                    return Mono.class;
                                }

                                @Override
                                public Type getOwnerType() {
                                    return null;
                                }
                            });
                    List<String> requestParams = requestMetadata.getPathParams()
                            .stream()
                            .filter(param -> !Set.of("access_level", "version", "language_code").contains(param))
                            .toList();
                    String variableUrl = requestMetadata.getVariableUrl();
                    List<String> pathSegments = Arrays.stream(variableUrl.substring(clientBasePath.length(),
                                            variableUrl.contains("?") ? variableUrl.indexOf("?") : variableUrl.length())
                                    .split("/"))
                            .map(path -> path.replace(".{format}", ".json"))
                            .map(path -> path.startsWith("{") && path.endsWith("}") ?
                                    Optional.of(path.replace("{", "").replace("}", ""))
                                            .map(param -> requestParams.contains(param) ? CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, param) : nameToConstant(param))
                                            .map(param -> Set.of("year", "month", "day").contains(param) ? param + ".toString()" : param)
                                            .orElse(null)
                                    : '"' + path + '"'
                            )
                            .collect(Collectors.toList());
                    methodSpecBuilder.addCode(
                            CodeBlock.builder()
                                    .add(
                                            new StringBuilder()
                                                    .append("UriComponents uri = UriComponentsBuilder.fromPath(API_BASE_PATH)")
                                                    .append(System.lineSeparator())
                                                    .append(".pathSegment(" + String.join(", ", pathSegments.toArray(String[]::new)) + ")")
                                                    .append(System.lineSeparator())
                                                    .append(".queryParam(\"api_key\", API_KEY)")
                                                    .append(System.lineSeparator())
                                                    .append(".build();")
                                                    .append(System.lineSeparator())
                                                    .append("return fetch(uri.toUri(), ").append(baseClass.getSimpleName()).append(".class);")
                                                    .toString()
                                    )
                                    .build());
                    requestParams.stream()
                            .map(param -> CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, param))
                            .forEach(param ->
                                    methodSpecBuilder.addParameter(
                                            ParameterSpec.builder(
                                                            Set.of("year", "month", "day").contains(param) ?
                                                                    Integer.class : String.class,
                                                            param)
                                                    .addAnnotation(NonNull.class)
                                                    .build()));
                    return methodSpecBuilder.build();
                })
                .collect(Collectors.toList());
        TypeVariableName TypeTName = TypeVariableName.get("T");
        TypeVariableName classTypeTName = TypeVariableName.get("Class<T>");
        MethodSpec fetchClassMethod = MethodSpec.methodBuilder("fetch")
                .addParameter(ParameterSpec.builder(URI.class, "uri").build())
                .addParameter(ParameterSpec.builder(classTypeTName, "returnType").build())
                .returns(TypeVariableName.get("Mono<T>"))
                .addTypeVariable(TypeTName)
                .addCode("return fetch(uri, new ParameterizedTypeReference<>() {\n" +
                        "            @Override\n" +
                        "            public Type getType() {\n" +
                        "                return super.getType();\n" +
                        "            }\n" +
                        "        });")
                .build();
        MethodSpec fetchTypeMethod = MethodSpec.methodBuilder("fetch")
                .addParameter(ParameterSpec.builder(URI.class, "uri").build())
                .addParameter(ParameterSpec.builder(TypeVariableName.get("ParameterizedTypeReference<T>"), "returnType").build())
                .returns(TypeVariableName.get("Mono<T>"))
                .addTypeVariable(TypeTName)
                .addCode("return webClient.get()\n" +
                        "                .uri(uri)\n" +
                        "                .retrieve()\n" +
                        "                .bodyToMono(returnType);")
                .build();
        methodSpecs.addAll(List.of(fetchClassMethod, fetchTypeMethod));
        TypeSpec.Builder classBuilder = TypeSpec
                .classBuilder(CLIENT_NAME + "Impl")
                .addModifiers(Modifier.PUBLIC)
                .addField(FieldSpec.builder(WebClient.class, "webClient")
                        .addModifiers(Modifier.PRIVATE, Modifier.FINAL)
                        .build())
                .addField(FieldSpec.builder(String.class, "API_BASE_PATH")
                        .addModifiers(Modifier.PRIVATE, Modifier.FINAL)
                        .initializer('"' + clientBasePath + '"')
                        .build())
                .addField(FieldSpec.builder(String.class, "API_KEY")
                        .addModifiers(Modifier.PRIVATE, Modifier.FINAL)
                        .initializer("\"your_key_here\"")
                        .build())
                .addField(FieldSpec.builder(String.class, "ACCESS_LEVEL")
                        .addModifiers(Modifier.PRIVATE, Modifier.FINAL)
                        .initializer("\"trial\"")
                        .build())
                .addField(FieldSpec.builder(String.class, "VERSION")
                        .addModifiers(Modifier.PRIVATE, Modifier.FINAL)
                        .initializer("\"v7\"")
                        .build())
                .addField(FieldSpec.builder(String.class, "LANGUAGE_CODE")
                        .addModifiers(Modifier.PRIVATE, Modifier.FINAL)
                        .initializer("\"en\"")
                        .build())
                .addAnnotation(
                        AnnotationSpec
                                .builder(Generated.class)
                                .addMember("value", "\"fanduel-model-generator\"")
                                .build())
                .addAnnotation(
                        AnnotationSpec
                                .builder(RequiredArgsConstructor.class)
                                .build());
        methodSpecs.forEach(classBuilder::addMethod);

        JavaFile javaFile = JavaFile
                .builder(basePackage + "." + packageName, classBuilder.build())
                .indent("    ")
                .build();

        try {
            if (log.isTraceEnabled()) {
                javaFile.writeTo(System.out);
            }
            Path path = Paths.get(outputDirectory);
            javaFile.writeTo(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File interfaceClassFile = new File(outputDirectory + basePackage.replaceAll("\\.", "/") + "/" + packageName + "/" + CLIENT_NAME + "Impl.class");
        if (interfaceClassFile.exists()) {
            interfaceClassFile.delete();
        }
    }

    private Set<String> findUnmatchedParams() {
        Set<String> remainingTokens = new HashSet<>();
        requestMetadataList
                .stream()
                .map(SportRadarRequestMetadata::getActionableUrl)
                .forEach(value -> {
                    int start = -1, end = -1;
                    while ((start = value.indexOf("{", start + 1)) > 0) {
                        if ((end = value.indexOf('}', start + 1)) > 0) {
                            remainingTokens.add(value.substring(start, end + 1));
                        }
                    }
                });
        return remainingTokens;
    }

    @Override
    public void print() {
        for (int index = 0; index < requestMetadataList.size(); index++) {
            System.out.print(index + " - ");
            System.out.println(requestMetadataList.get(index).toString());
        }
    }

    private void convertJsonToJavaClass(SportRadarRequestMetadata requestMetadata, String packageName)
            throws IOException {
        URL inputJsonUrl = new URL(requestMetadata.getActionableUrl());
        File outputJavaClassDirectory = new File(outputDirectory);
        packageName = basePackage + "." + packageName + "." +
                requestMetadata.getHeaderName().toLowerCase(Locale.ROOT);
        String javaClassName = requestMetadata.getHeaderName() + "Response";

        JCodeModel jcodeModel = new JCodeModel();

        GenerationConfig config = new DefaultGenerationConfig() {
            @Override
            public boolean isIncludeToString() {
                return false;
            }

            @Override
            public boolean isIncludeGetters() {
                return false;
            }

            @Override
            public boolean isIncludeSetters() {
                return false;
            }

            @Override
            public boolean isIncludeAllPropertiesConstructor() {
                return false;
            }

//            @Override
//            public boolean isIncludeAdditionalProperties() {
//                return false;
//            }

            @Override
            public boolean isIncludeHashcodeAndEquals() {
                return false;
            }

            @Override
            public SourceType getSourceType() {
                return SourceType.JSON;
            }
        };

        SchemaMapper mapper = new SchemaMapper(new RuleFactory(config, new Jackson2Annotator(config), new SchemaStore()), new SchemaGenerator());
        try {
            mapper.generate(jcodeModel, javaClassName, packageName, inputJsonUrl);
            jcodeModel.build(outputJavaClassDirectory);
        } catch (GenerationException e) {
            System.out.println(inputJsonUrl);
            e.printStackTrace();
        }
    }

    private String nameToConstant(String name) {
        return name.contains("_") ?
                CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_UNDERSCORE, name)
                : CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, name);
    }

    public String greatestCommonPrefix(String a, String b) {
        int minLength = Math.min(a.length(), b.length());
        for (int i = 0; i < minLength; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return a.substring(0, i);
            }
        }
        return a.substring(0, minLength);
    }
}

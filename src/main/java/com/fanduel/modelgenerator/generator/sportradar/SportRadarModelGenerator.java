package com.fanduel.modelgenerator.generator.sportradar;

import com.fanduel.modelgenerator.generator.ModelGenerator;
import com.fanduel.modelgenerator.utils.FileUtils;
import com.google.common.base.CaseFormat;
import com.squareup.javapoet.AnnotationSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;
import com.sun.codemodel.JCodeModel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
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
import reactor.core.publisher.Mono;

import javax.annotation.processing.Generated;
import javax.lang.model.element.Modifier;
import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
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
        List<File> allFiles = FileUtils.getAllFilesFromRootDirectory(rootDirectory);

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
        generateClientInterface(requestMetadataList, packageName);
        System.out.println("Generation completed.");
    }

    private void generateClientInterface(List<SportRadarRequestMetadata> requestMetadataList, String packageName) {
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
}

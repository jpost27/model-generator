package com.fanduel.modelgenerator.v1.generator.manual;

import com.fanduel.modelgenerator.v1.generator.ModelGenerator;
import com.google.gson.JsonParser;
import com.sun.codemodel.JCodeModel;
import lombok.Getter;
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

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@Slf4j
public class ManualModelGenerator implements ModelGenerator {

    private final String json;
    private final String requestName;
    @Getter
    private final String outputDirectory = "src/main/java/";
    @Getter
    private final String basePackage = "com.fanduel.modelgenerator.generated.manual";

    public ManualModelGenerator(String requestName) {
        this.requestName = requestName;
        try (FileInputStream fileInputStream = new FileInputStream("src/main/resources/manually_generate.json")) {
            this.json = new String(fileInputStream.readAllBytes());
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("ManualModelGenerator could not be created.");
        }
        try {
            JsonParser.parseString(json);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("Could not parse provided json {}", json);
            throw new RuntimeException("ManualModelGenerator could not be created.");
        }
    }

    @Override
    public void generate(String packageName) {
        try {
            convertJsonToJavaClass(packageName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Generation completed.");
    }

    @Override
    public void print() {
        System.out.println(requestName + ": " + json);
    }

    private void convertJsonToJavaClass(String packageName)
            throws IOException {
        File outputJavaClassDirectory = new File(outputDirectory);
        packageName = basePackage + "." + packageName + "." + requestName.toLowerCase();

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
            mapper.generate(jcodeModel, requestName + "Response", packageName, json);
            jcodeModel.build(outputJavaClassDirectory);
        } catch (GenerationException e) {
            System.out.println(json);
            e.printStackTrace();
        }
    }
}

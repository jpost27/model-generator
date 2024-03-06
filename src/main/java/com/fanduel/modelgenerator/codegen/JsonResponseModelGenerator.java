package com.fanduel.modelgenerator.codegen;

import com.fanduel.modelgenerator.collector.response.model.ResponseMetadata;
import com.fanduel.modelgenerator.v1.cleaner.PackageCleaner;
import com.sun.codemodel.JCodeModel;
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
import org.springframework.lang.NonNull;

import java.io.File;
import java.io.IOException;
import java.util.Locale;

@Slf4j
public class JsonResponseModelGenerator implements ResponseModelGenerator {

    @NonNull
    private final File generationDirectory;
    @NonNull
    private final String generatedFilesPackageName;

    @NonNull
    private final ResponseGenerationOptions options;

    public JsonResponseModelGenerator(File generationDirectory, @NonNull String generatedFilesPackageName, ResponseGenerationOptions options) {
        this.generatedFilesPackageName = generatedFilesPackageName;
        if (!generationDirectory.exists()) {
            generationDirectory.mkdir();
        }
        this.generationDirectory = generationDirectory;
        this.options = options;
    }

    @Override
    public void generateResponseModel(@NonNull ResponseMetadata responseMetadata) {
        log.info("Generating models from JSON responses.");
        try {
            convertJsonToJavaClass(responseMetadata);
            new PackageCleaner(generationDirectory.getAbsolutePath(), generatedFilesPackageName)
                    .clean(responseMetadata.requestMetadata().requestName().toLowerCase(Locale.ROOT));
        } catch (IOException e) {
            log.error("Could not generate request {}.", responseMetadata.requestMetadata().requestName());
            e.printStackTrace();
        }
    }

    private void convertJsonToJavaClass(ResponseMetadata responseMetadata)
            throws IOException {
        String requestName = responseMetadata.requestMetadata().requestName();
        String json = responseMetadata.responseString();
        String packageName = responseMetadata.requestMetadata().requestName().toLowerCase(Locale.ROOT);

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
            public boolean isIncludeAdditionalProperties() {
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

            @Override
            public String getClassNamePrefix() {
                return options.getModelPrefix() + requestName;
            }
        };

        SchemaMapper mapper = new SchemaMapper(new RuleFactory(config, new Jackson2Annotator(config), new SchemaStore()), new SchemaGenerator());
        try {
            mapper.generate(
                    jcodeModel, "Response",
                    String.join(".", generatedFilesPackageName, packageName),
                    json);
            jcodeModel.build(generationDirectory);
        } catch (GenerationException e) {
            System.out.println(json);
            e.printStackTrace();
        }
    }
}

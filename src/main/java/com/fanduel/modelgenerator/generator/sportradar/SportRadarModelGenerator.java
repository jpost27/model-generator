package com.fanduel.modelgenerator.generator.sportradar;

import com.fanduel.modelgenerator.generator.ModelGenerator;
import com.sun.codemodel.JCodeModel;
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

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;

@Slf4j
@RequiredArgsConstructor
public class SportRadarModelGenerator implements ModelGenerator {

    private final String docsUrl;
    private final List<SportRadarRequestMetadata> requestMetadataList = new LinkedList<>();

    @Override
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
//        for (int index = 0; index < 10; index++) {
            requestMetadataList.stream().forEach(requestMetadata -> {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
                try {
                    convertJsonToJavaClass(requestMetadata, packageName);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
//        }
        System.out.println("Generation completed.");
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
        File outputJavaClassDirectory = new File("src/main/java/");
        packageName = "com.fanduel.modelgenerator.generated.sportradar." +
                packageName +
                "." +
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

            @Override
            public boolean isIncludeAdditionalProperties() {
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
            mapper.generate(jcodeModel, javaClassName, packageName, inputJsonUrl);
            jcodeModel.build(outputJavaClassDirectory);
        } catch (GenerationException e) {
            System.out.println(inputJsonUrl);
            e.printStackTrace();
        }
    }
}

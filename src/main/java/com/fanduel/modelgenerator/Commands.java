package com.fanduel.modelgenerator;

import com.sun.codemodel.JCodeModel;
import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.RequiredArgsConstructor;
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
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;

@ShellComponent
@RequiredArgsConstructor
public class Commands {
    private final String[] apiBasePaths = new String[]{"https://api.sportradar.us/", "https://api.sportradar.com/"};
    private final String docsPath = "https://developer.sportradar.com/docs/read/baseball/MLB_v7";
    private final String leagueCd = "mlb";
    List<RequestMetadata> requestMetadataList = new LinkedList<>();

    @ShellMethod(value = "Show html for url.")
    public void start() {
        WebDriver webDriver = new SafariDriver();
        webDriver.get(docsPath);
        Document doc = Jsoup.parse(webDriver.getPageSource());
        webDriver.quit();
        Elements elements = doc.getElementById("main")
                .select(".better-docs-content")
                .first()
                .children();
        RequestMetadata requestMetadata = null;
        requestMetadataList.clear();
        for (Element element : elements) {
            if (element.nodeName().equals("h2")) {
                requestMetadata = new RequestMetadata().setHeaderName(element.text());
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
        requestMetadataList.removeIf(RequestMetadata::isInvalid);
        requestMetadataList.removeIf(RequestMetadata::isStreamApi);
        printUnmatchedParams();
    }

    @ShellMethod(value = "Setup webdriver.")
    private void generate() {
        requestMetadataList.forEach(requestMetadata -> {
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                convertJsonToJavaClass(
                        new URL(requestMetadata.getActionableUrl()),
                        new File("src/main/java/"),
                        "com.fanduel.modelgenerator.sportradar." +
                                leagueCd +
                                "." +
                                requestMetadata.getHeaderName().toLowerCase(Locale.ROOT),
                        requestMetadata.getHeaderName() + "Response");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    public void printUnmatchedParams() {
        Set<String> remainingTokens = new HashSet<>();
        requestMetadataList
                .stream()
                .map(RequestMetadata::getActionableUrl)
                .forEach(value -> {
                    int start = -1, end = -1;
                    while ((start = value.indexOf("{", start + 1)) > 0) {
                        if ((end = value.indexOf('}', start + 1)) > 0) {
                            remainingTokens.add(value.substring(start, end + 1));
                        }
                    }
                });
        if (!remainingTokens.isEmpty()) {
            System.out.println(remainingTokens);
        }
    }

    @ShellMethod(value = "Setup webdriver.")
    public void print() {
        requestMetadataList.forEach(requestMetadata -> {
            System.out.println(requestMetadata.toString());
        });
    }

    @ShellMethod(value = "Setup webdriver.")
    public void setup() throws URISyntaxException, IOException {
        WebDriverManager.safaridriver().setup();
        WebDriver driver = new SafariDriver();
        // Exercise
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
        String title = driver.getTitle();

        // Verify
        assert (title).contains("Selenium WebDriver");
        driver.quit();
    }

    public void convertJsonToJavaClass(URL inputJsonUrl, File outputJavaClassDirectory, String packageName, String javaClassName)
            throws IOException {
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
            System.out.println(inputJsonUrl.toString());
            e.printStackTrace();
        }
    }

}

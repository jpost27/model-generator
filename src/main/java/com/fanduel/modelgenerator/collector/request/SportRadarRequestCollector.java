package com.fanduel.modelgenerator.collector.request;

import com.fanduel.modelgenerator.cache.Cache;
import com.fanduel.modelgenerator.cache.CacheLoader;
import com.fanduel.modelgenerator.collector.request.model.RequestMetadata;
import com.fanduel.modelgenerator.collector.request.model.RequestParamMetadata;
import com.fanduel.modelgenerator.utils.UrlUtils;
import com.fanduel.modelgenerator.v1.generator.sportradar.SportRadarRequestMetadata;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.springframework.http.HttpMethod;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Slf4j
public abstract class SportRadarRequestCollector implements RequestCollector {
    private static final Map<String, String> tokenMap = Map.ofEntries(
            Map.entry("access_level", "trial"),
            Map.entry("version", "v7"),
            Map.entry("language_code", "en"),
            Map.entry("year", String.valueOf(LocalDateTime.now().getYear() - 1)),
            Map.entry("month", String.valueOf(LocalDateTime.now().getMonthValue())),
            Map.entry("day", String.valueOf(LocalDateTime.now().getDayOfMonth())),
            Map.entry("your_api_key", "using_caching_gateway"),
            Map.entry("format", "json")
    );
    private static final String[] apiBasePaths = new String[]{
            "https://api.sportradar.us/",
            "https://api.sportradar.com/"
    };

    @Override
    public List<RequestMetadata> getRequests() {
        String docsUrl = getSportRadarDocsUrl();
        List<RequestMetadata> requestMetadataList = new ArrayList<>();

        // scrub docs for request metadata
        String docString =
                CacheLoader.loadOrFetch(Cache.DOCUMENTATION_HTML, docsUrl, new TypeReference<>(){},
                        (d) -> getDocumentationHtml(docsUrl));
        Document doc = Jsoup.parse(docString);

        Elements elements = doc.getElementById("main")
                .select(".better-docs-content")
                .first()
                .children();
        SportRadarRequestMetadata requestMetadata = null;
        requestMetadataList.clear();
        for (Element element : elements) {
            if (element.nodeName().equals("h2")) {
                if (requestMetadata != null) {
                    if (!requestMetadata.isInvalid() && !requestMetadata.isStreamApi()) {
                        requestMetadataList.add(requestMetadataFromSRMetadata(requestMetadata));
                    }
                }
                requestMetadata = new SportRadarRequestMetadata().setHeaderName(element.text());
            } else if (element.nodeName().equals("pre") && !element.select(".language-shell").isEmpty()) {
                element = element.selectFirst(".shell");
                if (element != null) {
                    requestMetadata.setSampleUrl(element.text().replace("f45963f1-0379-45da-9e2b-c6a099910a35", "f2c07e82-71e8-4c76-962b-3a7739a11626"));
                }
            } else if (element.nodeName().equals("p") && requestMetadata != null && !element.select("code").isEmpty()) {
                requestMetadata.setVariableUrl(element.text());
            }
        }
        if (requestMetadata != null && !requestMetadata.isInvalid() && requestMetadata.isStreamApi()) {
            requestMetadataList.add(requestMetadataFromSRMetadata(requestMetadata));
        }

        Set<String> remainingTokens = findUnmatchedParams(requestMetadataList);
        if (!remainingTokens.isEmpty()) {
            log.warn("{} path variables could not be filled.", remainingTokens.size());
            System.out.println(remainingTokens);
        }

        System.out.println("Request data collected: " + requestMetadataList.toString().replaceAll("RequestMetadata\\[", System.lineSeparator()));

        // return request metadata
        return requestMetadataList;
    }

    private String getDocumentationHtml(String docsUrl) {
//        WebDriverManager.safaridriver().setup();
        WebDriver webDriver = null;
        for (int retries = 2; retries > 0; retries--) {
            try {
                webDriver = new SafariDriver();
            } catch (SessionNotCreatedException e) {
                log.error(e.getMessage());
                log.warn("If there is an instance of Safari open, please close it.");
            } catch (Exception e) {
                e.printStackTrace();
                try {
                    Thread.sleep(200);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }
        if (webDriver == null) {
            throw new RuntimeException("Web Driver could not be initialized.");
        }
        webDriver.get(docsUrl);
        String html = webDriver.getPageSource();
        webDriver.quit();
        return html;
    }

    private RequestMetadata requestMetadataFromSRMetadata(SportRadarRequestMetadata requestMetadata) {
        return new RequestMetadata(
                requestMetadata.getHeaderName(),
                HttpMethod.GET,
                requestMetadata.getActionableUrl(),
                requestMetadata.getVariableUrl(),
                UrlUtils.getRequestParamsNames(requestMetadata.getVariableUrl())
                        .stream()
                        .map(param -> new RequestParamMetadata(
                                param,
                                true,
                                null
                        ))
                        .collect(Collectors.toSet()),
                null
        );
    }

    private Set<String> findUnmatchedParams(List<RequestMetadata> requestMetadataList) {
        Set<String> remainingTokens = new HashSet<>();
        requestMetadataList
                .stream()
                .map(RequestMetadata::exampleUrl)
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

    protected abstract String getSportRadarDocsUrl();
}

package com.fanduel.modelgenerator.v1.generator.sportradar;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.web.util.UriComponentsBuilder;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

@Data
@Accessors(chain = true)
public class SportRadarRequestMetadata {

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
    private static final String[] apiBasePaths = new String[] {
            "https://api.sportradar.us/",
            "https://api.sportradar.com/"
    };

    private String headerName;
    private String sampleUrl;
    private String variableUrl;

    public SportRadarRequestMetadata setHeaderName(String headerName) {
        this.headerName = parseHeader(headerName);
        return this;
    }

    public SportRadarRequestMetadata setSampleUrl(String sampleUrl) {
        sampleUrl = getUrl(sampleUrl);
        if (sampleUrl != null) {
            this.sampleUrl = sampleUrl;
        }
        return this;
    }

    public SportRadarRequestMetadata setVariableUrl(String variableUrl) {
        variableUrl = getUrl(variableUrl);
        if (variableUrl != null) {
            this.variableUrl = variableUrl;
        }
        return this;
    }

    private String getUrl(String text) {
        for (String apiBasePath : apiBasePaths) {
            if (text.contains(apiBasePath)) {
                int end = text.indexOf("\"", text.indexOf(apiBasePath));
                return text.substring(text.indexOf(apiBasePath), end == -1 ? text.length() : end);
            }
        }
        return null;
    }

    public boolean isInvalid() {
        return headerName == null || (sampleUrl == null && variableUrl == null);
    }

    public boolean isStreamApi() {
        return getActionableUrl().contains("/stream/");
    }

    public String getActionableUrl() {
        if (this.sampleUrl != null) {
            return parseUrl(this.sampleUrl);
        } else if (this.variableUrl != null) {
            return parseUrl(this.variableUrl);
        }
        return null;
    }

    public List<String> getPathParams() {
        String[] urlArr = variableUrl.split("[?]", 2);
        return Arrays.stream(urlArr[0].split("/"))
                .filter(path -> path.startsWith("{") && path.endsWith("}"))
                .map(path -> path.substring(1, path.length() - 1))
                .collect(Collectors.toList());
    }

    public String parseHeader(String key) {
        String[] keyTokens = key.split("[()\\s+\\-]");
        for (int index = 0; index < keyTokens.length; index++) {
            if (keyTokens[index].length() > 0) {
                keyTokens[index] = Character.toUpperCase(keyTokens[index].charAt(0)) +
                        (keyTokens[index].length() > 1 ? keyTokens[index].substring(1).toLowerCase(Locale.ROOT) : "");
            }
        }
        key = String.join("", keyTokens);
        return key;
    }

    private String parseUrl(String value) {
        for (Map.Entry<String, String> entry : tokenMap.entrySet()) {
            value = value.replaceAll("\\{" + entry.getKey() + "}", entry.getValue());
        }
        value = value.replaceAll(".xml", ".json");

//        for (String apiBasePath : apiBasePaths) {
//            value = value.replaceFirst(apiBasePath, "https://goalpost-gateway.int.use1.pdm-dev.com/sr/");
//        }

        return UriComponentsBuilder.fromUriString(value)
//                .replaceQueryParam("api_key", "z8dmcnupptpbjyan547bxerk") // NFL
//                .replaceQueryParam("api_key", "mjjhsep635gjpy847paxhvjm") // NBA
                .replaceQueryParam("api_key", "48fmbxmtyguc6camc8zey2na") // GOLF
                .toUriString();
    }

    @Override
    public String toString() {
        return "RequestMetadata{" +
                "headerName='" + headerName + '\'' +
                ", sampleUrl='" + sampleUrl + '\'' +
                ", variableUrl='" + variableUrl + '\'' +
                ", actionableUrl='" + this.getActionableUrl() + '\'' +
                '}';
    }
}

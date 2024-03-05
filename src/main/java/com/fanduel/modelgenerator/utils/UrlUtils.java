package com.fanduel.modelgenerator.utils;

import com.fanduel.modelgenerator.collector.request.model.RequestMetadata;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class UrlUtils {

    public static List<String> getPathVariableNames(String variableUrl) {
        String url = variableUrl.contains("?") ?
                variableUrl.substring(0, variableUrl.indexOf("?")) : variableUrl;
        return extractVariables(url, '{', '}');
    }

    public static List<String> getPathSegments(String variableUrl) {
        return UriComponentsBuilder.fromUriString(variableUrl)
                .build()
                .getPathSegments();
    }

    public static List<String> getRequestParamsNames(String variableUrl) {
        String url = variableUrl.contains("?") ?
                variableUrl.substring(variableUrl.indexOf("?")) : "";
        return extractVariables(url, '{', '}');
    }

    private static List<String> extractVariables(String string, char variableStartToken, char variableEndToken) {
        LinkedList<String> variables = new LinkedList<>();
        Integer indexOfOpenBracket = null;
        for (int index = 0; index < string.length(); index++) {
            if (string.charAt(index) == variableStartToken && indexOfOpenBracket == null) {
                indexOfOpenBracket = index;
            } else if (string.charAt(index) == variableEndToken
                    && indexOfOpenBracket != null) {
                if (index - indexOfOpenBracket > 1) {
                    variables.addLast(string.substring(indexOfOpenBracket + 1, index));
                }
                indexOfOpenBracket = null;
            }
        }
        return variables;
    }

    public static String getClientCommonBasePathFromUrls(List<String> urls) {
        return urls.stream()
                .map(url -> Optional.ofNullable(url).orElse(""))
                .map(url -> url.contains("{") ? url.substring(0, url.indexOf("{")) : url)
                .reduce(StringUtils::greatestCommonPrefix)
                .orElse("");
    }

    public static String replaceApiKey(String url, String replacement) {
        return UriComponentsBuilder.fromUriString(url)
                .replaceQueryParam("api_key", replacement)
                .build()
                .toUriString();
    }
}

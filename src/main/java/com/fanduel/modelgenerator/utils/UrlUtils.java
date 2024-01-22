package com.fanduel.modelgenerator.utils;

import java.util.LinkedList;
import java.util.List;

public class UrlUtils {

    public static List<String> getPathVariableNames(String variableUrl) {
        String url = variableUrl.contains("?") ?
                variableUrl.substring(0, variableUrl.indexOf("?")) : variableUrl;
        return extractVariables(url, '{', '}');
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

}

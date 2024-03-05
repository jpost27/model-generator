package com.fanduel.modelgenerator.utils;

public class StringUtils {

    public static String greatestCommonPrefix(String a, String b) {
        int minLength = Math.min(a.length(), b.length());
        for (int i = 0; i < minLength; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return a.substring(0, i);
            }
        }
        return a.substring(0, minLength);
    }

    public static String convertToPascalCase(String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }
}

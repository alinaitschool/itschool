package com.github.alina.session_6_java_core_api.challenge;

/*
String Replacement
Description: Use the StringBuilder class to replace every occurrence of a substring within a given string with another substring.
 For instance, replace "cat" with "dog" in the string "The cat sat on the mat."
 */
public class Exercise_06 {
    public static void main(String[] args) {
        String input = "The cat sat on the mat cat.";
        String beReplace = "cat";
        String toReplace = "dog";
        System.out.println(replace(input, beReplace, toReplace));
    }
    public static String replace(String input, String beReplace, String toReplace) {
        StringBuilder builder = new StringBuilder();
        if (input.contains(beReplace)) {
            String[] substrigs = input.split(beReplace);
            for (int i = 0; i < substrigs.length; i++) {
                builder.append(substrigs[i]);
                if (i != substrigs.length - 1)
                    builder.append(toReplace);
            }
        }
        return builder.toString();
    }
}

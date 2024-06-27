package com.github.alina.session_6_java_core_api.challenge;

import java.util.Arrays;
import java.util.List;

//concatenate Multiple Strings
//Description: Given a list of strings, use StringBuilder to concatenate them into a single string efficiently.
public class Exercise_3 {
    public static void main(String[] args) {
        String[] a = new String[]{"Hello", " ", "world", "!", " How", " are", " you?"};
        List<String> strings = Arrays.asList(a);
        System.out.println(getConcatenatedStrings(strings));
    }

    public static String getConcatenatedStrings(List<String> strings) {
        StringBuilder sb = new StringBuilder();
        for (String str : strings) {
            sb.append(str);
        }
        return sb.toString();
    }
}

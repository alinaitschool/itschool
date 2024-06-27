package com.github.alina.session_6_java_core_api.challenge;

/*
Word Capitalizer
Description: Write a program that capitalizes the first letter of every word in a sentence using the StringBuilder class.
 */
public class Exercise_5 {
    public static void main(String[] args) {
        String result = capitalize("Nu stiu Java si n-am sa invat niciodata");
        System.out.println(result);
    }

    public static String capitalize(String input) {
        StringBuilder builder = new StringBuilder();
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            builder.append(words[i].substring(0, 1).toUpperCase());
            builder.append(words[i].substring(1));
            builder.append(" ");
        }
        return builder.toString();
    }
}
/*
public class WordCapitalizer {
    public static void main(String[] args) {
        String sentence = "this is a test sentence to capitalize.";
        String capitalizedSentence = capitalizeWords(sentence);
        System.out.println(capitalizedSentence);
    }

    public static String capitalizeWords(String sentence) {
        StringBuilder result = new StringBuilder(sentence.length());
        boolean capitalizeNext = true;

        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);

            if (Character.isWhitespace(currentChar)) {
                capitalizeNext = true;
            } else if (capitalizeNext) {
                currentChar = Character.toUpperCase(currentChar);
                capitalizeNext = false;
            }

            result.append(currentChar);
        }

        return result.toString();
    }
}
 */
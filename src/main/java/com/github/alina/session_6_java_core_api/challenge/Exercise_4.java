package com.github.alina.session_6_java_core_api.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Removing Vowels
Description: Create a Java program that uses the StringBuilder class to remove all the vowels from an input string. */
public class Exercise_4 {
    public static void main(String[] args) {
        String string = "alinEalOnaAlinUakaIIIiimoTfYeiadgshajkle";
        String noVovels = removeVovels(string);
        System.out.println(noVovels);
    }

    public static String removeVovels(String string) {
        StringBuilder str = new StringBuilder();
        List<String> vowels = Arrays.asList("a", "A", "i", "I", "U", "u", "o", "O", "E", "e", "Y", "y");
        for (int i = 0; i < string.length(); i++) {
            if (!vowels.contains(String.valueOf(string.charAt(i)))) {
                str.append(string.charAt(i));
            }
        }
        return str.toString();
    }
}

/*
public class RemoveVowels {
    public static void main(String[] args) {
        String input = "Hello, World!";
        String result = removeVowels(input);
        System.out.println("Original String: " + input);
        System.out.println("String without vowels: " + result);
    }

    public static String removeVowels(String input) {
        String vowels = "AEIOUaeiou";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i); //returneaza caracterul la pozitia i
            if (vowels.indexOf(currentChar) == -1) {  // If the current character is not a vowel
                result.append(currentChar);
            }
        }

        return result.toString();
    }
}
*/
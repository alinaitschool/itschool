package com.github.alina.session_6_java_core_api.challenge;

/*
2. Palindrome Checker
Description: Write a program that checks whether a given string is a palindrome using the StringBuilder class.
 A palindrome is a word, phrase, number, or other sequences of characters that reads the same forward and backward.
 */
public class Exercise_2 {
    public static void main(String[] args) {
        StringBuilder string = new StringBuilder("Alina");
        StringBuilder stringReverse = new StringBuilder(string).reverse();
        if (string.toString().equalsIgnoreCase(stringReverse.toString())) {
            System.out.println("Is a palidrom");
        } else {
            System.out.println("false");
        }
    }
}

/*
public class PalindromeChecker {
    public static boolean isPalindrome(String input) {
         Create a StringBuilder with the input string
        StringBuilder original = new StringBuilder(input);
         Reverse the contents of the StringBuilder
        StringBuilder reversed = new StringBuilder(input).reverse();
        Compare the reversed string with the original string
        return original.toString().equals(reversed.toString());
    }
    public static void main(String[] args) {
        // Test cases
        String[] testStrings = {"madam", "racecar", "hello", "level", "world"};
        for (String s : testStrings) {
            if (isPalindrome(s)) {
                System.out.println(s + " is a palindrome.");
            } else {
                System.out.println(s + " is not a palindrome.");
            }
        }
    }
}
 */

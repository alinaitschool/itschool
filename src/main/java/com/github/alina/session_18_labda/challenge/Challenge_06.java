package com.github.alina.session_18_labda.challenge;

import java.util.Scanner;

//Create a functional interface with a method that takes two strings as input and returns an integer.
// Implement this interface using a lambda expression to create a custom comparator that
// compares strings based on their length (not lexicographically).
public class Challenge_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce a string");
        String str1 = scanner.nextLine();
        System.out.println("Introduce a string");
        String str2 = scanner.nextLine();
        TheShortestString result = (s1, s2) -> Integer.valueOf(str1.length()).compareTo(Integer.valueOf(str2.length()));
        System.out.println(result.shortestString(str1, str2));
    }
}

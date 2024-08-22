package com.github.alina.session_18_labda.challenge.challenge_07;

//Create a functional interface that takes a string and an integer  n as parameters and returns a string. Implement it using a lambda expression that returns the first n characters of the string.
// If n is larger than the length of the string, it should return the full string.
public class Main {
    public static void main(String[] args) {
        StringLengthChecker result = ((str, n) -> {
            if (n > str.length()) {
                return str;
            }
            return str.substring(0, n);
        });
        System.out.println(result.checkLength("alina", 2));
    }
}

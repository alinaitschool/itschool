package com.github.alina.session_18_labda.practice;

public class IntMultiplyPractice {
    public static void main(String[] args) {
        IntMultiply result = (a, b) -> a * b;
        System.out.println(result.multiply(2, 3));
    }
}
package com.github.alina.session_4.challenge;

//Write a Java program where you use unary operators to perform a series of transformations on an integer variable number initialized to 50. First, negate number, then take the absolute value, and finally increment it by 1. Print the result at each step.
public class Challenge16 {
    public static void main(String[] args) {
        int number = 50;
        int negatedNumber = -number;
        System.out.println("Negated number: " + negatedNumber);
        int absoluteValue = Math.abs(negatedNumber);
        System.out.println("Absolute value: " + absoluteValue);
        int incrementedValue = ++absoluteValue;
        System.out.println("Incremented value: " + incrementedValue);
    }
}

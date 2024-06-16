package com.github.alina.sesion4_challenge;
//Write a Java program where you use unary operators to perform a series of transformations on an integer variable number initialized to 50. First, negate number, then take the absolute value, and finally increment it by 1. Print the result at each step.
public class ChallengeSixteen {
    public static void main(String[] args) {
        int number = 50;

        // Negate number using unary minus operator
        int negatedNumber = -number;
        System.out.println("Negated number: " + negatedNumber);

        // Take the absolute value using Math.abs() method
        int absoluteValue = Math.abs(negatedNumber);
        System.out.println("Absolute value: " + absoluteValue);

        // Increment the absolute value by 1 using unary increment operator
        int incrementedValue = ++absoluteValue;
        System.out.println("Incremented value: " + incrementedValue);
    }
}

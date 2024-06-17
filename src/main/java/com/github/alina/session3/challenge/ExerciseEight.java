package com.github.alina.session3.challenge;
//8. Create a program that takes two byte values, adds them together, and stores the result in a byte variable.
public class ExerciseEight {
    public static void main(String[] args) {
        byte firstByte = 10;
        byte secondByte = 20;

        // Adding two byte values
        int sum = firstByte + secondByte;

        // Casting the result back to byte
        byte result = (byte) sum;

        // Displaying the result
        System.out.println("The sum of " + firstByte + " and " + secondByte + " is: " + result);
    }
}

//Working with byte values in Java the arithmetic operations promote the result to an int by default. It's need explicitly cast the result back to a byte.

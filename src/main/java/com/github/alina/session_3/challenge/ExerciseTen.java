package com.github.alina.session_3.challenge;

import java.util.Scanner;

//10. Write a program that reverses the sign of an entered integer using unary minus operator.
public class ExerciseTen {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int inputNumber = scanner.nextInt();

        // Reverse the sign of the entered integer
        int reversedSignNumber = -inputNumber;

        // Display the result
        System.out.println("Original value: " + inputNumber);
        System.out.println("Value with reversed sign: " + reversedSignNumber);

        // Close the scanner
        scanner.close();
    }
}

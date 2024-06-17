package com.github.alina.session3.challenge;

import java.util.Scanner;

public class ExerciseFourteen {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is within the range 1-100
        if (number >= 1 && number <= 100) {
            System.out.println("The number " + number + " is within the range of 1 to 100.");
        } else {
            System.out.println("The number " + number + " is NOT within the range of 1 to 100.");
        }

        // Close the scanner
        scanner.close();
    }
}

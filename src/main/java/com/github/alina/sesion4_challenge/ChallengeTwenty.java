package com.github.alina.sesion4_challenge;

import java.util.Scanner;

//Write a Java program that takes an integer variable age as input. Use a ternary operator to classify the person into one of the following categories: "Child" (age < 12), "Teenager" (age between 12 and 17), "Adult" (age between 18 and 64), and "Senior" (age 65 and above). Print the resulting classification.
public class ChallengeTwenty {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Classify the age using ternary operator
        String classification = (age < 12) ? "Child"
                : (age >= 12 && age <= 17) ? "Teenager"
                : (age >= 18 && age <= 64) ? "Adult" : "Senior";

        // Print the resulting classification
        System.out.println("You are classified as: " + classification);

        // Close the scanner
        scanner.close();
    }
}

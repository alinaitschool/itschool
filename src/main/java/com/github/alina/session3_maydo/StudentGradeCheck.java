package com.github.alina.session3_maydo;

import java.util.Scanner;
//Write a Java program to check if a student has passed or failed an exam. Given the student's score score, if the score is 50 or above, print "Passed", otherwise print "Failed".
public class StudentGradeCheck {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the student to enter their score
        System.out.print("Enter the student's score: ");
        int score = scanner.nextInt();

        // Check if the student has passed or failed
        if (score >= 50) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

        // Close the scanner
        scanner.close();
    }
}

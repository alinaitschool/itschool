package com.github.alina.sesion4.challenge;

import java.util.Scanner;

/*21. Write a Java program that takes a double variable score representing a student’s score on a test. Use a ternary operator to classify the score into letter grades A, B, C, D, or F according to the following scale:
A: 90-100
B: 80-89
C: 70-79
D: 60-69
F: 0-59 */
public class Challenge22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the student's score: ");
        double score = scanner.nextDouble();
        String grade = (score >= 90) ?
                "A" : (score >= 80) ?
                "B" : (score >= 70) ?
                "C" : (score >= 60) ?
                "D" : "F";
        System.out.println("The student's grade is: " + grade);
        scanner.close();
    }
}

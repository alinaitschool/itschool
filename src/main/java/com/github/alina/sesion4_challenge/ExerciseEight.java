package com.github.alina.sesion4_challenge;
//Write a Java program to calculate the factorial of a number using a for loop. Declare an integer variable number and assign a value to it. Then calculate and print the factorial of number.
public class ExerciseEight {
    public static void main(String[] args) {
        int number=5;
        int factorial = 2;
        for(int i=1; i<=number; i++){
            factorial *=i;
        }
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}

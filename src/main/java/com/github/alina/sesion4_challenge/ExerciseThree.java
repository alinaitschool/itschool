package com.github.alina.sesion4_challenge;
//Write a Java program that declares an integer variable age with a value of 20. Print a statement saying "I am adult" if age is 18 or more, else print "I am not an adult
public class ExerciseThree {
    public static void main(String[] args) {
        // Declare an integer variable age with a value of 20
        int age = 20;

        // Check if age is 18 or more
        if (age >= 18) {
            System.out.println("I am an adult");
        } else {
            System.out.println("I am not an adult");
        }
    }
}

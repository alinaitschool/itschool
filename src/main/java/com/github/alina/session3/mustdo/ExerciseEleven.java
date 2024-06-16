package com.github.alina.session3.mustdo;

import java.util.Scanner;

//11. Write a Java program that takes two boolean inputs from a user. Apply the logical negation operator (!) to each and print the result.
public class ExerciseEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce the first boolean: true ");
        boolean firstBoolean = scanner.nextBoolean();
        System.out.println("Introduce the second boolean: false ");
        boolean secondBoolean = scanner.nextBoolean();

       System.out.println("True became " + !firstBoolean);
        System.out.println("False became " + !secondBoolean);
        scanner.close();
    }
}

package com.github.alina.session_3.challenge;

import java.util.Scanner;

//12. Create a program that takes an integer as input and then increments and decrements it by 1, displaying the output at each stage.
public class ExerciseTwelve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        int number = scanner.nextInt();
        System.out.println("Display the original -> " + number);
        number++;
        System.out.println("Display the incremented number by 1 -> " + number);
        number--;
        System.out.println("Display the decremented number -> " + number);
        number--;
        System.out.println("Display the decremented number by 1 again -> " + number);
        scanner.close();
    }
}

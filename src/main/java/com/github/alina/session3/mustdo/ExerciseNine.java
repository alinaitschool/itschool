package com.github.alina.session3.mustdo;
//9. Write a program that calculates the area of a rectangle. Take the length and width as inputs.

import java.util.Scanner;

public class ExerciseNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce the length");
        double length = scanner.nextDouble();
        System.out.println("Introduce the width");
        double width= scanner.nextDouble();
        double rectangleArea = length*width;
        System.out.println("The arrea of an rectangle is" +rectangleArea);
        scanner.close();
    }
}
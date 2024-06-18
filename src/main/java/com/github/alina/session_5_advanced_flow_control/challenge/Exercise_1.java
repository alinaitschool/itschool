package com.github.alina.session_5_advanced_flow_control.challenge;
//Write a Java program that takes an integer as input. If the number is even, print "Even". If it's odd, print "Odd".

import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce a number");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }
}

package com.github.alina.session_5_advanced_flow_control.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//Write a program that asks the user to enter numbers. The program should continue prompting the user until they enter -1. After they enter -1, print the sum of all numbers entered (excluding -1).
public class Exercise_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number");
        int number = scanner.nextInt();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        while (number >= 0) {
            System.out.println("Input a number");
           number = scanner.nextInt();
            numbers.add(number);
        }
        System.out.println("Numbers is" + numbers);
    }
}

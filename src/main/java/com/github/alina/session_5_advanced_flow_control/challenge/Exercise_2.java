package com.github.alina.session_5_advanced_flow_control.challenge;

import java.util.Scanner;

/* 2. Month Name Finder
Write a program that asks the user to enter a number between 1 and 12. Print the name of the corresponding month or "Invalid Month" if out of range.
*/
public class Exercise_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce a number");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
            case 9:
                System.out.println("September");
            case 10:
                System.out.println("Octomber");
            case 11:
                System.out.println("November");
            case 12:
                System.out.println("December");
            default:
                System.out.println("This month doesn't exist");
        }
    }
}

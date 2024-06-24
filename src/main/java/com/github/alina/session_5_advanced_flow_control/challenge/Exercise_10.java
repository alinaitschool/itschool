package com.github.alina.session_5_advanced_flow_control.challenge;
/*
10. Jump Statements
Create a menu-driven program where the user is presented with options:
Print "Hello World"
Print the user's name.
Exit.
Based on the user's input, perform the necessary action. Once an action is completed, show the menu again, unless the user chooses the Exit option. Use jump statements to control the flow of the program.
 */

import java.util.Scanner;

public class Exercise_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("Menu: ");
            System.out.println("1. Print \"Hello World\"");
            System.out.println("2. Print your name");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Hello World");
                    break;
                case 2:
                    System.out.print("Enter your name: ");
                    String name = scanner.nextLine();
                    System.out.println("Hello, " + name);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            if (choice == 3) {
                break;
            }
        }
        scanner.close();
    }
}


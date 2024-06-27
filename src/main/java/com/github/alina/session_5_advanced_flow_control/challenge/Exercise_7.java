package com.github.alina.session_5_advanced_flow_control.challenge;

import java.util.Scanner;

/* Do-While Loop
//Create a program where the user is prompted to guess a predefined number. After each guess, the program should inform the user if the guess is too high or too low. The program should keep prompting the user until they guess correctly. Using a do-while loop, ensure the user is always asked at least once.
*/
public class Exercise_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number");
        int predefinedNumber = 5;
        int number;

        do {
            number = scanner.nextInt();
            if (predefinedNumber != number) {
                System.out.println("Is not the predefinit number! Keep input number");
                // predefinedNumber=5;
            }
        } while (predefinedNumber != number);
        System.out.println("You quessed the predefined number");
        scanner.close();
    }
}

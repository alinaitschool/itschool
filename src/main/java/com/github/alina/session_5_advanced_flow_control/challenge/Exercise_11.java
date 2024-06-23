package com.github.alina.session_5_advanced_flow_control.challenge;

import java.util.Scanner;

/*11. Break Statement
Write a program that prompts the user to enter numbers. Calculate the average of these numbers. If the user enters 0, break out of the input loop and then print the average of the numbers entered so far.
*/
public class Exercise_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number");
        int number = scanner.nextInt();
        int count = 0;
        int total =0;
        while(number>0){
            count++;
            total =  total+number;
            number = scanner.nextInt();
        }
        int average = total/count;
        System.out.println(average);
        scanner.close();
    }
}

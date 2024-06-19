package com.github.alina.session_5_advanced_flow_control.challenge;

import java.util.Scanner;

public class Exercise_12 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int total =0;
        System.out.println("Please enter 10 numbers:");
        for(int i=0; i<10; i++){
            System.out.println("Enter a number " + (i+1) + ":") ;
            int number = scanner.nextInt();
            if(number<=5){
                continue;
            }
            total +=number;
        }
        System.out.println("Total of numbers is: " + total);
        scanner.close();
    }
}

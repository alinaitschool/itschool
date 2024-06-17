package com.github.alina.session3.challenge;

import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Input a number to check is positive or negative");
        int number = scanner.nextInt();
        if(number>=0){
            System.out.println("Number is positive");
        }else{
            System.out.println("Number is negative");
        }
        scanner.close();
    }
}

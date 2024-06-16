package com.github.alina.session3.mustdo;

import java.util.Scanner;

public class ExerciseSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Input the second number");
        int secondNumber= scanner.nextInt();
        if(firstNumber>secondNumber){
            System.out.println("First number is greater than second number " + firstNumber + "> " + secondNumber);
        }else if(firstNumber<secondNumber){
            System.out.println("First number is smaller than second number " + firstNumber+ " <" +secondNumber);
        }else{
            System.out.println("Both number are equal" + firstNumber + "==" +secondNumber);
        }
        scanner.close();
    }
}

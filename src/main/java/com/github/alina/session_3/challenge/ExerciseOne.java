package com.github.alina.session_3.challenge;

import java.util.Scanner;

public class ExerciseOne {
    // 1. Write a Java program to take two numbers as input and display the result of addition, subtraction, multiplication, division, and modulus.
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, input a number  ");
        double number1 = scanner.nextInt();
        System.out.print("Please, input a second number  ");
        double number2= scanner.nextInt();

        double addition = number1+number2;
        double multiplication = number1*number2;
        double subtraction = number2-number1;
        double division = number2/number1;
        double modulus = number2%number1;
       System.out.println("Addition" +addition);
       System.out.println("Subtraction" +subtraction);
       System.out.println("Multiplication" +multiplication);
       System.out.println("Division" +division);
       System.out.println("Modulus" + modulus);
       scanner.close();

    }
}

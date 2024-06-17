package com.github.alina.sesion4.challenge;

//Write a Java program to print the numbers from 1 to 10 using a for loop. As a next step, modify your program to print only the even numbers from 1 to 10.
public class Challenge5 {
    public static void main(String[] args) {
        System.out.println("Printing numbers from 1 to 10:");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " i");
        }
        System.out.println();
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }
    }
}



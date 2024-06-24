package com.github.alina.session_5_advanced_flow_control.challenge;
//Write a program that prints the first 10 numbers in the Fibonacci series. Use a for loop to accomplish this.

import java.util.Arrays;
public class Exercise_8 {
    public static void main(String[] args) {
        int number = 10;
        System.out.println(Arrays.toString(getFibonaciArray(number)));
    }
    public static int[] getFibonaciArray(int number) {
        int[] fibonaciNumbers = new int[number];
        if (number >= 0) {
            fibonaciNumbers[0] = 0;
            fibonaciNumbers[1] = 1;
            for (int i = 2; i < number; i++) {
                fibonaciNumbers[i] = fibonaciNumbers[i - 1] + fibonaciNumbers[i - 2];
            }
        }
        return fibonaciNumbers;
    }
}


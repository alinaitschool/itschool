package com.github.alina.session_5_advanced_flow_control.challenge;

//Given an array of integers, write a program to count and print the number of negative integers in the array.
public class Exercise_3 {
    public static void main(String[] args) {
        int[] myArray = {1, -1, 4, -6, -7, 67, 9};
        int count = findNegative(myArray);
        System.out.println(count);
    }

    public static int findNegative(int[] myArray) {
        int count = 0;
        for (int index = 0; index < myArray.length; index++) {
            if (myArray[index] < 0) {
                count++;
            }
        }
        return count;
    }
}
package com.github.alina.sesion4.challenge;

//Write a Java program where you declare an integer array with 5 elements. Use a for loop to initialize the array such that each element is equal to its index incremented by 1. Then use another for loop to decrement each element by 1. Print the array before and after the decrement operation using a for-each loop
public class Challenge18 {
    private static final int arraySize = 5;
    public static void main(String[] args) {
        int[] array = new int[arraySize];
        for (int index = 0; index < array.length; index++) {
            array[index] = index + 1;
        }
        System.out.println("Array before decrement:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int index = 0; index < array.length; index++) {
            array[index]--;
        }
    }
}

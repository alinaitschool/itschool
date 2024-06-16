package com.github.alina.sesion4_challenge;
//Write a Java program where you declare an integer array with 5 elements. Use a for loop to initialize the array such that each element is equal to its index incremented by 1. Then use another for loop to decrement each element by 1. Print the array before and after the decrement operation using a for-each loop
public class ChallengeEighteen {
    public static void main(String[] args) {
        int[] array = new int[5];

        // Initialize the array elements using a for loop
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1; // Increment each element by 1
        }

        // Print the array before decrement operation using for-each loop
        System.out.println("Array before decrement:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Decrement each element of the array using another for loop
        for (int i = 0; i < array.length; i++) {
            array[i]--; // Decrement each element by 1
        }
    }
}

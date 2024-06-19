package com.github.alina.session_5_advanced_flow_control.challenge;

import java.util.Scanner;

public class Exercise_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a random number");
        int n = scanner.nextInt();
        int numberOfFibonaci = findFibonaciNumber(n);
        System.out.println(numberOfFibonaci);
        scanner.close();
    }
    public static int findFibonaciNumber(int n) {
        int[] fibonacci = new int[n];
        if (n >= 0) {
            System.out.println("Input a positive number");
            if (n > 0) fibonacci[0] = 0;
            if (n > 1) fibonacci[1] = 1;

            for (int i = 2; i < n; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
            System.out.print("The first " + n + " numbers of the Fibonacci series are: ");
            for (int i = 0; i < n; i++) {
                System.out.print(fibonacci[i] + " ");
            }

        }
        return fibonacci[n - 1];
    }
}

package com.github.alina.sesion4.challenge;

import java.util.Scanner;

// Write a Java program that takes three integer variables a, b, and c as input. Use nested ternary operators to find and print the largest number among the three.
public class Challenge21 {
    public class LargestNumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter three integers separated by spaces: ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int largestNumber = (a >= b) ?
                    (a >= c ? a : c)
                    : (b >= c ? b : c);
            System.out.println("The largest number among " + a + ", " + b + ", and " + c + " is: " + largestNumber);
            scanner.close();
        }
    }
}

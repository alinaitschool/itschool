package com.github.alina;

import java.util.Scanner;

public class Kata_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;

        while (number > 0) {
            int num = number % 10;
            sum += num;
            number /=10;
        }
        System.out.println(sum);
    }
}

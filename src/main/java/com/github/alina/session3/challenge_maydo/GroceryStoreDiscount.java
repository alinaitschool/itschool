package com.github.alina.session3.challenge_maydo;
//Write a Java program to apply a discount to a grocery bill. Given the original bill amount originalBill and a discount percentage discountPercent, calculate and print the final bill amount after applying the discount.
import java.util.Scanner;

public class GroceryStoreDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the original bill amount
        System.out.print("Enter the original bill amount: ");
        double originalBill = scanner.nextDouble();

        // Prompt the user to enter the discount percentage
        System.out.print("Enter the discount percentage: ");
        double discountPercent = scanner.nextDouble();

        // Calculate the discount amount
        double discountAmount = (discountPercent / 100) * originalBill;

        // Calculate the final bill amount after applying the discount
        double finalBill = originalBill - discountAmount;

        // Display the original bill, discount amount, and final bill amount
        System.out.println("Original bill amount: $" + originalBill);
        System.out.println("Discount amount: $" + discountAmount);
        System.out.println("Final bill amount after discount: $" + finalBill);

        // Close the scanner
        scanner.close();
    }
}

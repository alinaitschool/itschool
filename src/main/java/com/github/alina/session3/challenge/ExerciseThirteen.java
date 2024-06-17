package com.github.alina.session3.challenge;

import java.util.Scanner;

// Write a program to calculate the price after discount. Take the original price and discount percentage as input. Use compound assignment operator to perform the calculation.
public class ExerciseThirteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the original price: ");
        double originalPrice = scanner.nextDouble();
        System.out.println("Enter the discount percentage %: ");
        double discountPercentage = scanner.nextDouble();
        //Calculate the discount amount
        double discountAmount = (discountPercentage/100) *originalPrice;
        //calculate princeAfterDiscount
        double priceAfterDiscount = originalPrice - discountAmount;
      System.out.println("Original price: $" + originalPrice);
      System.out.println("Discount percentage: $" + discountPercentage);
      System.out.println("Discount amount: $ " +discountAmount);
      System.out.println("Price after discount is $: " +priceAfterDiscount);
      scanner.close();
    }

}

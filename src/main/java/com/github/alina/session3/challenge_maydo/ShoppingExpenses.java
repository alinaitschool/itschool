package com.github.alina.session3.challenge_maydo;

import java.util.Scanner;

public class ShoppingExpenses {
    //Write a Java program to calculate the total cost and change you get back when buying items. Given the price of an item price and the quantity quantity, calculate the total cost. Assume you paid with a bill of 100. Print the total cost and the change you receive.
    public static void main(String[] args) {
        double itemPrice = 25.50;
        int quantity=0 ;
        double moneyForSpending= 100;
        Scanner scaner = new Scanner(System.in);
        System.out.println("Introduce how many products you want to buy ");
        quantity = scaner.nextInt();
        double totalCost= (itemPrice * quantity);
        double change=moneyForSpending-totalCost;
        if(totalCost>moneyForSpending){
            System.out.println("You don't have enough money!");
        }else {
            System.out.println("Change you receive is: " + change);
        }


    }
}

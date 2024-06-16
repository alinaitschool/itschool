package com.github.alina.sesion4_challenge;
//Write a Java program where you declare an integer variable temperature. Assign a value to it and print "Hot" if the temperature is more than 30, "Warm" if the temperature is between 20 and 30, and "Cold" if it's less than 20.
public class ExerciseSix {
    public static void main(String[] args) {
        // Declare an integer variable temperature and assign a value
        int temperature = 25;

        // Check temperature range using if-else if statements
        if (temperature > 30) {
            System.out.println("Hot");
        } else if (temperature >= 20 && temperature <= 30) {
            System.out.println("Warm");
        } else if (temperature < 20) {
            System.out.println("Cold");
        }
    }
}

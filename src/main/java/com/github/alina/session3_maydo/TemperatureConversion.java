package com.github.alina.session3_maydo;

import java.util.Scanner;

//Write a Java program to convert a temperature from Celsius to Fahrenheit. Use the formula F = (C * 9/5) + 32. Given a temperature in Celsius celsius, calculate and print the temperature in Fahrenheit.
public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduce the temperature in Celsius");
        int temperature = scanner.nextInt();
        int temperatureInCelsius = (temperature*9/5)+45;
        System.out.println("Temperature today is: " + temperatureInCelsius + " degree");
    scanner.close();
    }
}

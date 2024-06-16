package com.github.alina.sesion4_challenge;

//Write a Java program to create two String variables, countryOne with the value "USA" and countryTwo with the value "USA". Check if countryOne and countryTwo are equal using the equals() method and print the result. Then change the value of countryTwo to "UK" and check for equality again. Print the result.
public class ExerciseNine {
    public static void main(String[] args) {
        String countryOne = "USA";
        String countryTwo = "USA";

        System.out.println("Comparing countryOne and countryTwo initially:");
        System.out.println("Are they equal? " + countryOne.equals(countryTwo));

        countryTwo = "UK";

        // Check equality again after changing countryTwo
        System.out.println("\nComparing countryOne and modified countryTwo:");
        System.out.println("Are they equal now? " + countryOne.equals(countryTwo));
    }
}

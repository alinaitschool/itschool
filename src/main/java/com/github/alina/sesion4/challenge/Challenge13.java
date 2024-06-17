package com.github.alina.sesion4.challenge;

//Write a Java program where you declare two boolean variables isRaining and isSunny with values of true and false, respectively. Use the logical complement operator to negate the values of both variables and print the new values.
public class Challenge13 {
    public static void main(String[] args) {
        boolean isRaining = true;
        boolean isSunny = false;
        boolean notRaining = !isRaining;
        boolean notSunny = !isSunny;
        System.out.println("Original values:");
        System.out.println("isRaining: " + isRaining);
        System.out.println("isSunny: " + isSunny);
        System.out.println("\nNegated values:");
        System.out.println("notRaining: " + notRaining);
        System.out.println("notSunny: " + notSunny);
    }

}

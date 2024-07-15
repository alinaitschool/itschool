package com.github.alina.session_7_utillity_classes.challenge;
/*
4. Comparing User-Entered Dates
Description: Write a method named areDatesEqual that reads two dates from the console and returns true if they are equal, and false otherwise.
Input: Two dates entered by the user in the format YYYY-MM-DD.
Expected Output:
true if both dates are equal.
false if they are different.
 */

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Challenge_04 {
    public static void main(String[] args) {
        System.out.println(areDateEqual());
    }

    public static boolean areDateEqual() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce the first date in the format (YYYY-MM-DD): ");
        String date1 = scanner.nextLine();
        System.out.println("Introduce the second date in the format (YYYY-MM-DD): ");
        String date2 = scanner.nextLine();
        scanner.close();
        return date1.equalsIgnoreCase(date2);
    }
}

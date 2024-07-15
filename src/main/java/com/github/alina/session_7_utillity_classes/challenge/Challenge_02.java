package com.github.alina.session_7_utillity_classes.challenge;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/*

2. Date Decomposition
Description: Write a method named displayDateComponents that accepts a date as an argument and prints its year, month, and day components separately.
Input: A date in the format YYYY-MM-DD.
Expected Output:
makefile
Copy code
Year: YYYY
Month: MM
Day: DD

 */
public class Challenge_02 {
    public static void displayDateComponents(String dateStr) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate date = LocalDate.parse(dateStr, formatter);
            int year = date.getYear();
            int month = date.getMonthValue();
            int day = date.getDayOfMonth();
            System.out.println("Year: " + year);
            System.out.println("Month: " + month);
            System.out.println("Day: " + day);
        } catch (DateTimeException e) {
            System.out.println("Invalid date format. Please use YYYY-MM-DD." + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Test the method with a sample date
        displayDateComponents("2024-07-06");
    }
}

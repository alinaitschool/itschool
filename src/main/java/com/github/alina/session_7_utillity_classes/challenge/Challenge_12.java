package com.github.alina.session_7_utillity_classes.challenge;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

/*
12. Time Conversion Across Zones
Description: Develop a method named convertToTimeZone that collects a date and time from the console in the pattern YYYY-MM-DD HH:MM:SS and a timezone (like "EST", "PST").
 The objective is to transmute the specified date and time to align with the provided timezone and then showcase the result.
Input:
Date and time structured as YYYY-MM-DD HH:MM:SS.
A string indicating the timezone (e.g., "EST").
Expected Output: The recalibrated date and time synchronized with the inputted timezone.

 */
public class Challenge_12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce a date and a time with the pattern YYYY-MM-DD HH:MM:SS ");
        String date = scanner.nextLine();
        System.out.println("Introduce time zone like \"EST\", \"PST\"");
        String timeZone = scanner.nextLine();
        System.out.println(convertToTimeZone(date, timeZone));


    }
    public static String convertToTimeZone(String date, String timeZone){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse(date, dateTimeFormatter);
       return localDateTime.atZone(ZoneId.of(timeZone, ZoneId.SHORT_IDS)).format(dateTimeFormatter);
    }
}

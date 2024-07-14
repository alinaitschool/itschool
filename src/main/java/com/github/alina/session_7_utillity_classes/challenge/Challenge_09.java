package com.github.alina.session_7_utillity_classes.challenge;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
/*
9. Interval Between Dates
Description: Design a method titled daysBetween that reads two dates from the console and computes the total number of days between them.
Input: Two dates given by the user in the format YYYY-MM-DD.
Expected Output: An integer showcasing the difference in days between the two dates.

 */
public class Challenge_09 {
    public static void main(String[] args) {
        System.out.println(findTheDaysBetweenTwoInputedDays());
    }
    public static Long findTheDaysBetweenTwoInputedDays() {
        System.out.println("Please, introduce the first date in the following format yyyy-MM-dd");
        Scanner scanner = new Scanner(System.in);
        String day1 = scanner.nextLine();
        System.out.println("Please, introduce the second date in the following format yyyy-MM-dd");
        String day2 = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate parseDate1 = LocalDate.parse(day1, formatter);
        LocalDate parseDate2 = LocalDate.parse(day2, formatter);
        //return  (Long) parseDate2.toEpochDay() - parseDate1.toEpochDay();   -> first solution
        return ChronoUnit.DAYS.between(parseDate2, parseDate1);
    }
}
//https://medium.com/@tararamgoyal4_92353/how-can-java-get-epoch-time-and-what-is-it-644102fa9083
//https://docs.oracle.com/javase/8/docs/api/java/time/temporal/ChronoUnit.html

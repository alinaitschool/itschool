package com.github.alina.session_7_utillity_classes.challenge;

import java.time.LocalDate;

/*
7. Date Arithmetic
Description: Write a method named addWeeksToToday that accepts an integer as its argument. This integer denotes the number of weeks. The method should add this number of weeks to today's date and return the resultant date.
Input: An integer n (e.g., 4).
Expected Output: A date object that is n weeks from today.
 */
public class Challenge_07 {
    public static void main(String[] args) {
        int n=4;
        LocalDate result =addWeeksToToday(n);
        System.out.println(result);
    }
    public static LocalDate addWeeksToToday(int weeks){
        LocalDate today =LocalDate.now();
        LocalDate futureDate = today.plusDays(weeks);
        return futureDate;
    }

}

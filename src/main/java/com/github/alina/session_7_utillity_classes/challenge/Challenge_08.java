package com.github.alina.session_7_utillity_classes.challenge;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*Description: Construct a method named findDayOfWeek that takes in a date and returns the specific day of the week (e.g., Monday, Tuesday, etc.) for that date.
Input: A date in the format YYYY-MM-DD.
Expected Output: The day of the week in string format (e.g., "Wednesday").
*/
public class Challenge_08 {
    public static void main(String[] args) {
        String date = "2024-07-01";
        String dayOfWeek = findDayOfWeek(date);
        System.out.println("The day of the week for " + date + " is: " + dayOfWeek);
    }

    public static String findDayOfWeek(String day){
        LocalDate localDate = LocalDate.parse(day,  DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        DayOfWeek dayOfWeek= localDate.getDayOfWeek();
        return dayOfWeek.toString();

    }
}
//https://www.baeldung.com/java-creating-localdate-with-values
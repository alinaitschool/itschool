package com.github.alina.session_7_utillity_classes.challenge;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/*Description: Write a method named displayCurrentTime that prints the current time to the console.
Expected Output: The current time in the format HH:MM:SS.
*/
public class Challenge_06 {
    public static void main(String[] args) {
        displayCurrentTime();
    }
    public static Date displayCurrentTime(){
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.err.println(dtf.format(now));
        return  new Date();
    }

}

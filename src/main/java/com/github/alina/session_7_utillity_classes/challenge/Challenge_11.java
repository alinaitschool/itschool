package com.github.alina.session_7_utillity_classes.challenge;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/*
11. Duration Since
Description: Construct a method called elapsedTimeSince that ingests a prior time (in the HH:MM:SS format) as its input and displays the time duration from that moment to the present.
Input: A time given in the format HH:MM:SS.
Expected Output: The time span given as X hours, Y minutes, Z seconds.

 */
public class Challenge_11 {
    public static void main(String[] args) {
        System.out.println(elapsedTimeSince("04:05:11"));
    }

    public static String elapsedTimeSince(String start){
        LocalTime startTime = LocalTime.parse(start, DateTimeFormatter.ISO_LOCAL_TIME);
        long dif =  ChronoUnit.SECONDS.between(startTime, LocalTime.now());
        long seconds = dif%60;
        long totalMinutes = (dif -seconds)/60;
        long minutes= totalMinutes%60;
        long totalHours = (totalMinutes -minutes)/60;
        return totalHours +":" + minutes + ":" + seconds;
    }
}

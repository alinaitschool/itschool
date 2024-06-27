package com.github.alina.session_7_utillity_classes.practice;

import java.time.Duration;
import java.time.LocalDateTime;

public class LocalDateTimePractice {
    public static void main(String[] args) {
        LocalDateTime localDateTime =LocalDateTime.now();
        //System.out.println(localDateTime);
        //printLocalDateDecrement(localDateTime, 5L);
        LocalDateTime localDateTime2 = localDateTime.plusDays(2);
        printLocalDateTimeDifference(localDateTime, localDateTime2);
    }
    public static void printLocalDateDecrement(LocalDateTime localDateTime, long decrement){
        System.out.println(localDateTime.plusHours(decrement));
    }
    public static void printLocalDateTimeDifference(LocalDateTime statLocalDateTime, LocalDateTime endLocalDateTime){
        Duration duration=Duration.between(statLocalDateTime, endLocalDateTime);
        long hours = duration.toHours();
        long minutes = duration.toMinutes();
        long seconds= duration.toSeconds();

        System.out.printf("Time difference  %d hours, %d minutes, %d seconds", hours, minutes, seconds);
    }
}

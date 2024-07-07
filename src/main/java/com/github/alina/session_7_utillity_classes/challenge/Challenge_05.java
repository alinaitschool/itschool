package com.github.alina.session_7_utillity_classes.challenge;

import java.time.LocalDate;

/*Is Today a Specific Date?
        Description: Write a method named isTodaySpecificDate that checks if today's date is 10th December 2019.
        Expected Output:
        true if today's date is 2019-12-10.
        false otherwise.
 */
public class Challenge_05 {
    public static void main(String[] args) {
        System.out.println(isTodaySpecificDate());
    }

    public static boolean isTodaySpecificDate() {
        LocalDate today = LocalDate.now();
        LocalDate specificDate = LocalDate.of(2019, 12, 10);
        return today.equals(specificDate);
    }
}

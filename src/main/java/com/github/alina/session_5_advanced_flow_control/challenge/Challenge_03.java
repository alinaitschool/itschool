package com.github.alina.session_5_advanced_flow_control.challenge;

import java.time.LocalDate;

/*3. Create a Specific Date
Description: Write a method named createSpecificDate that returns a date object representing 19th August 2025.
Expected Output: A date object for 2025-8-19.
*/
public class Challenge_03 {
    public static void main(String[] args) {
        System.out.println(createSpecificDate());
    }
    public static LocalDate createSpecificDate(){
        return LocalDate.of(2025, 8, 19);
    }
}

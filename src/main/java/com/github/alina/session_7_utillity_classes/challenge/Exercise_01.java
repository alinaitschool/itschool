package com.github.alina.session_7_utillity_classes.challenge;
/*
Description: Write a method named displayTodaysDate that, when called, prints the current date to the console.
Expected Output: Today's date in the format YYYY-MM-DD.
 */

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercise_01 {

    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        System.out.println(formatter.format(date));
    }

}

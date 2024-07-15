package com.github.alina.session_7_utillity_classes.challenge;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

/*10. Date Authenticator
Description: Engineer a method named isValidDate that captures a date string from the console and assesses if it conforms to a valid date format (YYYY-MM-DD).
The method should also consider leap years when validating February dates.
Input: A string of a date from the console.
Expected Output:
true if the input adheres to the date format and denotes a genuine date.
false if otherwise.
*/
public class Challenge_10 {
    public static void main(String[] args) {
        System.out.println(isValidDate());
    }

    public static boolean isValidDate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce a date in the following format: yyyy-MM-dd ");
        String introducedDate = scanner.nextLine();
        return DATE_PATTERN.matcher(introducedDate).matches();
    }
    private static Pattern DATE_PATTERN = Pattern.compile(
            "^((2000|2400|2800|(19|2[0-9])(0[48]|[2468][048]|[13579][26]))-02-29)$"
                    + "|^(((19|2[0-9])[0-9]{2})-02-(0[1-9]|1[0-9]|2[0-8]))$"
                    + "|^(((19|2[0-9])[0-9]{2})-(0[13578]|10|12)-(0[1-9]|[12][0-9]|3[01]))$"
                    + "|^(((19|2[0-9])[0-9]{2})-(0[469]|11)-(0[1-9]|[12][0-9]|30))$");
}

//other solution could be with try and catch

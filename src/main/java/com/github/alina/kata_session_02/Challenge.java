package com.github.alina.kata_session_02;
//Given a string only consisting of a’s and b’s, return true if there are no a’s in the string,
// or if all the ‘a’ characters are before b. Every other case is false.

public class Challenge {
    public static void main(String[] args) {
        String input = "abbaaa";
        String onlyB = "bb";
        String abeforB = "aaaaabbbb";
        System.out.println(checkString(input));
        System.out.println(checkString(onlyB));
        System.out.println(checkString(abeforB));

    }

    public static boolean checkString(String input) {
        if (input.toLowerCase().indexOf("a") == -1) {
            return true;
        }
        if (input.toLowerCase().lastIndexOf("a") < input.toLowerCase().indexOf("b")) {
            return true;
        }
        return false;
    }
}
//input.contains("a")

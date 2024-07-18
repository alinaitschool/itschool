package com.github.alina.session_8_array_linkedlist.challenge;
/*Accept a string representation of a binary number, e.g., "1011".
Convert this string into an Integer using the Integer wrapper class and the method that parses binary. Print out the decimal representation of this number.
 */

public class Challenge_09 {
    public static void main(String[] args) {
        String stringReprezentation = "1011";
        Challenge_09 convertos = new Challenge_09();
        convertos.convertBinaryToDecimal(stringReprezentation);
    }

    public int convertBinaryToDecimal(String binaryValue) {
        Integer convertedString = Integer.parseInt(binaryValue, 2);
        System.out.println(convertedString);
        return convertedString;
    }
}

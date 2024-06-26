package com.github.alina.session_6_java_core_api.challenge;

/*9. Frequency Counter
        Description: Using StringBuilder, write a program that counts the frequency of each character in a string.
*/
public class Exercise_9 {
    public static void main(String[] args) {
        String input = "example stringgg";
        int[] frequencyArray = getCharacterFrequency(input);
        for (int i = 0; i < frequencyArray.length; i++) {
            if (frequencyArray[i] > 0) {
                System.out.println("Character: " + (char) i + ", Frequency: " + frequencyArray[i]);
            }
        }
    }

    public static int[] getCharacterFrequency(String input) {
        int[] frequencyArray = new int[256];
        StringBuilder sb = new StringBuilder(input);
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            frequencyArray[c]++;
        }
        return frequencyArray;
    }
}

package com.github.alina.session_6_java_core_api.challenge;
/*Encode and Decode using Caesar Cipher
Description: Implement a Caesar Cipher encoder and decoder using the StringBuilder class. The Caesar Cipher involves rotating letters a certain number of steps down or up the alphabet. For example, with a shift of 1, 'A' would be replaced by 'B', 'B' would become 'C', and so on.
*/

import java.util.Arrays;

public class Challenge_11 {

    public static void main(String[] args) {
        System.out.println(getCaesarCipher('A', 27));

    }
    public static char getCaesarCipher(char character, int number) {
        char[] alphabet = new char[26];
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) ('A' + i);
        }
        char chip = 'A';
        for (int i = 0; i < alphabet.length; i++) {
            if (character == alphabet[i]) {
                if (i + number >= alphabet.length) {
                    chip = alphabet[i + number - alphabet.length];
                } else {
                    chip = alphabet[i + number];
                    break;
                }
            }
        }
        return chip;
    }
}

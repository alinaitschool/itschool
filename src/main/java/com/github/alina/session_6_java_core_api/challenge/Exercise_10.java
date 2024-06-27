package com.github.alina.session_6_java_core_api.challenge;

import java.util.Arrays;
import java.util.HashMap;



public class Exercise_10 {
    private static final HashMap<Character, String> morseCodeMap = new HashMap<>();
    static{
        morseCodeMap.put('A', "._");
        morseCodeMap.put('B', "-...");
        morseCodeMap.put('C', "_._");
        morseCodeMap.put('D', "-..");
        morseCodeMap.put('E', ".");
        morseCodeMap.put('F', "..-.");
        morseCodeMap.put('G', "--.");
        morseCodeMap.put('H', "....");
        morseCodeMap.put('I', "..");
        morseCodeMap.put('J', ".---");
        morseCodeMap.put('K', "-.-");
        morseCodeMap.put('L', ".-..");
        morseCodeMap.put('M', "--");
        morseCodeMap.put('N', "-.");
        morseCodeMap.put('O', "---");
        morseCodeMap.put('P', ".--.");
        morseCodeMap.put('Q', "--.-");
        morseCodeMap.put('R', ".-.");
        morseCodeMap.put('S', "...");
        morseCodeMap.put('T', "-");
        morseCodeMap.put('U', "..-");
        morseCodeMap.put('V', "...-");
        morseCodeMap.put('W', ".--");
        morseCodeMap.put('X', "-..-");
        morseCodeMap.put('Y', "-.--");
        morseCodeMap.put('Z', "--..");
        morseCodeMap.put('0', "-----");
        morseCodeMap.put('1', ".----");
        morseCodeMap.put('2', "..---");
        morseCodeMap.put('3', "...--");
        morseCodeMap.put('4', "....-");
        morseCodeMap.put('5', ".....");
        morseCodeMap.put('6', "-....");
        morseCodeMap.put('7', "--...");
        morseCodeMap.put('8', "---..");
        morseCodeMap.put('9', "----.");
    }
    public static void main(String[]args){
     System.out.println(getConvertedCharactersToMorseCode("Alina"));
    }
    public static String getConvertedCharactersToMorseCode(String string){
        StringBuilder morseCodeBuilder= new StringBuilder();
        for(char character: string.toUpperCase().toCharArray()) {
            morseCodeBuilder.append(morseCodeMap.get(character));
        }


        return  morseCodeBuilder.toString();
    }
}

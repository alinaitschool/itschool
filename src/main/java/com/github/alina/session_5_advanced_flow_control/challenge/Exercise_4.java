package com.github.alina.session_5_advanced_flow_control.challenge;

import java.util.Scanner;

//Ask the user to enter a string. Print the reversed version of this string.
public class Exercise_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a random string");
        String stringToBeReverted = scanner.nextLine();
        String stringResult = stringReverted(stringToBeReverted);
       System.out.println(stringResult);
    }
    public static String stringReverted(String stringToBeReverted){
        StringBuilder stringBilder = new StringBuilder();
        for(int i=stringToBeReverted.length()-1; i>=0; i--){
            stringBilder.append(stringToBeReverted.charAt(i));
        }
        return stringBilder.toString();
    }
}

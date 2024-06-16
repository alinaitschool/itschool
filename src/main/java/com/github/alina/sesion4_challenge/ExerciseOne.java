package com.github.alina.sesion4_challenge;
// Write a Java program where you create two String objects named stringOne and stringTwo with the same value "OpenAI". Check and print whether they refer to the same object.
public class ExerciseOne {
    public static void main(String[] args) {
        String str1 = "OpenAI";
        String str2 = "OpenAI";
        boolean checkIfAreEqual= str1==str2;

        System.out.println("Are those objects equal " + checkIfAreEqual);
    }
}
package com.github.alina.sesion4.challenge;
// Write a Java program where you create two String objects named stringOne and stringTwo with the same value "OpenAI". Check and print whether they refer to the same object.
public class Challenge1 {
    public static void main(String[] args) {
        String stringOne = "OpenAI";
        String stringTwo = "OpenAI";
        boolean checkIfAreEqual= stringOne==stringTwo;
        boolean checkIsEqual = stringOne.equals(stringTwo);
        System.out.println("Are those two strings refers to the same object " + checkIfAreEqual);
        System.out.println("Are those two strings refers to the same object " + checkIsEqual);
    }
}
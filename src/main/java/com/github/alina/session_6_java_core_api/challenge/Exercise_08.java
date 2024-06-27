package com.github.alina.session_6_java_core_api.challenge;

/*
8. Inserting at Index
Description: Write a Java program that inserts a given string into another string at a specified index using the StringBuilder class.
 */
public class Exercise_08 {
    public static void main(String[] args) {
        System.out.println(insertGivenString("alina", "lia", 20));
    }

    public static String insertGivenString(String givenString, String stringToBeInserted, int index) {
        StringBuilder rezultInsertedString = new StringBuilder(givenString);
        try {
            rezultInsertedString.insert(index, stringToBeInserted);
            return rezultInsertedString.toString();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Index is out of bounds.");
        }
        return givenString;
    }
}

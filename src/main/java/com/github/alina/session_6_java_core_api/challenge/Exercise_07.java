package com.github.alina.session_6_java_core_api.challenge;

//Description: Design a program using StringBuilder that removes duplicate characters from a string. For example, "balloon" should become "balon".
public class Exercise_07 {
    public static void main(String[] args) {
        System.out.println(removeDuplicate("ballon"));
        System.out.println(removeDuplicate("gghetlerr"));
    }

    public static String removeDuplicate(String input) {
        StringBuilder duplicateRemove = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (!duplicateRemove.toString().contains(String.valueOf(input.charAt(i)).toLowerCase())) {
                duplicateRemove.append(input.charAt(i));
            }
        }
        return duplicateRemove.toString();
    }
}

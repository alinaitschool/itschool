package com.github.alina.session_18_labda.challenge;
//You are given a List<String> representing a list of words. Create a lambda expression to sort the list in alphabetical order.
// Next, modify your lambda expression to sort the list in reverse alphabetical order.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Challenge_04 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("alina", "miha", "alex", "catalina", "denisa");
        List<String> listAsAlphabeticalOrder = list.stream().sorted((o1, o2) -> o1.compareTo(o2))
                .toList();
        System.out.println(listAsAlphabeticalOrder);
        List<String> listAsNonAlphabeticalOrder = list.stream().sorted((o1,o2)->o2.compareTo(o1)).toList();
        System.out.println(listAsNonAlphabeticalOrder);
    }

}

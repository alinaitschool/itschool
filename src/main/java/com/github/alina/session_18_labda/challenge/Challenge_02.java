package com.github.alina.session_18_labda.challenge;

import java.util.Arrays;
import java.util.List;

//Write a program that uses lambda expressions to sort a list of strings in alphabetical order.
public class Challenge_02 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("A", "d", "f", "c", "i");
        List<String> sortedList= list.stream().sorted().toList();
        sortedList.forEach(System.out::println);
    }
}

 /*
		List<String> sortedList = list.stream()
			.sorted(Comparator.naturalOrder())
			.collect(Collectors.toList());

        List<String> sortedList = list.stream()
			.sorted((o1,o2)-> o1.compareTo(o2))
			.collect(Collectors.toList());
		*/

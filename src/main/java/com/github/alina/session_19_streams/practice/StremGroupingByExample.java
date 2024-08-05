package com.github.alina.session_19_streams.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StremGroupingByExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jack", "Alice");
        Map<Character, List<String>> groupedByFirstLetter = names
                .stream()
                .collect(Collectors.groupingBy(name -> name.charAt(0)));
        System.out.println(groupedByFirstLetter);
    }
}

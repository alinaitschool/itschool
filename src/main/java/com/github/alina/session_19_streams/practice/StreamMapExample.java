package com.github.alina.session_19_streams.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jack", "Alice");
        //convert all names to upper case
        List<String> upperCasenames = names.stream().map(name->name.toUpperCase()).toList();
        System.out.println(upperCasenames);

    }
}

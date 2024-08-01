package com.github.alina.session_18_labda.practice;

import java.util.Arrays;
import java.util.List;

public class DataProcessingPractice {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Bob");
        names.stream().filter(name -> name.startsWith("A")).forEach(System.out::println);
    }
}

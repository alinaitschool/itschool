package com.github.alina.session_19_streams.practice;

import java.util.Arrays;
import java.util.List;

public class SimpleStreamExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jack", "Alice");
        //names.stream().forEach(System.out::println);
        names.stream().filter(name -> name.startsWith("A")).forEach(name -> System.out.println(name));
    }
}

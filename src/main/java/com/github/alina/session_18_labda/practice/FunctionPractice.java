package com.github.alina.session_18_labda.practice;

import java.util.function.Function;

public class FunctionPractice {
    public static void main(String[] args) {
        Function<String, Integer> strLengFinder= str->str.length();
        System.out.println(strLengFinder.apply("Hello"));
    }
}

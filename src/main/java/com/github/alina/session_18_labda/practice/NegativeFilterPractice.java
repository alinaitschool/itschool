package com.github.alina.session_18_labda.practice;

import java.util.List;

public class NegativeFilterPractice {
    public static void main(String[] args) {
        NegativeFilter filter = numbers -> numbers.stream()
                .filter(num-> num<0)
                .toList();
        List<Integer> numbers =List.of(-1, 2, 3, 0);
        System.out.println(negativeFilter.filter(numbers));
    }

}

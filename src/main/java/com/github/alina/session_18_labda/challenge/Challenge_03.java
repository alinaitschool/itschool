package com.github.alina.session_18_labda.challenge;
//Write a program that uses lambda expressions to calculate the sum of all the elements in a list of integers.

import java.util.Arrays;
import java.util.List;

public class Challenge_03 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 4, 6, 10);
        int result= list.stream().reduce(0,(subtotal,number)-> subtotal+number);
        System.out.println(result);

    }
}

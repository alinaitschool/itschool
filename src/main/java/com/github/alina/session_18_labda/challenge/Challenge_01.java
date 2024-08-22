package com.github.alina.session_18_labda.challenge;
//Write a program that uses lambda expressions to filter a list of integers and return only the even numbers.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Challenge_01 {
    public static void main(String[] args) {
        int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
       int[] result= IntStream.of(intArray).filter(n -> n % 2 == 0).toArray();
       System.out.println(Arrays.toString(result));
    }
}

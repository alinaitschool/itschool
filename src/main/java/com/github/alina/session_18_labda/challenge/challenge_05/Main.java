package com.github.alina.session_18_labda.challenge.challenge_05;
//Create a functional interface that takes a list of integers and returns the maximum value from the list. Implement this interface using a lambda expression.
// Ensure your lambda correctly handles an empty list case.

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MaxValue result = (a) -> Collections.max(a);
        System.out.println(result.max(Arrays.asList(8, 10, 111, 23, 19, -1)));
    }
}

package com.github.alina.session3.practice;

public class PostIncrement {
    public static void main(String[] args) {
        short e = 10;
        int f = e + 5;

        long a = 10000000000L;

        //wrapper classes
        long maxLongValue = Long.MAX_VALUE;
        long minLongValue = Long.MIN_VALUE;

        int maxIntValue = Integer.MAX_VALUE;

        System.out.println("Max long value: " + maxLongValue);
        System.out.println("Min long value: " + minLongValue);
        System.out.println("Max integer value: " + maxIntValue);

        long testLongValue = 2147483647123L;
        //max int:  2147483647
        //max long: 9223372036854775807

        int newIntValue = (int)testLongValue;

        System.out.println("Test long value: " + testLongValue);
        System.out.println("New int value: " + newIntValue);
    }
}


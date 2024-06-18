package com.github.alina.session_5_advanced_flow_control.practice;

public class JavaStaments {
    public static final int MAX_VALUE = 10;
    public static final int MAX_STRING_LENGTH= 10;

    public static void main(String[] args) {
        int number = 5;
        if (number > MAX_VALUE) {
            System.out.println("The number is greater than " + MAX_VALUE);
        } else {
            System.out.println("The number isn't greater than " + MAX_VALUE);
        }
        String greeting = "Hello";
        if(greeting.length()>MAX_STRING_LENGTH){
            System.out.println("The number is greater than " + MAX_STRING_LENGTH);

        }
    }
}

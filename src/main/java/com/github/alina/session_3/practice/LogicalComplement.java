package com.github.alina.session_3.practice;

public class LogicalComplement {
    public static void main(String[] args) {
        boolean isFirstTime = true;
        boolean isRegistered = false;

        System.out.println("Default value: isFirstTime " + isFirstTime);
        System.out.println("Updated value: isFirstTime " + !isFirstTime);

        System.out.println("Default value: isRegistered " + isRegistered);
        System.out.println("Updated value: isRegistered " + !isRegistered);
    }
}

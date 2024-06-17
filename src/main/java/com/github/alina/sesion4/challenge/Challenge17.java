package com.github.alina.sesion4.challenge;

public class Challenge17 {
    public static void main(String[] args) {
        boolean hasUsername = true;
        boolean hasPassword = true;
        if (hasUsername && hasPassword) {
            System.out.println("Authentication successful");
        } else if (!hasUsername || !hasPassword) {
            System.out.println("Authentication failed");
        } else if (hasUsername && !hasPassword) {
            System.out.println("Password is incorrect");
        }
    }
}

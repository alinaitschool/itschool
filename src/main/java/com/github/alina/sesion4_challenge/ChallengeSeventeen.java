package com.github.alina.sesion4_challenge;

public class ChallengeSeventeen {
    public static void main(String[] args) {
        boolean hasUsername = true;
        boolean hasPassword =true;
                if(hasUsername && hasPassword){
                    System.out.println("Authentication successful");
                } else if (!hasUsername || !hasPassword) {
                    System.out.println("Authentication failed");
                } else if(hasUsername && !hasPassword){
                    System.out.println("Password is incorrect");
                }
    }
}

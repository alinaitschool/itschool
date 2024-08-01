package com.github.alina.session_18_labda.practice;

public abstract class GrettingsServicePractice {
    public static void main(String[] args) {
        //
        GrettingsServicePractice  grettingsServicePractice = new GrettingsServicePractice() {
            @Override
            public void greet(String message) {
                System.out.println("Hello World dfrom anonymus class");
            }

    } ;
    }

    public abstract void greet(String message);
}

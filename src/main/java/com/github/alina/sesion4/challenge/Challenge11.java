package com.github.alina.sesion4.challenge;

import java.util.ArrayList;

//Write a Java program that creates two distinct ArrayList objects, listOne and listTwo. Add some elements to listOne and assign listOne to listTwo. Now modify listOne by adding a new element. Print both lists and observe the output.
public class Challenge11 {
    public static void main(String[] args) {
        ArrayList<Integer> listOne = new ArrayList<>();
        ArrayList<Integer> listTwo = new ArrayList<>();
        listOne.add(10);
        listOne.add(20);
        listTwo.add(30);
        listTwo.add(40);
        System.out.println("listOne: " + listOne);
        listOne =listTwo;
        listOne.add(50);
        listOne.add(60);
        System.out.println("listOne: " + listOne);
        System.out.println("listTwo: " + listTwo);
    }
}

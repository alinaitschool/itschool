package com.github.alina.session_8_array_linkedlist.challenge;
/*
In an array of strings representing movie titles, implement a linear search method to find whether a given movie title exists. If it does, print out its position in the array.

 */

import java.util.ArrayList;

public class Clallenge_08 {
    public static void main(String[] args) {
        findTheTitleOfMovie("Movie11");
    }

    public static String findTheTitleOfMovie(String key) {
        ArrayList<String> moviesList = new ArrayList<>();
        moviesList.add("Movie1");
        moviesList.add("Movie2");
        moviesList.add("Movie3");
        moviesList.add("Movie4");
        moviesList.add("Movie5");
        moviesList.add("Movie6");
        moviesList.add("Movie7");
        moviesList.add("Movie8");
        for (int i = 0; i < moviesList.size(); i++) {
            if (moviesList.get(i).equalsIgnoreCase(key)) {
                System.out.println("Movie's position is " + i);
                return key;
            }
        }
        System.out.println("This movie doens't exist");
        return key;
    }
}

package com.github.alina.session_19_streams.practice;

import java.util.Arrays;
import java.util.List;

public class MapUserFullNameExample {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(new User("Bob", "Smith", 28),
                new User("Julian", "Smith", 28),
                new User("Alex", "Smith", 28));
        //map users to their full names and collect into a list
        List<String> fullNames = users.stream()
                .map(name -> name.getFirstName() + " " + name.getSecondName())
                .toList();
        System.out.println(fullNames);
    }
}

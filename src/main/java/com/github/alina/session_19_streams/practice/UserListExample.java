package com.github.alina.session_19_streams.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserListExample {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(new User("Bob", "Smith", 28),
                new User("Julian", "Smith", 28),
                new User("Alex", "Smith", 28));
        //print all users
        users.stream().forEach(System.out::println);
    }
}

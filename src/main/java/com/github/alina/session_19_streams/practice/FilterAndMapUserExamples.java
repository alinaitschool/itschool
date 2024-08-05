package com.github.alina.session_19_streams.practice;

import java.util.Arrays;
import java.util.List;

public class FilterAndMapUserExamples {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(new User("Bob", "Smith", 28),
                new User("Julian", "Smith", 28),
                new User("Alex", "Smith", 23));
        //filter users older than 26 and map tp their first name
        List<String> results = users.stream().filter(user -> user.getAge() < 26)
                .map(User::getFirstName)
                .toList();
        System.out.println(results);
    }
}

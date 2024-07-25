package com.github.alina.kata.session_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> emails = new ArrayList<>();
        emails.add("alina@");
        Person person1 =new Person();
        person1.setName("Alina");
        person1.setAge(24);
        person1.setAddress("Iasi");
        person1.setEmails(emails);
        person1.displayInfo();
    }
}

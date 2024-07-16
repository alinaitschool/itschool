package com.github.alina.session_8_array_linkedlist.challenge;

import java.util.LinkedList;
import java.util.Scanner;

//Given a LinkedList storing student names, write a program that checks if a particular student name exists in the list. If it does, remove that name from the list.
public class Challenge_06 {
    public static void main(String[] args) {
        LinkedList<String> studentsNameList = new LinkedList<>();
        studentsNameList.addFirst("FirstStudent");
        studentsNameList.add("SecondStudent");
        studentsNameList.add("ThirdStudent");
        studentsNameList.add("FourthStudent");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, introduce a student");
        String studentName = scanner.nextLine();
        studentsNameList.remove(studentName);
        System.out.println(studentsNameList);

    }
}

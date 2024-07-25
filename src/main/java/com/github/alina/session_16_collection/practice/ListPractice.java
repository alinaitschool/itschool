package com.github.alina.session_16_collection.practice;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {
    public static void main(String[] args) {
        List<Integer> myList = initializeList();
        List<Integer> updateList = updateList(myList, 3, 7);
        System.out.println(updateList);
    }

    public static boolean isElementPresent(List<Integer> list, int value) {
        return list.contains(value);
    }

    public static List<Integer> updateList(List<Integer> list, int index, int value) {
        if (index < 0 || index > list.size()) {
            System.out.println("Invalid index");
            return list;
        }
        List<Integer> result = new ArrayList<>();
        result.set(index, value);
        return result;
    }

    public static List<Integer> initializeList() {
        List<Integer> list = new ArrayList<>();
        return list;
    }
}

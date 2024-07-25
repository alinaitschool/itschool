package com.github.alina.session_16_collection.practice;

import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        Map<String, Integer> students = initializeMap();

    }
    public static int retriveValue(Map<String, Integer> map, String key){
        return map.get(key);
    }
    public static Map<String, Integer> initializeMap(){
        Map<String, Integer> students = new HashMap<>();
        students.put("Alina", 21);
        students.put("Gabriela", 21);
        students.put("Mihaela", 21);
        return students;
    }
}

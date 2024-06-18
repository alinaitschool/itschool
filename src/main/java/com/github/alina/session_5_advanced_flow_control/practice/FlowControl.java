package com.github.alina.session_5_advanced_flow_control.practice;

import java.util.ArrayList;
import java.util.List;

public class FlowControl {
    public static void main(String[] args) {
        //printNumberWithWhile(10);
        printNumberWithDoWhile(10);

    int[] arrayExample = {1,2,3};
        List<String> cities = new ArrayList<>();
        cities.add("Bucuresti");
        cities.add("Bucharest");
        cities.add("HongKong");
        printWithForEach(cities);
    }

    public static void printNumberWithWhile(int input){
        int number =1;
        while(number <=input){
            System.out.println("Number " +number);
            ++number;
        }
    }
    public static void printNumberWithDoWhile(int input){
        int number =1;
       do{
           ++number;
           System.out.println("Number" +number);
       }while(number<=input);

    }
    public static void printWithForEach(List<String> cities){
        for(String city: cities){
            System.out.println("City from the cities " + city);
        }
    }
}
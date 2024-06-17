package com.github.alina.sesion4.practice;

public class ForStatement {
    public static void main(String[] args){
     printNumber(10);
     int[] array={1,2,4, 9, 10};
     printArray(array);
    }
    public static void printNumber(int number){
        for(int i=0; i<=10; i++){
            System.out.print(i);
        }
    }
    public static void printArray(int[] numbersArray){
        for(int number:numbersArray){
            System.out.println(number);
        }
    }
}

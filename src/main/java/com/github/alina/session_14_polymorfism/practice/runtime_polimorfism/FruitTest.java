package com.github.alina.session_14_polymorfism.practice.runtime_polimorfism;

public class FruitTest {
    public  static void main(String[] args){
    printFruitDetails(new Apple());
    }
    public static void printFruitDetails(Fruit fruit){
        System.out.println("Taste" + fruit.taste());
    }
}

package com.github.alina.session_8_array_linkedlist.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//1. Create a shopping list with Array and print the values
public class Challenge_01 {
    public static void main(String[] args) {
      System.out.println(createShoppingList());
    }
    public static List createShoppingList(){
        ArrayList<String> shoppingList = new ArrayList<>();
        shoppingList.add("Milk");
        shoppingList.add("Cream");
        shoppingList.add("Butter");
        shoppingList.add("Sparangel");
        return shoppingList;
    }

}

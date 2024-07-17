package com.github.alina.session_8_array_linkedlist.challenge;
/*Create an ArrayList containing names of fruits. Implement a custom sorting mechanism to arrange them in descending order based on their length.
If two fruits have the same length, sort them in alphabetical order.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Challenge_07 {
    public static void main(String[] args) {
        ArrayList<String> fruitsList = new ArrayList<>();
        fruitsList.add("Apple");
        fruitsList.add("Pear");
        fruitsList.add("Grape");
        fruitsList.add("Banana");
        fruitsList.add("Fig");
        fruitsList.add("Date");
        fruitsList.add("Grapes");
        fruitsList.add("Banana");
        Collections.sort(fruitsList, new Comparator<String>() {
            @Override
            public int compare(String fruits1, String fruits2) {
                int lenghtComparation = Integer.compare(fruits1.length(), fruits2.length());
                if(lenghtComparation ==0){
                    return fruits2.compareTo(fruits1);
                }
               return  lenghtComparation;
            }
        });
    for(String fruit: fruitsList){
        System.out.println(fruit);
    }
    }

}

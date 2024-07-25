package com.github.alina.session_8_array_linkedlist.challenge;

import java.util.ArrayList;
import java.util.Scanner;

/*Create an ArrayList that stores city names. Add at least five city names initially. Then, prompt the user to add a city name.
 If the city name is already in the list, display a message saying it's a duplicate; otherwise, add it to the list.
 */
public class Challenge_05 {
    public static void main(String[] args) {
        ArrayList<String> citiesList = new ArrayList<>();
        citiesList.add("New York");
        citiesList.add("Timisoara");
        citiesList.add("Botosani");
        citiesList.add("Berlin");
        citiesList.add("Mumbai");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, introduce a city");
        String introducedCity = scanner.nextLine();
        if (!citiesList.contains(introducedCity)) {
            citiesList.add(introducedCity);
            System.out.println(citiesList);
        } else {
            System.out.println("Intoduce other city because this is already exist");
        }
    }
}

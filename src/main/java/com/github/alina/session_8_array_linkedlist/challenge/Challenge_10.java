package com.github.alina.session_8_array_linkedlist.challenge;
//10. Write a program that manages a personal diary using an ArrayList. Each entry in the diary is a string that contains a date in the format "YYYY-MM-DD" followed by a colon and the diary entry for that day. Your program should allow the user to:
//        Add a new entry (but ensure there's no duplicate date).
//        Edit an existing entry based on the date.
//        Delete an entry by date.
//        Display all entries in reverse chronological order (latest first).
//
//        Ensure that all these operations are efficient, especially the addition of new entries, which should keep the list sorted without resorting it every time.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Challenge_10 {
    public static void main(String[] args) {
        ArrayList<String> entryList = new ArrayList<>();
        entryList.add("2024-11-05: Today was a warm day");
        entryList.add("2024-11-06: Today was a cold day");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nPersonal Diary Menu:");
            System.out.println("1. Add a new entry");
            System.out.println("2. Edit an existing entry");
            System.out.println("3. Delete an entry");
            System.out.println("4. Display all entries");
            System.out.println("5. Exit");
            System.out.println("Choose an option: ");
            int option = scanner.nextInt();
            String input;
            switch (option) {
                case 1:
                    System.out.println("Introduce a date in the 'YYYY-MM-DD' followed by a colon and the diary entry for that day");
                    input = scanner.next();
                    addEntry(input, entryList);
                    break;
                case 2:
                    System.out.println("For editing introduce a date in the 'YYYY-MM-DD' followed by a colon with the diary entry");
                    input = scanner.next();
                    editDiaryEntry(input, entryList);
                    break;
                case 3:
                    System.out.println("For deleting introduce a date in the 'YYYY-MM-DD' followed ");
                    input = scanner.next();
                    deleteEntry(input, entryList);
                    break;
                case 4:
                    System.out.println("This are all the entries from the diary");
                    Collections.sort(entryList);
                    System.out.println(entryList);
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
            scanner.nextLine();
        }
    }

    public static void deleteEntry(String input, List<String> entryList) {
        int index = findByDate(input, entryList);
        if (index != -1) {
            entryList.remove(index);
        }
    }

    public static String addEntry(String input, List<String> entryList) {
        boolean exist = false;
        String[] diaryDate = input.split(":");
        for (String date : entryList) {
            if (date.startsWith(diaryDate[0])) {
                System.out.println("Duplicate date entry exists");
                exist = true;
                break;
            }
        }
        if (!exist) {
            entryList.add(input);
            System.out.println();
        }
        return input;
    }

    public static String editDiaryEntry(String input, List<String> entryList) {
        String[] diaryDate = input.split(":");
        int index = findByDate(diaryDate[0], entryList);
        if (index != -1) {
            entryList.set(index, input);
        }
        return input;
    }

    public static int findByDate(String dates, List<String> diaryLog) {
        for (int i = 0; i < diaryLog.size(); i++) {
            if (diaryLog.get(i).startsWith(dates)) {
                return i;
            }
        }
        return -1;
    }
}
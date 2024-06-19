package com.github.alina.session_5_advanced_flow_control.challenge;

/*9. For-Each Loop
Given an array of integers, write a program that prints each number in the array followed by "Even" if the number is even, or "Odd" if the number is odd. Utilize a for-each loop for this task.
*/
public class Exercise_9 {
    public static void main(String[] args) {
        int[] arrays = {1, 3, 4, 6, 7, 7, 10, 11, 15};
        for (int arr : arrays) {
            System.out.println((arr + " " + (arr % 2 == 0 ? "Even" : "Odd")));
        }
    }
}

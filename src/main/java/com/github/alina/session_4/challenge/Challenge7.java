package com.github.alina.session_4.challenge;

public class Challenge7 {
    public static void main(String[] args) {
        int sideOne = 5;
        int sideTwo = 5;
        int sideThree = 6;
        String triangleType = (sideOne == sideTwo && sideOne == sideThree)
                ? "Equilateral" : (sideOne == sideTwo || sideTwo == sideThree || sideThree == sideOne)
                ? "Isoscel" : "Scalene";
        System.out.println("The triangle is: " + triangleType);
    }
}

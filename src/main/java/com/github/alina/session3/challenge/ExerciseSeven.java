package com.github.alina.session3.challenge;
//7. Write a program where you perform operations between an integer and a double. Display the result.

public class ExerciseSeven {
    public static void main(String[] args) {
        int integerNumber=10;
        double doubleNumber=22.50;

        double sume = integerNumber+doubleNumber;
        double difference = doubleNumber-integerNumber;
        double multiplication = doubleNumber * integerNumber;
        double division = doubleNumber / integerNumber;
        double modulus = doubleNumber % integerNumber;
        System.out.println("The sume between an integer and a double is" + sume);
        System.out.println("The difference between and double and a integer is" + difference);
        System.out.println("The multiplication between and double and a integer is" + multiplication);
        System.out.println("The division between and double and a integer is" + division);
        System.out.println("The modulus between and double and a integer is" + modulus);


    }
}
//    Numeric Promotion Rules:
//        If two values have different data types, Java will automatically promote one of the values to the larger of the two data types.
//        If one of the values is integral and the other is floating-point, Java will automatically promote the integral value to the floating-point value’s data type.
//
//        Numeric Promotion Rules:
//        Smaller data types, namely byte, short, and char, are first promoted to int any time they’re used with a Java binary arithmetic operator, even if neither of the operands is int.
//        After all promotion has occurred and the operands have the same data type, the resulting value will have the same data type as its promoted operands.

package com.github.alina.session_3.challenge;

public class Bitwise {
    public static void main(String[] args) {

        // Bitwise AND assignment (&=)
        int a = 10; // reset a to 10
        int b=5;
        a &= b; // equivalent to a = a & b
        System.out.println("After a &= b: a = " + a); // 0

        // Bitwise OR assignment (|=)
        a = 10; // reset a to 10
        a |= b; // equivalent to a = a | b
        System.out.println("After a |= b: a = " + a); // 15

        // Bitwise XOR assignment (^=)
        a = 10; // reset a to 10
        a ^= b; // equivalent to a = a ^ b
        System.out.println("After a ^= b: a = " + a); // 15

        // Bitwise left shift assignment (<<=)
        a = 10; // reset a to 10
        a <<= 1; // equivalent to a = a << 1
        System.out.println("After a <<= 1: a = " + a); // 20

        // Bitwise right shift assignment (>>=)
        a >>= 1; // equivalent to a = a >> 1
        System.out.println("After a >>= 1: a = " + a); // 10

        // Unsigned bitwise right shift assignment (>>>=)
        a = -10; // set a to -10
        a >>>= 1; // equivalent to a = a >>> 1
        System.out.println("After a >>>= 1: a = " + a); // 2147483643
    }
}

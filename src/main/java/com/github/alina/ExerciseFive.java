package com.github.alina;
//5. Create a Java program that demonstrates the use of each compound assignment operator with integers


public class ExerciseFive {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        // Using += operator
        x += y;
        System.out.println("x +=y:" + x);

        // Reset xfor the next operation
        x = 10;
        // Using -= operator
        x -= y;
        System.out.println("x -=y:" + x);
        // Reset a for the next operation

        //Reset x for the next operation;
        x = 10;
        x *= y;
        System.out.println("x *=y" + x);//output is 200

        //Reset x for next operation;
        x = 10;
        //Using / operator
        x /= y;
        System.out.println("x /=" + x);
        //Reset x for the next operation
        x = 10;
        //Using % operator;
        x %= y;
        System.out.println("x %=" + x);

        //Bitwise AND assigment(&=)
        x= 10;//reset the x
        x &=y;
        System.out.println("x &=" + x);


    }
}



//    The Bitwise AND assignment operator (&=) performs a bitwise AND operation between the left operand and the right operand and then assigns the result back to the left operand. Here's a breakdown of what this means and how it works:
//
//        Bitwise AND Operation: This operation compares each bit of two numbers. If both bits are 1, the resulting bit is 1. Otherwise, it is 0. For example:
//
//        5 & 3 in binary is 0101 & 0011, which results in 0001 (1 in decimal).
//        Assignment: After performing the bitwise AND operation, the result is assigned back to the left operand.
//
//        Example
//        python
//        Copy code
//        x = 5       # binary: 0101
//        y = 3       # binary: 0011
//
//        x &= y      # equivalent to x = x & y
//        # x = 0101 & 0011
//        # x = 0001 (which is 1 in decimal)
//        print(x)    # Output: 1
//        Steps in the Example
//        Initial Values:
//
//        x = 5 (binary: 0101)
//        y = 3 (binary: 0011)
//        Bitwise AND Operation:
//
//        0101 & 0011 results in 0001 (binary).
//        Assignment:
//
//        x is assigned the result of the bitwise AND operation, so x becomes 1.
//        Use Cases
//        The bitwise AND assignment operator is often used in low-level programming, such as:
//
//        Setting specific bits to 0 while leaving other bits unchanged.
//        Masking bits in bit manipulation tasks.
//        Performing operations that involve flags or binary data manipulation.
//        Overall, the &= operator is a shorthand way of performing a bitwise AND operation and assignment in a single step.
//
//





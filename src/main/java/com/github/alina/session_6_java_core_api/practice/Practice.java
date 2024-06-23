package com.github.alina.session_6_java_core_api.practice;

public class Practice {
    public static void main(String[] args) {
        String name = "Maria";
        String name2 = " Maria";

//        System.out.println(Integer.toHexString(System.identityHashCode(name)));
//        System.out.println(Integer.toHexString(System.identityHashCode(name2)));

        System.out.println(name == name2); //false
        System.out.println(name.equals(name2)); //true

        name.replace('a', 'b');

        StringBuilder sb = new StringBuilder();
        sb.append("John");
        sb.reverse();

        System.out.println(name);
        System.out.println(sb);
    }
}

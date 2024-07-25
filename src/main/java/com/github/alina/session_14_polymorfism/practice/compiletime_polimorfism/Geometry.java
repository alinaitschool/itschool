package com.github.alina.session_14_polymorfism.practice.compiletime_polimorfism;

public class Geometry {
    //calculate area of a circle
    public double area(double radius){
        return Math.PI * radius *radius;
    }
    //calculate area of a triangle
    public double area(double base, double height){
        return 0.5 * base * height;
    }
}

package com.github.alina.session_14_polymorfism.practice.composition_over_inheritance.composition;

public class TestCarComposition {
    public static void main(String[] args) {
        Engine carEngine= new Engine() {
            @Override
            protected void start() {

            }
        };
        Car car = new Car(carEngine);
        car.start();
    }
}

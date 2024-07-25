package com.github.alina.session_14_polymorfism.practice.composition_over_inheritance.composition;

public class Car {
    //HAS_A Car- Engine
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {

    }
}

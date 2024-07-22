package com.github.alina.session_14_polymorfism.practice.object_vs_reference;

public class TestVehicle {
    public static void main(String[] args) {
        Vehicle car= new Car();
        Vehicle truck = new Truck();
        Truck truck1 = new Truck();
        Car anotherCar =(Car)car;
        System.out.println(car.fuelType());
        System.out.println(truck.fuelType());
        System.out.println(truck1.fuelType());
        System.out.println(anotherCar.fuelType());


    }
}

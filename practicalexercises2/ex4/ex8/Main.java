package com.practicalexercises2.ex4.ex8;

public class Main {
    public static void main(String[] args) {

        Vehicle car = new Car(65);
        car.checkSpeed();

        Vehicle truck = new Truck(120);
        truck.checkSpeed();

        Vehicle bus = new Bus(60);
        bus.checkSpeed();

    }
}

package com.practicalexercises2.ex4.ex8;

public class Bus extends Vehicle{

    private double busSpeed;

    public Bus(double busSpeed){
        super();
        this.busSpeed = busSpeed;
    }

    public double getBusSpeed() {
        return busSpeed;
    }

    public void setBusSpeed(double busSpeed) {
        this.busSpeed = busSpeed;
    }

    @Override
    public void checkSpeed() {

        if(this.getBusSpeed() < 60){
            System.out.println("\"The bus is moving below the speed limit!");
        }
        else if(this.getBusSpeed() >= 60 && this.getBusSpeed() < 80){
            System.out.println("The bus is moving at the speed limit!");
        }
        else {
            System.out.println("The bus is moving above the speed limit!");
        }

    }
}

package com.practicalexercises2.ex4.ex8;

public class Truck extends Vehicle{
    private double truckSpeed;

    public Truck(double truckSpeed){
        super();
        this.truckSpeed = truckSpeed;
    }

    public double getTruckSpeed() {
        return truckSpeed;
    }

    public void setTruckSpeed(double truckSpeed) {
        this.truckSpeed = truckSpeed;
    }

    @Override
    public void checkSpeed() {
        if(this.getTruckSpeed() < 60){
            System.out.println("\"The bus is moving below the speed limit!");
        }
        else if(this.getTruckSpeed() >= 60 && this.getTruckSpeed() < 90){
            System.out.println("The bus is moving at the speed limit!");
        }
        else {
            System.out.println("The bus is moving above the speed limit!");
        }
    }
}

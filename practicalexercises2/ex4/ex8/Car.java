package com.practicalexercises2.ex4.ex8;

public class Car extends Vehicle{

    private double carSpeed;

    public Car(double carSpeed){
        super();
        this.carSpeed = carSpeed;
    }

    public double getCarSpeed() {
        return carSpeed;
    }

    public void setCarSpeed(double carSpeed) {
        this.carSpeed = carSpeed;
    }

    @Override
    public void checkSpeed() {

        if(this.getCarSpeed() < 80){
            System.out.println("The car is moving below the speed limit!");
        }
        else if(this.getCarSpeed() >= 80 && this.getCarSpeed() < 110){
            System.out.println("The car is moving at the speed limit!");
        }
        else {
            System.out.println("The car is moving above the speed limit!" );
        }
    }
}

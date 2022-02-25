package com.practicalexercises2.ex3;

public class Manager extends Person{
    private double employeeHourPayment;
    public Manager(String name, String surname, int age, double employeeHourPayment) {
        super(name, surname, age);
        this.employeeHourPayment = employeeHourPayment;
    }

    public double getEmployeeHourPayment() {
        return employeeHourPayment;
    }

    public void setEmployeeHourPayment(double employeeHourPayment) {
        this.employeeHourPayment = employeeHourPayment;
    }

    @Override
    public String toString() {
        return "Manager{" +
                super.toString() +
                " employeeHourPayment=" + employeeHourPayment +
                '}';
    }
}

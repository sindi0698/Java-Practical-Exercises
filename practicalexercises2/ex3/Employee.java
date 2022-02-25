package com.practicalexercises2.ex3;

public class Employee extends Person {
    private double employeeHourPayment;
    public Employee(String name, String surname, int age, double employeeHourPayment) {
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
        return "Employee{" +
                super.toString()+
                "employeeHourPayment=" + employeeHourPayment +
                '}';
    }
}

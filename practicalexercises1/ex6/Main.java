package com.practicalexercises1.ex6;

public class Main {
    public static void main(String[] args) {

        try {
            Manager manager = new Manager(1, "Admin", "Admin", 35, "admin@gmail.com", -205);
            System.out.println("Manager total salary is: " + manager.calculateManagerSalary());
            Employee employee = new Employee(2, "Employee", "employee", 34, "employee@gmail.com", 207);
            System.out.println("Employee total salary is: " + employee.calculateEmployeeSalary());
        }
        catch (NegativeHoursException e){
            System.out.println("Exception occured: "+ e);
        }
    }
}

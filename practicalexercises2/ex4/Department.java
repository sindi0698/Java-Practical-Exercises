package com.practicalexercises2.ex4;

public class Department {
    private static int departmentID = 1;
    private int id;
    private String departmentName;
    private int numberOfOffices;

    public Department(String departmentName, int numberOfOffices) {
        this.id = departmentID++;
        this.departmentName = departmentName;
        this.numberOfOffices = numberOfOffices;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id='" + id + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", numberOfOffices=" + numberOfOffices +
                '}';
    }
}

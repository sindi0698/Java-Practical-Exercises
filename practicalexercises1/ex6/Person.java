package com.practicalexercises1.ex6;

public class Person {
    private int id;
    private String name;
    private String surname;
    private int age;
    private String email;
    private int workHours;

    public Person(){}

    public Person(int id, String name, String surname, int age, String email, int workHours) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
        this.workHours = workHours;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setId(int id){
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }
}

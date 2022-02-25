package com.practicalexercises2.ex4;

public class User {
    private static int userID = 1;
    private int id;
    private String name;
    private String surname;
    private int age;
    private String role;

    public User(String name, String surname, int age, String role) {
        this.id = userID++;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", role='" + role + '\'' +
                '}';
    }
}

package com.school;

public class Student {
    private int id;
    private String name;
    private int age;

    // Constructor
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student ID: " + id + ", Name: " + name + ", Age: " + age);
    }
}

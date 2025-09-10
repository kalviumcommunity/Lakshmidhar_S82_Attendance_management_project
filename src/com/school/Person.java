package com.school;

public class Person {
    private static int nextPersonId = 1;

    private int personId;
    private String name;

    public Person(String name) {
        this.personId = nextPersonId++;
        this.name = name;
    }

    public int getPersonId() {
        return personId;
    }

    public String getName() {
        return name;
    }

    public void displayDetails() {
        System.out.println("Person ID: P" + personId + ", Name: " + name);
    }
}

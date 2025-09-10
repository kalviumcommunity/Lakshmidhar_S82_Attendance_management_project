package com.school;

public class Student extends Person implements Storable {
    private static int nextStudentIdCounter = 1;
    private int studentId;

    public Student(String name) {
        super(name);
        this.studentId = nextStudentIdCounter++;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public void displayDetails() {
        System.out.println("Student ID: S" + studentId + ", Name: " + getName());
    }

    @Override
    public String toStorageString() {
        return "S" + studentId + "," + getName();
    }
}

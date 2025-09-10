package com.school;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Lakshmidhar");
        Student s2 = new Student("John");
        Student s3 = new Student("Priyamtha");

        Course c1 = new Course("Mathematics");
        Course c2 = new Course("Computer Science");

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();

        c1.displayDetails();
        c2.displayDetails();
    }
}

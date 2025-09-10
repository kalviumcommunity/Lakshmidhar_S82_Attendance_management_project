package com.school;

public class Main {
    public static void main(String[] args) {
       
        Student[] students = {
            new Student(1, "Alice", 20),
            new Student(2, "Bob", 21),
            new Student(3, "Charlie", 19)
        };

        Course[] courses = {
            new Course("CS101", "Intro to Programming", 4),
            new Course("MATH201", "Calculus II", 3),
            new Course("PHY301", "Physics", 4)
        };

        System.out.println("---- Student Details ----");
        for (Student s : students) {
            s.displayDetails();
        }

        System.out.println("\n---- Course Details ----");
        for (Course c : courses) {
            c.displayDetails();
        }
    }
}

package com.school;

public class Course {
    private String courseCode;
    private String courseName;
    private int credits;

    // Constructor
    public Course(String courseCode, String courseName, int credits) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
    }

    // Getter methods
    public String getCourseCode() { return courseCode; }
    public String getCourseName() { return courseName; }
    public int getCredits() { return credits; }

    // Method to display course details
    public void displayDetails() {
        System.out.println("Course Code: " + courseCode + ", Name: " + courseName + ", Credits: " + credits);
    }
}

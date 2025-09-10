package com.school;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        Student s1 = new Student("Lakshmidhar");
        Student s2 = new Student("John");

        
        Course c1 = new Course("Mathematics");
        Course c2 = new Course("Computer Science");

        
        List<AttendanceRecord> attendanceLog = new ArrayList<>();
        attendanceLog.add(new AttendanceRecord(s1.getStudentId(), c1.getCourseId(), "Present"));
        attendanceLog.add(new AttendanceRecord(s2.getStudentId(), c2.getCourseId(), "Absent"));
        attendanceLog.add(new AttendanceRecord(s1.getStudentId(), c2.getCourseId(), "Late")); // invalid

      
        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        FileStorageService.saveToFile(students, "students.txt");

        
        List<Course> courses = new ArrayList<>();
        courses.add(c1);
        courses.add(c2);
        FileStorageService.saveToFile(courses, "courses.txt");

        FileStorageService.saveToFile(attendanceLog, "attendance_log.txt");
    }
}

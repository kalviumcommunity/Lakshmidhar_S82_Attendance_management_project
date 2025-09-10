package com.school;

public class Main {
    public static void main(String[] args) {
 
        Student s1 = new Student("Lakshmidhar");
        Student s2 = new Student("John");

        Teacher t1 = new Teacher("Priyamtha", "Mathematics");

        Staff st1 = new Staff("Shiva", "Librarian");

        s1.displayDetails();
        s2.displayDetails();
        t1.displayDetails();
        st1.displayDetails();
    }
}

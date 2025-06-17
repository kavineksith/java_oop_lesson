package org.example.Inheritance;

public class Student extends Person {
    private String studentId;
    private String course;

    public Student(String name, int age, String studentId, String course) {
        super(name, age);
        this.studentId = studentId;
        this.course = course;
    }

    public void displayStudentInfo() {
        super.display();
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
    }
}
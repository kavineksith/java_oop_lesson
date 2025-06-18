package org.example.Inheritance;

public class Teacher extends Person {
    private String teacherId;
    private String course;

    public Teacher(String name, int age, String teacherId, String course) {
        super(name, age);
        this.teacherId = teacherId;
        this.course = course;
    }

    public void displayStudentInfo() {
        super.display();
        System.out.println("Teacher ID: " + teacherId);
        System.out.println("Course: " + course);
    }
}
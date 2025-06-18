package org.example.Constructors;

import org.example.Inheritance.Student;

public class Students {
    private int stu_id;
    private String fname;
    private String lname;
    private double gpa;
    private String email;
    private String phoneNumber;

    // No Argument Constructor
    public Students() {
        this(1, "David", "Richard", 4.5, "davidrichard@stu.doc", "+91-1234567890");
    }

    // Required Argument Constructor
    public Students(int stu_id, String fname, String lname) {
        this(stu_id, fname, lname, 5.7, "unknow@info.co", "+91-1234567890");
    }

    // Full Parameterized Constructor (All Arguments Constructor)
    public Students(int stu_id, String fname, String lname, double gpa, String email, String phoneNumber) {
        this.stu_id = stu_id;
        this.fname = fname;
        this.lname = lname;
        this.gpa = gpa;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void displayInfo() {
        System.out.println("Student ID: " + stu_id);
        System.out.println("First Name: " + fname);
        System.out.println("Last Name: " + lname);
        System.out.println("GPA: " + gpa);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
    }

    public static void main(String[] args) {
        Students s1 = new Students();
        Students s2 = new Students(101, "John", "Doe");
        Students s3 = new Students(102, "Reena", "Jasmin", 5.8, "reena.jasmin@info.fi", "+91-9876543210");

        System.out.println("--- Displaying Student Info ---");
        s1.displayInfo();
        System.out.println();
        s2.displayInfo();
        System.out.println();
        s3.displayInfo();
    }
}

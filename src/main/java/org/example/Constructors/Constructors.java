package org.example.Constructors;

public class Constructors {
    public static void main(String[] args) {
        System.out.println("--- Creating e1 ---");
        Employee e1 = new Employee();

        System.out.println("\n--- Creating e2 ---");
        int emp_id = 101; // Example employee ID
        Employee e2 = new Employee(emp_id);

        System.out.println("\n--- Creating e3 ---");
        Employee e3 = new Employee(102, "Alice");

        System.out.println("\n--- Creating e4 ---");
        Employee e4 = new Employee(103, "Bob", 55000.0);

        System.out.println("\n--- Displaying Info ---");
        e1.displayInfo();
        System.out.println();
        e2.displayInfo();
        System.out.println();
        e3.displayInfo();
        System.out.println();
        e4.displayInfo();
    }
}
// This code demonstrates the use of constructors in Java, including default, parameterized, and constructor chaining.
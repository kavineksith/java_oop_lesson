package org.example.Constructors;

public class Employee {
    private int id; // field (attribute) of the class
    private String name;
    private double salary;

    // Default constructor
    public Employee() { // behavior of the default constructor
        this(0, "Unknown", 0.0); // Calls the parameterized constructor using this()
        System.out.println("Default constructor called.");
    }

    // Constructor with one parameter
    public Employee(int id) {
        this(id, "Unnamed", 0.0); // Chaining constructor
        System.out.println("Constructor with ID only called.");
    }

    // Constructor with two parameters
    public Employee(int id, String name) {
        this(id, name, 0.0); // Chaining constructor
        System.out.println("Constructor with ID and Name called.");
    }

    // Fully parameterized constructor
    public Employee(int id, String name, double salary) {
        this.id = id;           // Assigns current object's field
        this.name = name;
        this.salary = salary;
        System.out.println("Parameterized constructor called.");
    }

    // Method to display employee info
    public void displayInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}

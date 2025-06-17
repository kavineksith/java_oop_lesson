package org.example.Abstraction;

public abstract class Shape {
    private String color;

    // Constructor
    public Shape(String color) {
        this.color = color;
    }

    // Abstract method
    public abstract double getArea();

    // Concrete method
    public String getColor() {
        return color;
    }

    public void displayInfo() {
        System.out.println("Shape Color: " + color);
    }
}

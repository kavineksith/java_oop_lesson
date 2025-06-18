package org.example.Abstraction;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Triangle Base: " + base + ", Height: " + height);
    }
}

package org.example.Abstraction;

public class Square extends Shape {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Square Side Length: " + side);
    }
}

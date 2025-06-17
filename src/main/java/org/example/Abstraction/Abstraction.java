package org.example.Abstraction;

public class Abstraction {
    public static void main(String[] args) {
        Shape circle = new Circle("Red", 5.0);
        Shape rectangle = new Rectangle("Blue", 4.0, 6.0);

        circle.displayInfo();
        System.out.println("Circle Area: " + circle.getArea());

        rectangle.displayInfo();
        System.out.println("Rectangle Area: " + rectangle.getArea());
    }
}

package org.example.Polymorphism;

public class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add an array of integers
    public int add(int[] numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        return sum;
    }

    // Subtraction methods
    public int subtract(int a, int b) {
        return a - b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication methods
    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    // Division methods with basic validation
    public int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Division by zero is not allowed.");
        return a / b;
    }

    public double divide(double a, double b) {
        if (b == 0.0) throw new ArithmeticException("Division by zero is not allowed.");
        return a / b;
    }
}

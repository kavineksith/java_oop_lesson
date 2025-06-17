package org.example.Polymorphism;

public class Polymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator(); // Create an instance of Calculator

        System.out.println("Add 2 + 3: " + calc.add(2, 3));
        System.out.println("Add 2.5 + 3.5: " + calc.add(2.5, 3.5));
        System.out.println("Add 1 + 2 + 3: " + calc.add(1, 2, 3));
        System.out.println("Add array: " + calc.add(new int[]{1, 2, 3, 4}));

        System.out.println("Subtract 10 - 4: " + calc.subtract(10, 4));
        System.out.println("Multiply 3 * 5: " + calc.multiply(3, 5));
        System.out.println("Divide 20 / 4: " + calc.divide(20, 4));
    }
}
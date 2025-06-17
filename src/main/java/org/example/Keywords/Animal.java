package org.example.Keywords;

public class Animal {
    protected String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called.");
    }

    // Method
    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }

    public void displayInfo() {
        System.out.println("Animal name: " + name);
    }
}

package org.example.Keywords;

public class Dog extends Animal {
    private String breed;

    // Constructor using `super` and `this`
    public Dog(String name, String breed) {
        super(name);           // Call superclass constructor
        this.breed = breed;    // Refer to current class field
        System.out.println("Dog constructor called.");
    }

    // Method overriding with `super` keyword
    @Override
    public void makeSound() {
        super.makeSound();     // Call superclass version
        System.out.println("Dog barks.");
    }

    public void showDetails() {
        this.displayInfo();    // Call current class's inherited method
        System.out.println("Breed: " + this.breed);
    }
}

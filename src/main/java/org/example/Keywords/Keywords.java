package org.example.Keywords;

public class Keywords {
    public static void main(String[] args) {
        // Create an instance of Animal
        Animal animal = new Animal("Lion");
        animal.makeSound();
        animal.displayInfo();

        // Create an instance of Dog
        Dog dog = new Dog("Buddy", "Golden Retriever");
        dog.makeSound();       // Calls overridden method
        dog.showDetails();     // Shows use of `this`
    }
}

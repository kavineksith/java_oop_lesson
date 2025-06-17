package org.example.Interfaces;

public interface Vehicle {
    // Abstract method (must be implemented by the class)
    void start();

    // Abstract method (must be implemented by the class)
    void stop();

    // Default method (with implementation)
    default void honk() {
        System.out.println("Vehicle is honking!");
    }

    // Static method (can be called directly on the interface)
    static void displayVehicleInfo() {
        System.out.println("Vehicles are important for transportation.");
    }
}
// Note: Interfaces can contain abstract methods, default methods, and static methods.
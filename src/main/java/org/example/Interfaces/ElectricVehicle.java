package org.example.Interfaces;

public interface ElectricVehicle {
    // Abstract method
    void charge();

    // Default method (to show behavior specific to Electric Vehicles)
    default void batteryStatus() {
        System.out.println("Battery status: Charging...");
    }
}

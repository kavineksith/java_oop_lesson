package org.example.Interfaces;

public class Car implements Vehicle, ElectricVehicle {

    @Override
    public void start() {
        System.out.println("Car is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping.");
    }

    @Override
    public void charge() {
        System.out.println("Car is charging.");
    }

    // Using default method from Vehicle interface
    @Override
    public void honk() {
        System.out.println("Car is honking!");
    }

    // Using default method from ElectricVehicle interface
    @Override
    public void batteryStatus() {
        System.out.println("Electric Car battery is at 80%.");
    }
}
// Note: The Car class implements both Vehicle and ElectricVehicle interfaces,
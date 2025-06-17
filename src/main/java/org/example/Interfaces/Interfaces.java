package org.example.Interfaces;

public class Interfaces {

    public static void main(String[] args) {
        // Create an instance of Car
        Car myCar = new Car();

        // Call methods from Vehicle interface
        myCar.start();
        myCar.honk();

        // Call methods from ElectricVehicle interface
        myCar.charge();
        myCar.batteryStatus();

        // Call stop method from Vehicle interface
        myCar.stop();

        // Call static method from Vehicle interface
        Vehicle.displayVehicleInfo();
    }
}

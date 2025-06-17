package org.example.Encapsulation;

public class User {
    public static void main(String[] args) {
        // Create an object with initial values using the constructor
        AdvancedEncapsulation user = new AdvancedEncapsulation(
                101,
                "Alice",
                "alice@example.com",
                25,
                "123 Main St",
                "555-1234"
        );

        // Get values using getters
        System.out.println("User ID: " + user.getUserID());
        System.out.println("Name: " + user.getUserName());
        System.out.println("Email: " + user.getUserEmail());
        System.out.println("Age: " + user.getUserAge());
        System.out.println("Address: " + user.getUserAddress());
        System.out.println("Phone: " + user.getUserPhoneNumber());

        // Set new values using setters
        user.setUserName("Bob");
        user.setUserEmail("bob@example.com");
        user.setUserAge(30);
        user.setUserAddress("456 Another St");
        user.setUserPhoneNumber("555-5678");

        // Print updated values
        System.out.println("\n--- Updated User Info ---");
        System.out.println("Name: " + user.getUserName());
        System.out.println("Email: " + user.getUserEmail());
        System.out.println("Age: " + user.getUserAge());
        System.out.println("Address: " + user.getUserAddress());
        System.out.println("Phone: " + user.getUserPhoneNumber());
    }
}
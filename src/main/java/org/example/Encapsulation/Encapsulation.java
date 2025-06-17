package org.example.Encapsulation;

public class Encapsulation {

    private String name;

    public Encapsulation() {
        this.name = "Guest User";
    }

    public Encapsulation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation();
        System.out.println("Default Name: " + encapsulation.getName());

        Encapsulation encapsulationWithName = new Encapsulation("John Doe");
        System.out.println("Custom Name: " + encapsulationWithName.getName());

        encapsulation.setName("Alex Redwood");
        System.out.println("Updated Name: " + encapsulation.getName());
    }
}

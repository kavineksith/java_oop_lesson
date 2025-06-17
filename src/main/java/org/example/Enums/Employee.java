package org.example.Enums;

public class Employee {
    private String name;
    private Role role;

    public Employee(String name, Role role) {
        this.name = name;
        this.role = role;
    }

    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Access Level: " + role.getAccessLevel());
    }

    public void showRoleTask() {
        switch (role) {
            case INTERN:
                System.out.println("Task: Assist teams and learn.");
                break;
            case DEVELOPER:
                System.out.println("Task: Write and maintain code.");
                break;
            case MANAGER:
                System.out.println("Task: Lead the development team.");
                break;
            case ADMIN:
                System.out.println("Task: System management and configuration.");
                break;
        }
    }
}

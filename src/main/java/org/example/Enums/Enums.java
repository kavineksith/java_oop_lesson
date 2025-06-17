package org.example.Enums;

public class Enums {
    public static void main(String[] args) {
        Employee e1 = new Employee("Alice", Role.DEVELOPER);
        Employee e2 = new Employee("Bob", Role.MANAGER);

        System.out.println("--- Employee 1 ---");
        e1.displayInfo();
        e1.showRoleTask();

        System.out.println("\n--- Employee 2 ---");
        e2.displayInfo();
        e2.showRoleTask();


        // Example usage of the Role enum
        Role intern = Role.INTERN;
        Role developer = Role.DEVELOPER;
        Role manager = Role.MANAGER;
        Role admin = Role.ADMIN;

        System.out.println("Intern Access Level: " + intern.getAccessLevel());
        System.out.println("Developer Access Level: " + developer.getAccessLevel());
        System.out.println("Manager Access Level: " + manager.getAccessLevel());
        System.out.println("Admin Access Level: " + admin.getAccessLevel());
    }
}

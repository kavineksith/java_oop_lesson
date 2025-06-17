package org.example.Enums;

public enum Role {
    INTERN("Limited Access"),
    DEVELOPER("Standard Access"),
    MANAGER("Full Access"),
    ADMIN("Admin Access");

    private final String accessLevel;

    // Enum constructor
    Role(String accessLevel) {
        this.accessLevel = accessLevel;
    }

    // Getter method
    public String getAccessLevel() {
        return accessLevel;
    }
}

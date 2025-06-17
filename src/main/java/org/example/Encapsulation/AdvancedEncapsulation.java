package org.example.Encapsulation;

public class AdvancedEncapsulation {

    // Private fields for user information
    private int userID;
    private String userName;
    private String userEmail;
    private int userAge;
    private String userAddress;
    private String userPhoneNumber;

    // Default constructor
    public AdvancedEncapsulation(int userID, String userName, String userEmail, int userAge, String userAddress, String userPhoneNumber) {
        this.userID = userID;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userAge = userAge;
        this.userAddress = userAddress;
        this.userPhoneNumber = userPhoneNumber;
    }

    // Getters and Setters

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }
}

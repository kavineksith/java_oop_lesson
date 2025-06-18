package org.example.Encapsulation;

public class Students {
    private int studentID;
    private String studentName;
    private String studentEmail;

    public Students(int studentID, String studentName, String studentEmail) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentEmail = studentEmail;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public static void main(String[] args) {
        Students s1 = new Students(
                101,
                "Pokemon",
                "pokemon@no-reply.co"
        );

        // Get values using getters
        System.out.println("User ID: " + s1.getStudentID());
        System.out.println("Name: " + s1.getStudentName());
        System.out.println("Email: " + s1.getStudentEmail());

        // Set new values using setters
        s1.setStudentID(47);
        s1.setStudentName("Agent 47");
        s1.setStudentEmail("47@contact.agency.xyz");

        // Print updated values
        System.out.println("User ID: " + s1.getStudentID());
        System.out.println("Name: " + s1.getStudentName());
        System.out.println("Email: " + s1.getStudentEmail());
    }
}

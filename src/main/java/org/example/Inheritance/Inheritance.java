package org.example.Inheritance;

public class Inheritance {
    public static void main(String[] args) {
        Student s1 = new Student(
                "Alice",
                20,
                "S12345",
                "Computer Science");
        s1.displayStudentInfo();

        Teacher t1 = new Teacher(
                "Bob",
                40,
                "T67890",
                "Mathematics");
        t1.displayTeacherInfo();
    }
}

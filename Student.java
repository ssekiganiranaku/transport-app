// Student.java
package com.mycompany.utms;
public class Student extends User {
    private String studentId;

    public Student(String username, String password, String studentId) {
        super(username, password);
        this.studentId = studentId;
    }

    @Override
    public void requestTransport() {
        System.out.println("Student " + getUsername() + " requested transport to campus.");
    }
}
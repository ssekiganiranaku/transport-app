// Lecturer.java
package com.mycompany.utms;
public class Lecturer extends User {
    private final String department;

    public Lecturer(String username, String password, String department) {
        super(username, password);
        this.department = department;
    }

    @Override
    public void requestTransport() {
        System.out.println("Lecturer " + getUsername() + " requested transport for lecture at " + department);
    }
}
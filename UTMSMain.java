// UTMSMain.java
package com.mycompany.utms;

import com.mycompany.utms.Bus;
import com.mycompany.utms.Driver;
import com.mycompany.utms.Lecturer;
import com.mycompany.utms.Student;
import com.mycompany.utms.TransportOfficer;
import com.mycompany.utms.User;
import com.mycompany.utms.Van;


public class UTMSMain {
    public static void main(String[] args) {
        // Polymorphism: requestTransport()
        User student = new Student("s123", "pass123", "STU456");
        User lecturer = new Lecturer("l456", "pass456", "Computer Science");
        User officer = new TransportOfficer("t789", "adminPass");

        student.requestTransport();
        lecturer.requestTransport();
        officer.requestTransport();

        // Interfaces and abstract methods
        Bus bus = new Bus(101, "BUS-VIC123", 40);
        Van van = new Van(201, "VAN-VIC456", true);

        bus.scheduleMaintenance();
        van.scheduleMaintenance();

        System.out.println("Bus Location: " + bus.getLocation());

        // Method overloading
        TransportOfficer to = new TransportOfficer("admin", "root");
        Driver d = new Driver("John Smith", "DL123456");

        to.assignDriver(bus, d);
        to.assignDriver(van, "Morning Shift");
    }
}
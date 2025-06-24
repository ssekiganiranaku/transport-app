// TransportOfficer.java
package com.mycompany.utms;
public class TransportOfficer extends User {

    public TransportOfficer(String username, String password) {
        super(username, password);
    }

    public void assignDriver(Bus bus, Driver driver) {
        System.out.println("Assigned driver " + driver.getName() + " to Bus ID: " + bus.getId());
    }

    public void assignDriver(Van van, String shiftTime) {
        System.out.println("Assigned Van ID: " + van.getId() + " for shift: " + shiftTime);
    }

    @Override
    public void requestTransport() {
        System.out.println("Transport Officer " + getUsername() + " is managing transport requests.");
    }
}
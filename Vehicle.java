// Vehicle.java
package com.mycompany.utms;
public abstract class Vehicle implements Serviceable, Trackable, Schedulable {
    private int id;
    private String registrationNumber;

    public Vehicle(int id, String registrationNumber) {
        this.id = id;
        this.registrationNumber = registrationNumber;
    }

    public int getId() { return id; }
    public String getRegistrationNumber() { return registrationNumber; }

    @Override
    public abstract void scheduleMaintenance();

    @Override
    public String getLocation() {
        return "GPS Location not implemented yet.";
    }

    @Override
    public void setSchedule(String schedule) {
        System.out.println("Schedule set to: " + schedule);
    }
}
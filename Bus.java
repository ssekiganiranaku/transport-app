// Bus.java
package com.mycompany.utms;
public class Bus extends Vehicle {
    private int capacity;

    public Bus(int id, String regNo, int capacity) {
        super(id, regNo);
        this.capacity = capacity;
    }

    @Override
    public void scheduleMaintenance() {
        System.out.println("Scheduled maintenance for Bus ID: " + getId());
    }

    @Override
    public String getLocation() {
        return "Bus GPS Location: 37.8199° S, 144.9863° E";
    }
}

// Van.java
package com.mycompany.utms;
public class Van extends Vehicle {
    private boolean isAccessible;

    public Van(int id, String regNo, boolean accessible) {
        super(id, regNo);
        this.isAccessible = accessible;
    }

    @Override
    public void scheduleMaintenance() {
        System.out.println("Scheduled maintenance for Van ID: " + getId());
    }

    @Override
    public String getLocation() {
        return "Van GPS Location: 37.8200° S, 144.9865° E";
    }
}
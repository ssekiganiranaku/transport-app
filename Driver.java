// Driver.java
package com.mycompany.utms;
public class Driver {
    private String name;
    private String licenseNumber;

    public Driver(String name, String licenseNumber) {
        this.name = name;
        this.licenseNumber = licenseNumber;
    }

    public String getName() { return name; }
    public String getLicenseNumber() { return licenseNumber; }
}
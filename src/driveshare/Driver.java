/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driveshare;

/**
 *
 * @author tsini
 */
public class Driver extends User{
    boolean driverPermit;
    String driverLicense;
    
    public Driver(){
        driverPermit = true;
        driverLicense = "";
    }

    
    //getters and setters
    public boolean isDriverPermit() {
        return driverPermit;
    }

    public void setDriverPermit(boolean driverPermit) {
        this.driverPermit = driverPermit;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }

    
    
}

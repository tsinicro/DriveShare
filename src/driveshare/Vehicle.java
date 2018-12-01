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
public class Vehicle implements Print{
    String vehicleMake;
    String vehicleNumber;
    String vehicleColor;
    int vehicleCapacity;
    String vehicleType;
    
    
    public Vehicle(){
        vehicleMake ="";
        vehicleNumber = "";
        vehicleColor = "";
        vehicleCapacity = 0;
        vehicleType= "";
    }

    public String getVehicleMake() {
        return vehicleMake;
    }

    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleColor() {
        return vehicleColor;
    }

    public void setVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
    }

    public int getVehicleCapacity() {
        return vehicleCapacity;
    }

    public void setVehicleCapacity(int vehicleCapacity) {
        this.vehicleCapacity = vehicleCapacity;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
    
    //PRINT methods
    public String getFull(){
        String n = this.getVehicleColor() + " " + this.getVehicleMake() + " " + this.getVehicleType();
        return n;
    }
    
    public void print(){
        System.out.println(this.getFull());
    }
    
    
   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driveshare;

/**
 *
 * @author smit3
 */
public class Trip {
    //variables
    float miles;
    Address pickup;
    Address destination;
    String pickupTime;
    String date;
    Passenger passenger;
    Driver driver;
    int numOfPassengers;
    
    //getters
    public float getMiles(){
        return miles;
    }
    
    public Address getPickupLoc(){
        return pickup;
    }
    
    public Address getDestinationLoc(){
        return destination;
    }
    
    public String getPUTime(){
        return pickupTime;
    }
    
    public String getDate(){
        return date;
    }
    
    public Passenger getPassenger(){
        return passenger;
    }
    
    public Driver getDriver(){
        return driver;
    }
    
    public int getNumPass(){
        return numOfPassengers;
    }
    
    //setters
    public void setMiles(int n){
        miles = n;
    }
    
    public void setPickup(Address n){
        pickup = n;
    }
    
    public void setDestination(Address n){
        destination = n;
    }
    
    public void setPickupTime(String n){
        pickupTime = n;
    }
    
    public void setDate(String n){
        date = n;
    }
    
    public void setPassenger(Passenger n){
        passenger = n;
    }
    
    public void setDriver(Driver n){
        driver = n;
    }
    
    public void setNumPass(int n){
        numOfPassengers = n;
    }
    
    //method to print out a trip
    public void printTrip(Trip a){
        System.out.println(a.getDriver() + "   " + a.driver.getPhoneNumber());
        System.out.println(a.getPassenger() + "   " + a.passenger.getPhoneNumber());
        System.out.println("from" + a.getPickupLoc() + "to " + a.getDestinationLoc());
        System.out.println("Pickup Time: " + a.getDate() + " " + a.getPUTime());
        System.out.println("Number of Passengers: " + a.getNumPass());
    }
    
    
    
}

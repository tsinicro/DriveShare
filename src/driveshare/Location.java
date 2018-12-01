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
public class Location {
    //variables
    Address pickup;
    String description;
    
    //getters
    public Address getPickup(){
        return pickup;
    }
    
    public String getDescription(){
        return description;
    }
    
    //setters
    public void setPickup(Address n){
        pickup = n;
    }
    
    public void setDescription(String n){
        description = n;
    }
    
    //PRINT methods
    public String getFull(){
        String n = (pickup.getFull() + "\n" + description);
        return n;
    }
    
    public void print(){
        System.out.println(this.getFull());
    }
    
    //constructor
    public Location(Address pu, String des){
        pickup = pu;
        description = des;
    }
}

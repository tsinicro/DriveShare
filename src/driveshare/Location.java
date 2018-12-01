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
    
    //method to print out description
    public void printDescription(){
        System.out.println("\n" + description + "\n");
    }
    
}

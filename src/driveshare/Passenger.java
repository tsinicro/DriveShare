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
public class Passenger extends User{
    boolean passDisability; 
    
    public Passenger(){
        passDisability = false;
    }

    //getters and setters
    public boolean getDis(){
        return passDisability;
    }
    
    public void setPassengerDisability(boolean n){
        passDisability = n;
    }
    
    //method to get passenger full name
    public String getName(){
        String n = this.getFirstname() + " " + this.getLastname();
        return n;
    }
    
}

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
public class Truck {
    //variables
    String bedType;
    String stepHeight;
    boolean heatedSeats;
    
    //getters
    public String getBedType(){
        return bedType;
    }
    
    public String getStepHeight(){
        return stepHeight;
    }
    
    public boolean getHeatedSeats(){
        return heatedSeats;
    }
    
    //setters
    public void setBedType(String b){
        bedType = b;
    }
    
    public void setStepHeight(String h){
        stepHeight = h;
    }
    
    public void setHeatedSeats(boolean n){
        heatedSeats = n;
    }
}

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
public class Car {
    //variables
    boolean heatedSeats;
    boolean AC;
    boolean cupholders;
    boolean aux;
    
    //getters
    public boolean getHeatedSeats(){
        return heatedSeats;
    }
    
    public boolean getAC(){
        return AC;
    }
    
    public boolean getCupholders(){
        return cupholders;
    }
    
    public boolean getAUX(){
        return aux;
    }
    
    //setters
    public void setHeatedSeats(boolean n){
        heatedSeats = n;
    }
    
    public void setAC(boolean n){
        AC = n;
    }
    
    public void setCupholders(boolean n){
        cupholders = n;
    }
    
    public void setAUX(boolean n){
        aux = n;
    }
    
}

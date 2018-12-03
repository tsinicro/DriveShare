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
public class Van extends Vehicle{
    //variables 
    int height;
    int weight;
    String doorType;
    
    //getter
    public int getHeight(){
        return height;
    }
    
    public int getWeight(){
        return weight;
    }
    
    
    public String getDoorType(){
        return doorType;
    }
    
    //setters
    public void setHeight(int h){
        height = h;
    }
    
    public void setWeight(int w){
        weight = w;
    }
    
    
    public void setDoorType(String d){
        doorType = d;
    }
}
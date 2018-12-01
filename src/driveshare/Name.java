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
public class Name implements Print{
    //variables
    String firstName;
    String middleName;
    String lastName;
     
    //constructor
    public Name() {
        firstName = "";
        middleName = "";
        lastName = "";       
    }
    
    //Construtor
    public Name(String fn, String ln){
        firstName= fn;
        lastName = ln;
    }
    
    //getters and setters

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    //PRINT methods
    public String getFull(){
        String n = (this.getFirstName() + " " + this.getLastName());
        return n;
    }
    
    public void print(){
        System.out.println(this.getFull());
    }
    
    
}

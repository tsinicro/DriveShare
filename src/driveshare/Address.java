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
public class Address implements Print{
    String streetAddress;
    String city;
    String state;
    String country; 
    String zipCode;
     
    public Address() {
        streetAddress="";
        city="";
        state="";
        country=""; 
        zipCode = "";               
    }
    
    public Address(String s1){
        streetAddress=s1;
    }

    
    //getters and setters
    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress1) {
        this.streetAddress = streetAddress1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    
    //PRINT methods
    public String getFull(){
        String n = (streetAddress + "\n" + city + ", " + state + " " + zipCode);
        return n;
    }
    
    public void print(){
        System.out.println(this.getFull());
    }

}

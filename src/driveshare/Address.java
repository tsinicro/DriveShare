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
public class Address{
      String streetAddress1;
     String streetAddress2;
   String city;
   String state;
   String country; 
   String ZIP;
     
    public Address() {
       streetAddress1="";
      streetAddress2="";
   city="";
   state="";
   country=""; 
    ZIP = "";
               
    }
    public Address(String s1, String s2){
    streetAddress1=s1;
      streetAddress2=s2;}
    //methods
    //get and set
    public void setstreetAddress1(String s1){
       streetAddress1= s1;
    }
    
    public String getstreetAddress1(){
       return streetAddress1; 
    }
    public void setstreetAddress(String s2){
       streetAddress2= s2;
    }
    
    public String getstreetAddress2(){
       return streetAddress2; 
    }
     public void setCity(String c){
        city = c;
    }
    
    public String getCity(){
       return city; 
    }
     public void setCountry(String cn){
        country = cn;
    }
    
    public String getCountry(){
       return country; 
    }
    public void setZip(String z){
        ZIP = z;
    }
    
    public String getZip(){
       return ZIP; 
    }
    public void setState(String s){
        state= s;
    }
    
    public String getState(){
       return state; 
    }
}

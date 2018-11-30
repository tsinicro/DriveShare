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
public class Contact{
      String homePhoneNumber;
     String workPhoneNumber;
   String email;
     
    public Contact() {
        homePhoneNumber = "";
        workPhoneNumber = "";
       email = "";
               
    }
    public Contact(String hp, String wp){
    homePhoneNumber = hp;
    workPhoneNumber = wp;}
    //methods
    //get and set
    public void setHomePhone(String hp){
        homePhoneNumber = hp;
    }
    
    public String getHomePhone(){
       return homePhoneNumber; 
    }
     public void setWorkPhone(String wp){
        workPhoneNumber = wp;
    }
    
    public String getWorkPhoneNumber(){
       return  workPhoneNumber; 
    }
     public void setEmail(String e){
        email = e;
    }
    
    public String getEmail(){
       return email; 
    }
}


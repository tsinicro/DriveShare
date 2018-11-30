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
public class Name extends User{
      String firstname;
     String middlename;
   String lastname;
     
    public Name() {
        firstname = "";
        middlename = "";
        lastname = "";
               
    }
    public Name(String fn, String ln){
    firstname= fn;
    lastname = ln;}
    //methods
    //get and set
    public void setFirstname(String fn){
        firstname = fn;
    }
    
    public String getFirstname(){
       return firstname; 
    }
     public void setMiddlename(String mn){
        middlename = mn;
    }
    
    public String getMiddlename(){
       return middlename; 
    }
     public void setLastname(String ln){
        lastname= ln;
    }
    
    public String getLastname(){
       return lastname; 
    }
}

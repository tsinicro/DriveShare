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
public class User {
    int userID;
    String password;
        Name userName;
        Address userAddress;
        Contact userContact;
    public User(){
         userID=0;
        password="";
        
        
        
    }
    public void setUserID(int id){
        userID=id;
    }
    public int getUserID(){
    return userID;}
    public void setPassword(String p){
        password = p;
    }
    public String getPassword(){
    return password;}
}

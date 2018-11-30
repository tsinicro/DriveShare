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
public class Passenger {
    boolean passDisability; 
    int passNum;
    
    public Passenger(){
    passDisability = false;
    passNum =0;}

    public boolean isPassDisability() {
        return passDisability;
    }

    public void setPassDisability(boolean passDisability) {
        this.passDisability = passDisability;
    }

    public int getPassNum() {
        return passNum;
    }

    public void setPassNum(int passNum) {
        this.passNum = passNum;
    }
}

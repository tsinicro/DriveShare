/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driveshare;
import java.util.*;

/**
 *
 * @author tsini
 */
public class DriveShare {
    public static ArrayList<Passenger> passengersList = new ArrayList<Passenger>();
    public static ArrayList<Driver> driversList = new ArrayList<Driver>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Login().setVisible(true);
        // TODO code application logic here
    }
    
}

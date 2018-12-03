package driveshare;

import java.util.*;

/**
 *
 * @author tsini
 */
public class DriveShare {

    public static ArrayList<Passenger> passengersList = new ArrayList<Passenger>();
    public static ArrayList<Driver> driversList = new ArrayList<Driver>();
    public static Passenger currentPassenger = new Passenger();
    public static Driver currentDriver = new Driver();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Set the Nimbus look and feel. Netbeans makes this in the forms usually to make them nicer. */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //Begin GUI
        createDemoUsers();
        new Login().setVisible(true);
    }

    public static void createDemoUsers() {
        //Daisy
        Passenger daisy = new Passenger();
        daisy.setFirstname("Daisy");
        daisy.setLastname("Buchanan");
        daisy.setStreetAddress("205 North Russell Street");
        daisy.setCity("West Lafayette");
        daisy.setState("Indiana");
        daisy.setZipCode("47906");
        daisy.setEmail("daisy@gmail.com");
        daisy.setPassword("password");
        passengersList.add(daisy);

        //Jay 
        Driver jay = new Driver();
        jay.setFirstname("Jay");
        jay.setLastname("Gatsby");
        jay.setStreetAddress("1016 W Stadium Ave");
        jay.setCity("West Lafayette");
        jay.setState("Indiana");
        jay.setZipCode("47906");
        jay.setEmail("jay@gmail.com");
        jay.setPassword("password");
        jay.setDriverLicense("1234-56-7890");
        driversList.add(jay);
    }

}

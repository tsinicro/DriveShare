package rebu;

//This is rebu login page 

import java.util.ArrayList;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import sun.applet.Main;

public class RebU {

    //Shared variables
    public static ArrayList<Passenger> passengerList = new ArrayList<Passenger>();
    public static ArrayList<Driver> driverList = new ArrayList<Driver>();
    public static ArrayList<Trip> tripList = new ArrayList<Trip>();

    //This is where the program starts
    public static void main(String[] args) {
        // Set the Nimbus look and feel. Netbeans makes this in the forms usually to make them nicer.
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RebU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RebU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RebU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RebU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        createTestUsers();
        playMusic();

        //Begin GUI
        new LogIn().setVisible(true);
        
    }

    //Create users for use in testing
    private static void createTestUsers() {

        //Daisy
        passengerList.add(new Passenger(
                new Name("Daisy", "Buchanan"),
                "password",
                new Address("205 North Russell Street", "West Lafayette", "Indiana", "United States", "47906"),
                new Contact("7654900002", "daisy@gmail.com"),
                false
        ));

        //Jay 
        driverList.add(new Driver(
                new Name("Jay", "Gatsby"),
                "password",
                new Address("1016 W Stadium Ave", "West Lafayette", "Indiana", "United States", "47906"),
                new Contact("7654900001", "jay@gmail.com"),
                "1234567890",
                new Car("Rolls-Royce", "AAAA0001", "red", 4, false, false, false, false)
        ));

    }

    //Plays "I'm the map" (courtesy of stackoverflow)
    private static synchronized void playMusic() {
        new Thread(new Runnable() {
            public void run() {
                try {
                    Clip clip = AudioSystem.getClip();
                    AudioInputStream inputStream = AudioSystem.getAudioInputStream(
                            Main.class.getResourceAsStream("/rebu/res/iTM.wav"));
                    clip.open(inputStream);
                    clip.start();
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
            }
        }).start();
    }
}

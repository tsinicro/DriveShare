package driveshare;

/**
 *
 * @author tsini
 */
public class Passenger extends User implements Print {

    boolean passDisability;

    public Passenger() {
        passDisability = false;
    }

    //getters and setters
    public boolean getDis() {
        return passDisability;
    }

    public void setPassengerDisability(boolean n) {
        passDisability = n;
    }

    //method to get passenger full name
    public String getName() {
        String n = this.getFirstname() + " " + this.getLastname();
        return n;
    }

    //PRINT method 
    public String getFull() {
        String n = (userName.getFull() + " " + userContact.getFull());
        return n;
    }

    public void print() {
        System.out.println(this.getFull());
    }
}

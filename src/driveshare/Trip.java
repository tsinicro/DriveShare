package driveshare;

/**
 *
 * @author smit3
 */
public class Trip {

    //variables
    Origin pickup;
    Address destination;
    Passenger passenger;
    Driver driver;
    int numOfPassengers;

    //getters
    public float getMiles() {
        //Map should calculate this
        return 0;
    }

    public Location getPickupLoc() {
        return pickup.getLocation();
    }

    public Address getDestinationLoc() {
        return destination;
    }

    public String getPUTime() {
        return pickup.getTime();
    }

    public String getDate() {
        return pickup.getDate();
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public Driver getDriver() {
        return driver;
    }

    public int getNumPass() {
        return numOfPassengers;
    }

    //setters
    public void setPickup(Location n) {
        pickup.setLocation(n);
    }

    public void setDestination(Address n) {
        destination = n;
    }

    public void setPickupTime(String n) {
        pickup.setTime(n);
    }

    public void setDate(String n) {
        pickup.setDate(n);
    }

    public void setPassenger(Passenger n) {
        passenger = n;
    }

    public void setDriver(Driver n) {
        driver = n;
    }

    public void setNumPass(int n) {
        numOfPassengers = n;
    }

    //method to print out a trip
    public void printTrip(Trip a) {
        a.driver.print();
        a.passenger.print();
        System.out.println("Pickup Time: " + a.getDate() + " " + a.getPUTime());
        System.out.println("Number of Passengers: " + a.getNumPass());
    }

}

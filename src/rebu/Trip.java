package rebu;

public class Trip implements Print {

    //Variables
    Origin origin;
    Address destination;
    Passenger passenger;
    Driver driver;
    int numberPassengers;

    //Getters
    public float getMiles() {
        //Map should calculate this
        return 0;
    }

    public Origin getOrigin() {
        return origin;
    }

    public Address getDestination() {
        return destination;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public Driver getDriver() {
        return driver;
    }

    public int getNumberPassengers() {
        return numberPassengers;
    }

    //Setters
    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    public void setDestination(Address destination) {
        this.destination = destination;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setNumberPassengers(int numberPassengers) {
        this.numberPassengers = numberPassengers;
    }

    //Print methods
    public String getFull() {
        return driver.getFull() + " picking up " + passenger.getFull() + "/n" +
       "Pickup Time: " + origin.getDate() + " " + origin.getTime() + "/n" +
       "Number of Passengers: " + numberPassengers;
    }
    
    public void print() {
        System.out.println(getFull());
    }

}

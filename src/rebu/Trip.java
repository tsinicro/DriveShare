package rebu;

public class Trip implements Print {

    //Variables
    private Origin origin;
    private Location destination;
    private Passenger passenger;
    private Driver driver;
    private int numberPassengers;

    //These work like trackers to match a trip to an internal trip
    int passengerID;

    //Constructors
    public Trip(Origin origin, Location destination, Passenger passenger, Driver driver, int numberPassengers, int passengerID) {
        this.origin = origin;
        this.destination = destination;
        this.passenger = passenger;
        this.driver = driver;
        this.numberPassengers = numberPassengers;
        this.passengerID = passengerID;
    }

    public Trip(Origin origin, Location destination, Passenger passenger, Driver driver, int numberPassengers) {
        this.origin = origin;
        this.destination = destination;
        this.passenger = passenger;
        this.driver = driver;
        this.numberPassengers = numberPassengers;
        this.passengerID = 0;
    }

    public Trip(Origin origin, Location destination, Passenger passenger, int numberPassengers) {
        this.origin = origin;
        this.destination = destination;
        this.passenger = passenger;
        this.driver = new Driver();
        this.numberPassengers = numberPassengers;
        this.passengerID = 0;
    }

    public Trip() {
        this.origin = new Origin();
        this.destination = new Location();
        this.passenger = new Passenger();
        this.driver = new Driver();
        this.numberPassengers = 0;
        this.passengerID = 0;
    }

    //Getters
    public Origin getOrigin() {
        return origin;
    }

    public Location getDestination() {
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

    public int getPassengerID() {
        return passengerID;
    }

    //Setters
    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    public void setDestination(Location destination) {
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

    public void setPassengerID(int passengerID) {
        this.passengerID = passengerID;
    }


    //Print methods
    public String getFull() {
        return driver.getFull() + " picking up " + passenger.getFull() + "/n"
                + "Pickup Time: " + origin.getDate() + " " + origin.getTime() + "/n"
                + "Number of Passengers: " + numberPassengers;
    }

    public void print() {
        System.out.println(getFull());
    }

}

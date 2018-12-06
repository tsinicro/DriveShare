package rebu;

//This is the Driver class which:
//Inherits from the User class 
//Implements the print interface

public class Driver extends User implements Print {

    //Variables
    private String license;
    private Vehicle vehicle;

    //Constructors
    // Initializaton 
    public Driver() {
        super();
        license = "";
        vehicle = new Vehicle();
    }

    // Instantiation 
    public Driver(Name name, String password, Address address, Contact contact, String license, Vehicle vehicle) {
        super(name, password, address, contact);
        this.license = license;
        this.vehicle = vehicle;
    }
    
    public Driver(User user, String license, Vehicle vehicle) {
        super(user);
        this.license = license;
        this.vehicle = vehicle;
    }

    //Getters
    //get licence number
    public String getLicense() {
        return license;
    }

    // get vehicle number
    public Vehicle getVehicle() {
        return vehicle;
    }

    //Setters
    // set vehicle number 
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    // set license number 
    public void setLicense(String license) {
        this.license = license;
    }

    //Print methods
    public String getFull() {
        return name.getFull() + "\n" + license;
    }

    public void print() {
        System.out.println(getFull());
    }

}

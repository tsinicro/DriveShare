package driveshare;

public class Driver extends User implements Print {

    //Variables
    String license;
    Vehicle vehicle;

    //Constructors
    public Driver() {
        super();
        license = "";
        vehicle = new Vehicle();
    }

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
    public String getLicense() {
        return license;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    //Setters
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

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

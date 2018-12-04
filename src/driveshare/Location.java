package driveshare;

public class Location implements Print {

    //Variables
    Address address;
    String description;

    //Constructors
    public Location(Address address, String description) {
        this.address = address;
        this.description = description;
    }

    public Location() {
        this.address = new Address();
        description = "";
    }

    //Getters
    public Address getAddress() {
        return address;
    }

    public String getDescription() {
        return description;
    }

    //Setters
    public void setAddress(Address address) {
        this.address = address;
    }

    public void setDescription(String n) {
        description = n;
    }

    //Print methods
    public String getFull() {
        return address.getFull() + "\n" + description;
    }

    public void print() {
        System.out.println(getFull());
    }
}

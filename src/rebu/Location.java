package rebu;

// This is the location class which:
// Implements the Print Interface

public class Location implements Print {

    //Variables
    private Address address;
    private String description;

    //Constructors
    public Location(Address address, String description) {
        this.address = address;                 //Association to Address
        this.description = description;
    }

    public Location() {
        this.address = new Address();
        description = "";               // Locaton description a String 
    }

    //Getters
    //get Address
    public Address getAddress() {
        return address;
    }

    // get description of the location 
    public String getDescription() {
        return description;
    }

    //Setters
    // set address 
    public void setAddress(Address address) {
        this.address = address;
    }

    // set desciption 
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

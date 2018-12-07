package rebu;

// This is the Address class which implements the Print interface
public class Address implements Print {

    //Variables
    private String streetAddress;
    private String city;
    private String state;
    private String country;
    private String zipCode;

    //Constructors
    public Address() {
        streetAddress = "";
        city = "";
        state = "";
        country = "";
        zipCode = "";
    }

    //Initialization 
    public Address(String streetAddress) {
        this.streetAddress = streetAddress;
        city = "";
        state = "";
        country = "";
        zipCode = "";
    }

    //Instantiation of the Address variables 
    public Address(String streetAddress, String city, String state, String country, String zipCode) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipCode = zipCode;
    }

    //Getters
    // Get Street Address
    public String getStreetAddress() {
        return streetAddress;
    }

    // Get City
    public String getCity() {
        return city;
    }

    // Get State
    public String getState() {
        return state;
    }

    // Get Country 
    public String getCountry() {
        return country;
    }

    // Get Zip Code 
    public String getZipCode() {
        return zipCode;
    }

    //Setters
    // Set Street Address
    public void setStreetAddress(String streetAddress1) {
        this.streetAddress = streetAddress1;
    }

    // Set City
    public void setCity(String city) {
        this.city = city;
    }

    // Set state 
    public void setState(String state) {
        this.state = state;
    }

    // Set Country
    public void setCountry(String country) {
        this.country = country;
    }

    // Set Zip Code
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    //Print methods
    public String getFull() {
        return streetAddress + "\n" + city + ", " + state + " " + zipCode;
    }

    public void print() {
        System.out.println(this.getFull());
    }

}

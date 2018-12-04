package driveshare;

public class Address implements Print {

    //Variables
    String streetAddress;
    String city;
    String state;
    String country;
    String zipCode;

    //Constructors
    public Address() {
        streetAddress = "";
        city = "";
        state = "";
        country = "";
        zipCode = "";
    }

    public Address(String streetAddress) {
        this.streetAddress = streetAddress;
        city = "";
        state = "";
        country = "";
        zipCode = "";
    }

    public Address(String streetAddress, String city, String state, String country, String zipCode) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipCode = zipCode;
    }

    //Getters
    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    //Setters
    public void setStreetAddress(String streetAddress1) {
        this.streetAddress = streetAddress1;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

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

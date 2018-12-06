package rebu;

import java.util.ArrayList;

public class User implements Print {

    //Variables
    protected Name name;
    protected String password;
    protected Address address;
    protected Contact contact;
    protected ArrayList<Trip> tripList;

    //Constructors
    public User() {
        name = new Name();
        password = "";
        address = new Address();
        contact = new Contact();
        tripList = new ArrayList<Trip>();
    }

    public User(Name name, String password, Address address, Contact contact) {
        this.name = name;
        this.password = password;
        this.address = address;
        this.contact = contact;
        tripList = new ArrayList<Trip>();
    }

    public User(User user) {
        this.name = user.getName();
        this.password = user.getPassword();
        this.address = user.getAddress();
        this.contact = user.getContact();
        tripList = new ArrayList<Trip>();
    }

    //Getters
    public Name getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public Address getAddress() {
        return address;
    }

    public Contact getContact() {
        return contact;
    }
    
    public ArrayList<Trip> getTripList() {
        return tripList;
    }

    //Setters
    public void setName(Name name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
    
    public void setTripList(ArrayList<Trip> tripList) {
        this.tripList = tripList;
    }

    //Print methods
    public String getFull() {
        return name.getFull();
    }

    public void print() {
        System.out.println(getFull());
    }

}

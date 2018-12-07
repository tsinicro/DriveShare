package rebu;

import java.util.ArrayList;

// This is the Passenger class which inherits from the User class and implements the Print interface 
public class Passenger extends User implements Print {

    //Variables
    private boolean disability;

    //Constructors
    public Passenger() {
        super();
        disability = false;
    }

    public Passenger(Name name, String password, Address address, Contact contact, boolean disability) {
        super(name, password, address, contact);
        this.disability = disability;
    }

    public Passenger(User user, boolean disability) {
        super(user);
        this.disability = disability;
    }

    //Getters
    //get disability (T/F)
    public boolean getDisability() {
        return disability;
    }

    //Setters
    //set disability 
    public void setDisability(boolean disability) {
        disability = disability;
    }

    //Print methods
    public String getFull() {
        return name.getFull() + " " + contact.getFull();
    }

    public void print() {
        System.out.println(getFull());
    }
}

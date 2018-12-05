package rebu;

public class Passenger extends User implements Print {

    //Variables
    boolean disability;

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
    public boolean getDisability() {
        return disability;
    }

    //Setters
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

package rebu;

public class User implements Print {

    //Variables
    Name name;
    String password;
    Address address;
    Contact contact;

    //Constructors
    public User() {
        name = new Name();
        password = "";
        address = new Address();
        contact = new Contact();
    }
    
    public User(Name name, String password, Address address, Contact contact) {
        this.name = name;
        this.password = password;
        this.address = address;
        this.contact = contact;
    }
    
    public User(User user) {
        this.name = user.getName();
        this.password = user.getPassword();
        this.address = user.getAddress();
        this.contact = user.getContact();
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

    //Print methods
    public String getFull() {
        return name.getFull();
    }

    public void print() {
        System.out.println(getFull());
    }

}

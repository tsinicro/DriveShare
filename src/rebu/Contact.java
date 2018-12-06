package rebu;

// This is the Contact class which implements the Print interface

public class Contact implements Print {

    //Variables
    private String phone;
    private String email;

    // Initialization
    public Contact() {
        phone = "";
        email = "";
    }
    
    //Constructors
    //Instantiation of Contact variables
    public Contact(String phone, String email) {
        this.phone = phone;
        this.email = email;
    }

    //Getters
    //get phone
    public String getPhone() {
        return phone;
    }
    
    //get email 
    public String getEmail() {
        return email;
    }

    //Setters
    //set phone
    public void setPhone(String phone) {
        this.phone = phone;
    }

    //set email 
    public void setEmail(String email) {
        this.email = email;
    }

    //Print methods
    public String getFull() {
        return phone + " " + email;
    }

    public void print() {
        System.out.println(getFull());
    }

}

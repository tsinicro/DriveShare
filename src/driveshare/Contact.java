package driveshare;

/**
 *
 * @author tsini
 */
public class Contact implements Print {

    String phoneNumber;
    String email;

    public Contact() {
        phoneNumber = "";
        email = "";
    }

    public Contact(String phoneNumber, String email) {
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

//Getters and setters
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //PRINT methods
    public String getFull() {
        String n = (phoneNumber + " " + email);
        return n;
    }

    public void print() {
        System.out.println(this.getFull());
    }

}

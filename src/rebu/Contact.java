package rebu;

public class Contact implements Print {

    //Variables
    private String phone;
    private String email;

    //Constructors
    public Contact() {
        phone = "";
        email = "";
    }

    public Contact(String phone, String email) {
        this.phone = phone;
        this.email = email;
    }

    //Getters
    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    //Setters
    public void setPhone(String phone) {
        this.phone = phone;
    }

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

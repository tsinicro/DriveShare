package driveshare;

/**
 *
 * @author tsini
 */
public class User implements Print {

    String password;
    Name userName = new Name();
    Address userAddress = new Address();
    Contact userContact = new Contact();

    //getters and setters for USER
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //Name getter/setters
    public String getFirstname() {
        return userName.getFirstName();
    }

    public void setFirstname(String firstname) {
        this.userName.setFirstName(firstname);
    }

    public String getMiddlename() {
        return this.userName.getMiddleName();
    }

    public void setMiddlename(String middlename) {
        this.userName.setMiddleName(middlename);
    }

    public String getLastname() {
        return this.userName.getLastName();
    }

    public void setLastname(String lastname) {
        this.userName.setLastName(lastname);
    }

    public String getStreetAddress() {
        return this.userAddress.getStreetAddress();
    }

    public void setStreetAddress(String streetAddress1) {
        this.userAddress.setStreetAddress(streetAddress1);
    }

    public String getCity() {
        return this.userAddress.getCity();
    }

    public void setCity(String city) {
        this.userAddress.setCity(city);
    }

    public String getState() {
        return this.userAddress.getState();
    }

    public void setState(String state) {
        this.userAddress.setState(state);
    }

    public String getCountry() {
        return this.userAddress.getCountry();
    }

    public void setCountry(String country) {
        this.userAddress.setCountry(country);
    }

    public String getZipCode() {
        return this.userAddress.getZipCode();
    }

    public void setZipCode(String zipCode) {
        this.userAddress.setZipCode(zipCode);
    }

    public String getPhoneNumber() {
        return this.userContact.getPhoneNumber();
    }

    public void setPhoneNumber(String phoneNumber) {
        this.userContact.setPhoneNumber(phoneNumber);
    }

    public String getEmail() {
        return this.userContact.getEmail();
    }

    public void setEmail(String email) {
        this.userContact.setEmail(email);
    }

    //PRINT methods
    public String getFull() {
        return userName.getFull();
    }

    public void print() {
        System.out.println(this.getFull());
    }

}

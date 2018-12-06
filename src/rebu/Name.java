package rebu;

public class Name implements Print {

    //variables
    private String firstName;
    private String lastName;

    //constructor
    public Name() {
        firstName = "";
        lastName = "";
    }

    //Construtor
    public Name(String fn, String ln) {
        firstName = fn;
        lastName = ln;
    }

    //getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //PRINT methods
    public String getFull() {
        String n = (this.getFirstName() + " " + this.getLastName());
        return n;
    }

    public void print() {
        System.out.println(this.getFull());
    }

}

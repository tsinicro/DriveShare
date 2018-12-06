package rebu;

// This is the Name class which:
// Implements the Print interface 

public class Name implements Print {

    //variables
    private String firstName;
    private String lastName;

    // Initialization 
    public Name() {
        firstName = "";
        lastName = "";
    }

    //Construtor
    public Name(String fn, String ln) {
        firstName = fn;
        lastName = ln;
    }

    //getters 
    //get first name
    public String getFirstName() {
        return firstName;
    }

      public String getLastName() {
        return lastName;
    }
    
      
    // setters
      //set first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // set last name
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

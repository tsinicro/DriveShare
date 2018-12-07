package rebu;

// This is the Origin Class. It contains the variables for the trip origin.
public class Origin {

    //Variables
    private Location location;
    private String time;
    private String date;

    //Constructors
    // Initialization 
    public Origin() {
        location = new Location();
        time = "";
        date = "";
    }

    public Origin(Location location, String time, String date) {
        this.location = location;
        this.time = time;
        this.date = date;
    }

    //Getters
    // get location of origin  
    public Location getLocation() {
        return location;
    }

    // get time of departure 
    public String getTime() {
        return time;
    }

    // get date of trip 
    public String getDate() {
        return date;
    }

    //Setters
    // set location of origin 
    public void setLocation(Location location) {
        this.location = location;
    }

    // set time of departure 
    public void setTime(String newTime) {
        this.time = time;
    }

    // set date od departure 
    public void setDate(String date) {
        this.date = date;
    }
}

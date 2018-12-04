package driveshare;

public class Origin {

    //Variables
    Location location;
    String time;
    String date;

    //Constructors
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
    public Location getLocation() {
        return location;
    }

    public String getTime() {
        return time;
    }

    public String getDate() {
        return date;
    }

    //Setters
    public void setLocation(Location location) {
        this.location = location;
    }

    public void setTime(String newTime) {
        this.time = time;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

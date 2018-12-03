package driveshare;

/**
 *
 * @author jenki
 */
public class Origin {

    Location pickupLocation;
    String pickupTime;
    String pickupDate;

    public Origin() {
        pickupLocation = new Location();
        pickupTime = "";
        pickupDate = "";
    }

    public Origin(Location newLocation, String newPickupTime, String newPickupDate) {
        pickupLocation = newLocation;
        pickupTime = newPickupTime;
        pickupDate = newPickupDate;
    }

    //Getters
    public Location getLocation() {
        return pickupLocation;
    }

    public String getTime() {
        return pickupTime;
    }

    public String getDate() {
        return pickupDate;
    }

    //Setters
    public void setLocation(Location newLocation) {
        pickupLocation = newLocation;
    }

    public void setTime(String newTime) {
        pickupTime = newTime;
    }

    public void setDate(String newDate) {
        pickupDate = newDate;
    }
}

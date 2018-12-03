package driveshare;

/**
 *
 * @author smit3
 */
public class Truck extends Vehicle {

    //variables
    String bedType;
    String stepHeight;
    boolean heatedSeats;
    final String vehicleType = "truck";

    //Constructors
    public Truck() {
        super();
        bedType = "";
        stepHeight = "";
        heatedSeats = false;
    }

    public Truck(String make, String number, String color, int capacity, String newBedType, String newStepHeight, boolean newHeatedSeats) {
        super(make, number, color, capacity);
        bedType = newBedType;
        stepHeight = newStepHeight;
        heatedSeats = newHeatedSeats;
    }

    //getters
    public String getBedType() {
        return bedType;
    }

    public String getStepHeight() {
        return stepHeight;
    }

    public boolean getHeatedSeats() {
        return heatedSeats;
    }

    //setters
    public void setBedType(String b) {
        bedType = b;
    }

    public void setStepHeight(String h) {
        stepHeight = h;
    }

    public void setHeatedSeats(boolean n) {
        heatedSeats = n;
    }
}

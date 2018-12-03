package driveshare;

/**
 *
 * @author smit3
 */
public class Van extends Vehicle {

    //variables 
    int height;
    int weight;
    String doorType;
    boolean disabilityAccessible;
    final String vehicleType = "van";

    //Constructors
    public Van(String make, String number, String color, int capacity, int newHeight, int newWeight, String newDoorType, boolean newDisabilityAccessible) {
        super(make, number, color, capacity);
        height = newHeight;
        weight = newWeight;
        doorType = newDoorType;
        disabilityAccessible = newDisabilityAccessible;
    }

    public Van() {
        super();
        height = 0;
        weight = 0;
        doorType = "";
        disabilityAccessible = false;
    }

    //getter
    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getDoorType() {
        return doorType;
    }

    public boolean getDisabilityAccessible() {
        return disabilityAccessible;
    }

    //setters
    public void setHeight(int h) {
        height = h;
    }

    public void setWeight(int w) {
        weight = w;
    }

    public void setDoorType(String d) {
        doorType = d;
    }

    public void setDisabilityAccessible(boolean d) {
        disabilityAccessible = d;
    }
}

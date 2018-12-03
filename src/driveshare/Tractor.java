package driveshare;

/**
 *
 * @author smit3
 */
public class Tractor extends Vehicle {

    //variables
    int maxSpeed;
    String type;
    String turnType;

    //Constructors
    public Tractor() {
        super();
        maxSpeed = 0;
        type = "";
        turnType = "";
    }

    public Tractor(String make, String number, String color, int capacity, int newMaxSpeed, String newType, String newTurnType) {
        super(make, number, color, capacity);
        maxSpeed = newMaxSpeed;
        type = newType;
        turnType = newTurnType;
    }

    //getter 
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getType() {
        return type;
    }

    public String getTurnType() {
        return turnType;
    }

    //setters
    public void setMaxSpeed(int m) {
        maxSpeed = m;
    }

    public void setType(String t) {
        type = t;
    }

    public void setTurnType(String t) {
        turnType = t;
    }

}

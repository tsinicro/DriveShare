package driveshare;

/**
 *
 * @author smit3
 */
public class Tractor {

    //variables
    int maxSpeed;
    String type;
    String turnType;

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

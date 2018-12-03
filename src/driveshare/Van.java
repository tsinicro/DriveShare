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
}

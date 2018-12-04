package driveshare;

public class Van extends Vehicle {

    //Variables 
    int height;
    int weight;
    String doorType;
    boolean disabilityAccessible;
    final String vehicleType = "van";

    //Constructors
    public Van() {
        super();
        height = 0;
        weight = 0;
        doorType = "";
        disabilityAccessible = false;
    }

    public Van(String make, String number, String color, int capacity, int height, int weight, String doorType, boolean disabilityAccessible) {
        super(make, number, color, capacity);
        this.height = height;
        this.weight = weight;
        this.doorType = doorType;
        this.disabilityAccessible = disabilityAccessible;
    }

    public Van(Vehicle vehicle, int height, int weight, String doorType, boolean disabilityAccessible) {
        super(vehicle);
        this.height = height;
        this.weight = weight;
        this.doorType = doorType;
        this.disabilityAccessible = disabilityAccessible;
    }

    //Getters
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

    //Setters
    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setDoorType(String doorType) {
        this.doorType = doorType;
    }

    public void setDisabilityAccessible(boolean disabilityAccessible) {
        this.disabilityAccessible = disabilityAccessible;
    }
}

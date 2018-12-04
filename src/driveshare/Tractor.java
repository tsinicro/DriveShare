package driveshare;

public class Tractor extends Vehicle {

    //Variables
    int maxSpeed;
    String useType;
    String turnType;

    //Constructors
    public Tractor() {
        super();
        maxSpeed = 0;
        useType = "";
        turnType = "";
    }

    public Tractor(String make, String number, String color, int capacity, int maxSpeed, String useType, String turnType) {
        super(make, number, color, capacity);
        this.maxSpeed = maxSpeed;
        this.useType = useType;
        this.turnType = turnType;
    }

    //Getter 
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getUseType() {
        return useType;
    }

    public String getTurnType() {
        return turnType;
    }

    //Setters
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setType(String useType) {
        this.useType = useType;
    }

    public void setTurnType(String turnType) {
        this.turnType = turnType;
    }

}

package rebu;

public class Tractor extends Vehicle {

    //Variables
    private String useType;
    private String turnType;
    private int maxSpeed;

    //Constructors
    public Tractor() {
        super();
        maxSpeed = 0;
        useType = "";
        turnType = "";
    }

    public Tractor(String make, String number, String color, int capacity, String useType, String turnType, int maxSpeed) {
        super(make, number, color, capacity);
        this.useType = useType;
        this.turnType = turnType;
        this.maxSpeed = maxSpeed;
    }

    public Tractor(Vehicle vehicle, String useType, String turnType, int maxSpeed) {
        super(vehicle);
        this.useType = useType;
        this.turnType = turnType;
        this.maxSpeed = maxSpeed;
    }

    //Getter 
    public String getUseType() {
        return useType;
    }

    public String getTurnType() {
        return turnType;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    //Setters
    public void setType(String useType) {
        this.useType = useType;
    }

    public void setTurnType(String turnType) {
        this.turnType = turnType;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

}

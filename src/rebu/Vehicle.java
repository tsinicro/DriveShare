package rebu;

public class Vehicle implements Print {

    //Variables
    protected String make;
    protected String number;
    protected String color;
    protected int capacity;
    protected final String type = "";

    //Constructors
    public Vehicle() {
        make = "";
        number = "";
        color = "";
        capacity = 0;
    }

    public Vehicle(String make, String number, String color, int capacity) {
        this.make = make;
        this.number = number;
        this.color = color;
        this.capacity = capacity;
    }
    
    public Vehicle(Vehicle vehicle) {
        make= vehicle.getMake();
        number = vehicle.getNumber();
        color = vehicle.getColor();
        capacity = vehicle.getCapacity();
    }

    //Getters
    public String getMake() {
        return make;
    }

    public String getNumber() {
        return number;
    }

    public String getColor() {
        return color;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    //Setters
    public void setMake(String vehicleMake) {
        this.make = vehicleMake;
    }

    public void setNumber(String vehicleNumber) {
        this.number = vehicleNumber;
    }

    public void setColor(String vehicleColor) {
        this.color = vehicleColor;
    }

    public void setCapacity(int vehicleCapacity) {
        this.capacity = vehicleCapacity;
    }

    //Print methods
    public String getFull() {
        return color + " " + make + " " + type;
    }

    public void print() {
        System.out.println(getFull());
    }
}

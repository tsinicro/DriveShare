package driveshare;

/**
 *
 * @author tsini
 */
public class Vehicle implements Print {

    //variables
    String vehicleMake;
    String vehicleNumber;
    String vehicleColor;
    int vehicleCapacity;
    final String vehicleType = "";

    //Constructors
    public Vehicle() {
        vehicleMake = "";
        vehicleNumber = "";
        vehicleColor = "";
        vehicleCapacity = 0;
    }

    public Vehicle(String make, String number, String color, int capacity) {
        vehicleMake = make;
        vehicleNumber = number;
        vehicleColor = color;
        vehicleCapacity = capacity;
    }

    //Getters and setters
    public String getVehicleMake() {
        return vehicleMake;
    }

    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleColor() {
        return vehicleColor;
    }

    public void setVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
    }

    public int getVehicleCapacity() {
        return vehicleCapacity;
    }

    public void setVehicleCapacity(int vehicleCapacity) {
        this.vehicleCapacity = vehicleCapacity;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    //PRINT methods
    public String getFull() {
        return this.getVehicleColor() + " " + this.getVehicleMake() + " " + this.getVehicleType();
    }

    public void print() {
        System.out.println(this.getFull());
    }

}

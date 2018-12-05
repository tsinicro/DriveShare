package rebu;

public class Truck extends Vehicle {

    //Variables
    String bedType;
    int stepHeight;
    boolean heatedSeats;
    final String vehicleType = "truck";

    //Constructors
    public Truck() {
        super();
        bedType = "";
        stepHeight = 0;
        heatedSeats = false;
    }

    public Truck(String make, String number, String color, int capacity, String bedType, int stepHeight, boolean heatedSeats) {
        super(make, number, color, capacity);
        this.bedType = bedType;
        this.stepHeight = stepHeight;
        this.heatedSeats = heatedSeats;
    }
    
    public Truck(Vehicle vehicle, String bedType, int stepHeight, boolean heatedSeats) {
        super(vehicle);
        this.bedType = bedType;
        this.stepHeight = stepHeight;
        this.heatedSeats = heatedSeats;
    }

    //Getters
    public String getBedType() {
        return bedType;
    }

    public int getStepHeight() {
        return stepHeight;
    }

    public boolean getHeatedSeats() {
        return heatedSeats;
    }

    //Setters
    public void setBedType(String bedtype) {
        this.bedType = bedType;
    }

    public void setStepHeight(int stepHeight) {
        this.stepHeight = stepHeight;
    }

    public void setHeatedSeats(boolean heatedSeats) {
        this.heatedSeats = heatedSeats;
    }
}

package driveshare;

public class Car extends Vehicle {

    //Variables
    boolean heatedSeats;
    boolean AC;
    boolean cupholders;
    boolean aux;

    //Constructors
    public Car() {
        super();
        heatedSeats = false;
        AC = false;
        cupholders = false;
        aux = false;
    }

    public Car(String make, String number, String color, int capacity, boolean heatedSeats, boolean AC, boolean cupholders, boolean aux) {
        super(make, number, color, capacity);
        this.heatedSeats = heatedSeats;
        this.AC = AC;
        this.cupholders = cupholders;
        this.aux = aux;
    }
    
    public Car(Vehicle vehicle, boolean heatedSeats, boolean AC, boolean cupholders, boolean aux) {
        super(vehicle);
        this.heatedSeats = heatedSeats;
        this.AC = AC;
        this.cupholders = cupholders;
        this.aux = aux;
    }

    //Getters
    public boolean getHeatedSeats() {
        return heatedSeats;
    }

    public boolean getAC() {
        return AC;
    }

    public boolean getCupholders() {
        return cupholders;
    }

    public boolean getAux() {
        return aux;
    }

    //Setters
    public void setHeatedSeats(boolean heatedSeats) {
        this.heatedSeats = heatedSeats;
    }

    public void setAC(boolean AC) {
        this.AC = AC;
    }

    public void setCupholders(boolean cupholders) {
        this.cupholders = cupholders;
    }

    public void setAux(boolean aux) {
        this.aux = aux;
    }

}

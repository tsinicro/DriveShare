package rebu;

// This is the Car class which inherits from the Vehicle class 
public class Car extends Vehicle {

    //Variables
    private boolean heatedSeats;
    private boolean AC;
    private boolean cupholders;
    private boolean aux;

    //Constructors
    //Initialization of the Car variable
    public Car() {
        super();
        heatedSeats = false;
        AC = false;
        cupholders = false;
        aux = false;
    }

    // Instantiation for Car 
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
    // get heated seats (T/F)
    public boolean getHeatedSeats() {
        return heatedSeats;
    }

    // get AC ( air conditioning ) (T/F)
    public boolean getAC() {
        return AC;
    }
    
    // get cup holder (T/F)
    public boolean getCupholders() {
        return cupholders;
    }

    // get AUX (T/F)
    public boolean getAux() {
        return aux;
    }

    //Setters
    //set heated seats 
    public void setHeatedSeats(boolean heatedSeats) {
        this.heatedSeats = heatedSeats;
    }

    // set AC 
    public void setAC(boolean AC) {
        this.AC = AC;
    }

    // set cup holders 
    public void setCupholders(boolean cupholders) {
        this.cupholders = cupholders;
    }
    
    // set Aux 
    public void setAux(boolean aux) {
        this.aux = aux;
    }
}

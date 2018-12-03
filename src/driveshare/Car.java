package driveshare;

/**
 *
 * @author smit3
 */
public class Car extends Vehicle {

    //variables
    boolean heatedSeats;
    boolean AC;
    boolean cupholders;
    boolean aux;

    //Constructors
    public Car() {
        super();
        boolean heatedSeats = false;
        boolean AC = false;
        boolean cupholders = false;
        boolean aux = false;
    }

    public Car(String make, String number, String color, int capacity, boolean newHeatedSeats, boolean newAC, boolean newCupholders, boolean newAux) {
        super(make, number, color, capacity);
        boolean heatedSeats = newHeatedSeats;
        boolean AC = newAC;
        boolean cupholders = newCupholders;
        boolean aux = newAux;
    }

    //getters
    public boolean getHeatedSeats() {
        return heatedSeats;
    }

    public boolean getAC() {
        return AC;
    }

    public boolean getCupholders() {
        return cupholders;
    }

    public boolean getAUX() {
        return aux;
    }

    //setters
    public void setHeatedSeats(boolean n) {
        heatedSeats = n;
    }

    public void setAC(boolean n) {
        AC = n;
    }

    public void setCupholders(boolean n) {
        cupholders = n;
    }

    public void setAUX(boolean n) {
        aux = n;
    }

}

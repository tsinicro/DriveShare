package driveshare;

/**
 *
 * @author tsini
 */
public class Driver extends User implements Print {

    String driverLicense;
    Vehicle driverVehicle;

    public Driver() {
        driverLicense = "";
    }

    //getters and setters
    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }

    public String getVehicleMake() {
        return driverVehicle.getVehicleMake();
    }

    public void setVehicleMake(String vehicleMake) {
        this.driverVehicle.setVehicleMake(vehicleMake);
    }

    public String getVehicleNumber() {
        return driverVehicle.getVehicleNumber();
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.driverVehicle.setVehicleNumber(vehicleNumber);
    }

    public String getVehicleColor() {
        return driverVehicle.getVehicleColor();
    }

    public void setVehicleColor(String vehicleColor) {
        this.driverVehicle.setVehicleColor(vehicleColor);
    }

    public int getVehicleCapacity() {
        return driverVehicle.getVehicleCapacity();
    }

    public void setVehicleCapacity(int vehicleCapacity) {
        this.driverVehicle.setVehicleCapacity(vehicleCapacity);
    }

    public String getVehicleType() {
        return driverVehicle.getVehicleType();
    }

    //PRINT methods
    public String getFull() {
        String n = (userName.getFull() + "\n" + "\n" + this.getDriverLicense());
        return n;
    }

    public void print() {
        System.out.println(this.getFull());
    }

}

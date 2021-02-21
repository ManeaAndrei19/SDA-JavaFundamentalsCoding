package advanced.generic_types;

public class Garage<T extends Vehicle> {
    private T vehicle;

    public Garage(T vehicle) {
        this.vehicle = vehicle;
    }

    public T getVehicle() {
        return vehicle;
    }

    public void setVehicle(T vehicle) {
        this.vehicle = vehicle;
    }

    public void repair() {
        vehicle.setMaxSpeed(vehicle.getMaxSpeed() + 10);
    }
}

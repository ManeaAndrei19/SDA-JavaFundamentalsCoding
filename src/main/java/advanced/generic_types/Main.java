package advanced.generic_types;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(110);
        GenericBox<Car> carBox = new GenericBox<>(car);

        System.out.println(carBox.getItem().getMaxSpeed());

        Car car2 = new Car(320);
        Garage<Car> carGarage = new Garage<>(car2);

        carGarage.repair();
        System.out.println(carGarage.getVehicle().getMaxSpeed());

        Car car3 = new Car(210);
        Garage<Vehicle> vehicleGarage = new Garage<>(car3);

        vehicleGarage.repair();
        System.out.println(vehicleGarage.getVehicle().getMaxSpeed());

    }
}

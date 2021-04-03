package design_patterns.creational.abstract_factory;

import design_patterns.creational.abstract_factory.mercedes.MercedesCarFactory;
import design_patterns.creational.abstract_factory.tesla.TeslaCarFactory;

public class AutoDealer {
    public Car order(int budget, boolean isElectric) {
        CarFactory carFactory;
        if (isElectric) {
            carFactory = new TeslaCarFactory();
        } else {
            carFactory = new MercedesCarFactory();
        }
        return carFactory.order(budget);
    }
}

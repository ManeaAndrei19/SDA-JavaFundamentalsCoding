package design_patterns.creational.abstract_factory.mercedes;

import design_patterns.creational.abstract_factory.Car;
import design_patterns.creational.abstract_factory.CarFactory;

public class MercedesCarFactory extends CarFactory {
    @Override
    public Car order(int budget) {
        if (budget < 20000) {
            return new Glk();
        }
        if (budget < 40000) {
            return new Glc();
        }
        return new Gle();
    }
}

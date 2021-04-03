package design_patterns.creational.abstract_factory.tesla;


import design_patterns.creational.abstract_factory.Car;
import design_patterns.creational.abstract_factory.CarFactory;

public class TeslaCarFactory extends CarFactory {
    @Override
    public Car order(int budget) {
        if (budget < 20000) {
            return new Tesla1();
        }
        if (budget < 40000) {
            return new Tesla2();
        }
        return new Tesla3();
    }



}

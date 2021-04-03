package design_patterns.creational.abstract_factory;

public class Main {
    public static void main(String[] args) {
        AutoDealer autoDealer=new AutoDealer();
        Car car=autoDealer.order(50000,true);
        System.out.println(car.getModel());

        Car car2=autoDealer.order(50000,false);
        System.out.println(car2.getModel());
    }
}

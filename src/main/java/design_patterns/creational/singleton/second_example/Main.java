package design_patterns.creational.singleton.second_example;

public class Main {
    public static void main(String[] args) {
        Lift lift=Lift.getInstance();
        Lift lift2=Lift.getInstance();
        Lift lift3=Lift.getInstance();
    }
}

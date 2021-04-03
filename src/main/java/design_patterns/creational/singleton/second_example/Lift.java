package design_patterns.creational.singleton.second_example;

public class Lift {
    private static Lift instance;

    private Lift() {
        System.out.println("Constructor was called");
    }

    public static Lift getInstance() {
        if (instance == null) {
            System.out.println("Instance is null");
            synchronized (Lift.class) {
                if (instance == null) {
                    instance = new Lift();
                }
            }
        } else {
            System.out.println("Instance is not null");
        }
        return instance;
    }
}

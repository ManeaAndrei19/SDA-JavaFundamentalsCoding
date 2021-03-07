package design_patterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
        Sun sun = Sun.getInstance();
        Sun sun2 = Sun.getInstance();
        System.out.println(sun == sun2);
    }
}

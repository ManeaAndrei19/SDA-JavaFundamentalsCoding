package advanced.nested;

public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();

        System.out.println(bicycle.getMaxSpeed());

        /** Nested - classes non-static
         */

        Bicycle.Wheel wheel = bicycle.new Wheel();
        wheel.repair();

        System.out.println(bicycle.getMaxSpeed());

        /** Nested - classes static
         */

        Bicycle.Mechanic mechanic = new Bicycle.Mechanic();
        mechanic.damage(bicycle);

        System.out.println(bicycle.getMaxSpeed());


    }
}

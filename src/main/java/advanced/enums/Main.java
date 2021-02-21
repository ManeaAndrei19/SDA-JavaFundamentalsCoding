package advanced.enums;

public class Main {
    public static void main(String[] args) {
        LengthUnit lengthUnit = LengthUnit.CENTIMETER;

        System.out.println(lengthUnit + " has value " + lengthUnit.getValue());

        switch (lengthUnit) {
            case METER:
                System.out.println("We chose METER");
                break;
            case CENTIMETER:
                System.out.println("We chose CENTIMETER");
                break;
            case FOOT:
                System.out.println("We chose FOOT");
                break;
            case INCH:
                System.out.println("We chose INCH");
                break;
        }

        System.out.println(lengthUnit.name());
        System.out.println("################");
        for (LengthUnit unit : LengthUnit.values()
        ) {
            System.out.println(unit);

        }

    }
}

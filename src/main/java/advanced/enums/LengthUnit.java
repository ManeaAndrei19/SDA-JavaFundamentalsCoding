package advanced.enums;

public enum LengthUnit {
    METER(1),
    CENTIMETER(0.01),
    FOOT(0.3),
    INCH(0.025);

    private double value;

    LengthUnit(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}

package advanced.oop.polymorphism;

public class Square extends GeometricFigure {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    @Override
    public double calculateAria() {
        return side * side;
    }
}

package lesson1.polymorphism;

public class Triangle extends Figure {
    private double height;
    private double base;
    private static final double CONSTANT = 0.5;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public void printResult() {
        System.out.println("Площадь треугольника равна; " + getArea());
    }

    @Override
    double getArea() {
        return CONSTANT * base * height;
    }
}

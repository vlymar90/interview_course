package lesson1.polymorphism;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void printResult() {
        System.out.println("Площадь круга равна: " + getArea());
    }

    @Override
    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}


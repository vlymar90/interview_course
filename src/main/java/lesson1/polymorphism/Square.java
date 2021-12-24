package lesson1.polymorphism;

public class Square extends Figure {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void printResult() {
        System.out.println("Площадь квадрата равна: " + getArea());
    }

    @Override
    double getArea() {
        return Math.pow(side, 2);
    }
}

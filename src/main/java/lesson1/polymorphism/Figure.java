package lesson1.polymorphism;

public abstract class Figure {

    public void printResult() {
        System.out.println("Площадь фигуры");
    }

    abstract double getArea();
}

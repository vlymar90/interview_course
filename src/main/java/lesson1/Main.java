package lesson1;

import lesson1.polymorphism.Circle;
import lesson1.polymorphism.Figure;
import lesson1.polymorphism.Square;
import lesson1.polymorphism.Triangle;

public class Main  {
    public static void main(String[] args) {
        Figure circle = new Circle(5);
        Figure square = new Square(8);
        Figure triangle = new Triangle(2, 4);

        circle.printResult();
        square.printResult();
        triangle.printResult();
    }
}

/**
 * Задание2
 *
 * 1. Убрать интерфейс Stopable метод из него переместить в Moveable
 * 2. Метод open написать реализацию, если потомка понадобиться они могут его переопределить
 * 3. Можно реализовать паттерн фабрика по созданию машин
 * 4. Отсутствует конструктор возможно хотели создавать машины с помощью билдера
 * 5. Странный 0 над класслм Lorry
 * 6. Неправильная конструкция наследования в java нет множественного наследования,
 * после Car нужно добавить ключевое слово implements
 *
 */
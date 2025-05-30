package Lesson_4.case2;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 8, "Жёлтый", "Чёрный");
        System.out.println("Прямоугольник:");
        rectangle.printInfo();
        Circle circle = new Circle(7.7, "Белый", "Зелёный");
        System.out.println("Круг:");
        circle.printInfo();
        Triangle triangle = new Triangle(3, 4, 5, "Красный", "Голубой");
        System.out.println("Треугольник");
        triangle.printInfo();
    }
}
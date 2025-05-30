package Lesson_4.case2;

public interface Figure {
    default double calculatePerimeter() {
        return 0.0;
    }

    default double calculateArea() {
        return 0.0;
    }

    String getFillColor();

    String getBorderColor();

    default void printInfo() {
        System.out.println("Площадь: " + calculateArea());
        System.out.println("Периметр: " + calculatePerimeter());
        System.out.println("Цвет заливки: " + getFillColor());
        System.out.println("Цвет границ: " + getBorderColor());
    }
}
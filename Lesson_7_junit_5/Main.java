package Lesson_7_junit_5;

public class Main {
    public static void main(String[] args) {
        int number = 4;
        System.out.println("!" + number + " = " + Factorial.calculate(number));
        System.out.println("S треугольника = " + AreaOfATriangle.calculateAreaOfATriangle(3, 5, 4));
    }
}
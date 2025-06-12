package Lesson_7_junit_5;

public class Main {
    public static void main(String[] args) {
        CalculateFactorial factorial = new CalculateFactorial(3);
        System.out.println("!" + factorial.number + " = " + factorial.calculate());
        AreaOfATriangle areaOfATriangle = new AreaOfATriangle(3,5, 4);
        System.out.println("S треугольника = " + areaOfATriangle.calculateAreaOfATriangle());
        CompareTwoIntegers compareTwoIntegers = new CompareTwoIntegers(1, 2);
        System.out.println(compareTwoIntegers.compare());
        ArithmeticOperationsWithTwoNumbers operations = new ArithmeticOperationsWithTwoNumbers(20, 5);
        System.out.println("Сложение: " + operations.sum());
        System.out.println("Вычитание: " + operations.subtraction());
        System.out.println("Умножение: " + operations.multiplication());
        System.out.println("Деление: " + operations.division());
    }
}
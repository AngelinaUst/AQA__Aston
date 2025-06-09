package Lesson_7_junit_5;

public class Factorial {

    public static long calculate(int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
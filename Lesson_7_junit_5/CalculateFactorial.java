package Lesson_7_junit_5;

public class CalculateFactorial {
    public int number;

    public CalculateFactorial(int number) {
        this.number = number;
    }

    public long calculate() {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
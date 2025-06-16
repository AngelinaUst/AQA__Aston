package Lesson_7_junit_5;

public class CompareTwoIntegers {
    private int firstNumber = 1;
    private int secondNumber = 2;

    public CompareTwoIntegers(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public String compare() {
        if (firstNumber < secondNumber) {
            return firstNumber + " < " + secondNumber;
        } else if (firstNumber > secondNumber) {
            return firstNumber + " > " + secondNumber;
        } else {
            return firstNumber + " = " + secondNumber;
        }
    }
}
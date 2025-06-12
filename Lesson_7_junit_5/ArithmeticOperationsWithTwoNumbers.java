package Lesson_7_junit_5;

public class ArithmeticOperationsWithTwoNumbers {
    private int number1;
    private int number2;

    public ArithmeticOperationsWithTwoNumbers(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int sum(){
        return number1 + number2;
    }
    public int subtraction(){
        return number1 - number2;
    }
    public int multiplication(){
        return number1 * number2;
    }
    public double division(){
        return number1 / number2;
    }
}

import Lesson_7_junit_5.ArithmeticOperationsWithTwoNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticOperationsWithTwoNumbersTest {

    @Test
    public void testSum() {
        ArithmeticOperationsWithTwoNumbers operations = new ArithmeticOperationsWithTwoNumbers(20, 5);
        assertEquals(25, operations.sum());
    }

    @Test
    public void testSubtraction() {
        ArithmeticOperationsWithTwoNumbers operations = new ArithmeticOperationsWithTwoNumbers(20, 5);
        assertEquals(15, operations.subtraction());
    }

    @Test
    public void testMultiplication() {
        ArithmeticOperationsWithTwoNumbers operations = new ArithmeticOperationsWithTwoNumbers(20, 5);
        assertEquals(100, operations.multiplication());
    }

    @Test
    public void testDivision() {
        ArithmeticOperationsWithTwoNumbers operations = new ArithmeticOperationsWithTwoNumbers(20, 5);
        assertEquals(4.0, operations.division());
    }
}
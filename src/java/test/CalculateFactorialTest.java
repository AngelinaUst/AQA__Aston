import Lesson_7_junit_5.CalculateFactorial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateFactorialTest {
    @Test
    public void testCalculateFactorial() {
        CalculateFactorial factorial = new CalculateFactorial(3);
        assertEquals(6, factorial.calculate());
    }
}
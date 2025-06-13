import Lesson_7_junit_5.CompareTwoIntegers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompareTwoIntegersTest {

    @Test
    public void testCompareTwoIntegers() {
        CompareTwoIntegers compareTwoIntegers = new CompareTwoIntegers(1, 2);
        assertEquals("1 < 2", compareTwoIntegers.compare());
    }

    @Test
    public void testCompareTwoIntegers2() {
        CompareTwoIntegers compareTwoIntegers = new CompareTwoIntegers(3, 2);
        assertEquals("3 > 2", compareTwoIntegers.compare());
    }

    @Test
    public void testCompareTwoIntegers3() {
        CompareTwoIntegers compareTwoIntegers = new CompareTwoIntegers(2, 2);
        assertEquals("2 = 2", compareTwoIntegers.compare());
    }
}
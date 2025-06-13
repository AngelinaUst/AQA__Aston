import Lesson_7_junit_5.AreaOfATriangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaOfATriangleTest {
    @Test
    public void testCalculateAreaOfATriangle() {
        AreaOfATriangle areaOfATriangle = new AreaOfATriangle(3, 5, 4);
        assertEquals(6, areaOfATriangle.calculateAreaOfATriangle());
    }
}
package Lesson_10.src.java;

import org.junit.jupiter.api.Test;

public class TestMts {
    PaySectionSteps paySectionSteps = new PaySectionSteps();

    @Test
    public void testForm(){
        String phoneNumber = "+375-29-666-555-11";
        String sum = "11";
        paySectionSteps.fillNumberInput(phoneNumber)
                .fillSumInput(sum);

        paySectionSteps.checkForm();
    }

}
package Lesson_10.src.java;

import org.junit.jupiter.api.Assertions;

public class PaySectionSteps {
    PaySection paySection = new PaySection();

    public PaySectionSteps fillNumberInput(String text) {
        paySection.getNumberInput().sendKeys(text);
        return this;
    }

    public PaySectionSteps fillSumInput(String text) {
        paySection.getSumInput().sendKeys(text);
        return this;
    }

    public void checkForm(){
        String expectedPlaceHolder = "Номер телефона";
        String actualPlaceHolder = paySection.getNumberInput().getAttribute("placeholder");

        Assertions.assertEquals(expectedPlaceHolder, actualPlaceHolder);
    }
}
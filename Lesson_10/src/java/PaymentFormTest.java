package Lesson_10.src.java;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PaymentFormTest extends BaseTest {
    @Test
    @DisplayName("Проверка формы пополнения счета")
    public void testFillingForm() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();

        mainPage.fillPaymentForm("297777777", "10");
        mainPage.clickContinueButton();

        assertTrue(mainPage.isContinueButtonEnabled(), "Не удалось нажать кнопку");
        System.out.println("Форма работает исправно");
    }
}
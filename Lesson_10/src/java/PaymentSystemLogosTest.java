package Lesson_10.src.java;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class PaymentSystemLogosTest extends BaseTest {
    @Test
    @DisplayName("Проверка логотипов платежных систем")
    public void testLogosDisplay() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();

        boolean logosDisplayed = mainPage.arePaymentSystemLogosDisplayed();
        assertFalse(logosDisplayed, "Логотипы платежных систем не отображаются");
        System.out.println("Логотипы платежных систем отображаются");
    }
}
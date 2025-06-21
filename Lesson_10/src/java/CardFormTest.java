package Lesson_10.src.java;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CardFormTest extends BaseTest {
    @Test
    @DisplayName("Проверка формы ввода карты")
    public void testCardForm() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        String phone = "297777777";
        String amount = "10";

        mainPage.fillPaymentForm(phone, amount);
        mainPage.clickContinueButton();

        CardFormPage cardFormPage = new CardFormPage(driver);
        cardFormPage.switchToBePaidFrame();
        String formattedSum = cardFormPage.getSumText().substring(0, amount.length());
        String formattedPhone = cardFormPage.getPhoneText().substring(30);

        assertEquals(amount, formattedSum, "Сумма не совпадает");
        assertEquals(phone, formattedPhone, "Номер не совпадает");
        assertTrue(cardFormPage.isPlaceHoldersCorrect(), "Плейсхолдеры не корректны");
        assertTrue(cardFormPage.arePaymentSystemLogosDisplayed(), "Картинки отсутствуют");
    }
}
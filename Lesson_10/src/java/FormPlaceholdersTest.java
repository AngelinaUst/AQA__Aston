package Lesson_10.src.java;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FormPlaceholdersTest extends BaseTest {
    @Test
    @DisplayName("Проверка плейсхолдеров для формы")
    public void testPlaceHolders() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        assertTrue(mainPage.isConnectionPlaceHoldersCorrect(), "Плейсхолдеры для услуг связи не корректны");
        mainPage.selectOption("Домашний интернет");
        assertTrue(mainPage.isInternetPlaceHoldersCorrect(), "Плейсхолдеры для домашнего интернета не корректны");
        mainPage.selectOption("Рассрочка");
        assertTrue(mainPage.isInstallmentPlaceHoldersCorrect(), "Плейсхолдеры для рассрочки не корректны");
        mainPage.selectOption("Задолженность");
        assertTrue(mainPage.isArrearsPlaceHoldersCorrect(), "Плейсхолдеры для задолженности не корректны");
    }
}
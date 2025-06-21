package Lesson_10.src.java;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MoreInfoLinkTest extends BaseTest {
    @Test
    @DisplayName("Проверка ссылки 'Подробнее о сервисе'")
    public void testMoreInfoLink() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();

        String initialWindow = driver.getWindowHandle();
        mainPage.clickMoreInfoLink();

        assertTrue(driver.getCurrentUrl().contains("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/"),
                "Новая вкладка не открылась или неверный URL");
        driver.switchTo().window(initialWindow);
        System.out.println("Кнопка 'Подробнее о сервисе' кликабельна");
    }
}
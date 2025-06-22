package Lesson_11.src.java;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BlockTitleTest extends BaseTest {
    @Test
    @DisplayName("Проверка заголовка блока онлайн-пополнения")
    public void testBlockTitle() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();

        String blockTitle = mainPage.getBlockTitleText();
        System.out.println("Заголовок: " + blockTitle);

        assertTrue(blockTitle.contains("Онлайн пополнение") &&
                        blockTitle.contains("без комиссии"),
                "Название блока не содержит ожидаемого текста");
    }
}
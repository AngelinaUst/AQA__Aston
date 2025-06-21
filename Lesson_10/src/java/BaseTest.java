package Lesson_10.src.java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {
    public WebDriver driver;
    public WebDriverWait wait;
    public static final String baseUrl = "https://www.mts.by";

    @BeforeAll
    public static void setupAll() {
        WebDriverManager.chromedriver().setup();
    }
}
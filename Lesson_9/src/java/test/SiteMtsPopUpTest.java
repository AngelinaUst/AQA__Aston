import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class SiteMtsPopUpTest {
    public WebDriver driver;
    public WebDriverWait wait;
    public static final String baseUrl = "https://www.mts.by";

    @BeforeAll
    public static void setupAll() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 15);
        driver.get(baseUrl);

        try {
            driver.findElement(By.xpath("//button[contains(text(), 'Принять')]")).click();
        } catch (NoSuchElementException | ElementNotInteractableException e) {
        }
    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    @DisplayName("Проверка заголовка блока онлайн-пополнения")
    public void testBlockTitle() {
        WebElement blockTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@class=\"pay__wrapper\"]//h2")));
        System.out.println("Заголовок: " + blockTitle.getText());
        assertTrue(blockTitle.getText().contains("Онлайн пополнение") &&
                        blockTitle.getText().contains("без комиссии"),
                "Название блока не содержит ожидаемого текста");
    }

    @Test
    @DisplayName("Проверка логотипов платежных систем")
    public void testLogosDisplay() {
        List<WebElement> logosDisplay = driver.findElements(
                By.xpath("//div[@class=\"pay__partners\"]//ul//li//img"));
        assertFalse(logosDisplay.isEmpty(), "Логотипы платежных систем не отображаются");
        System.out.println("Логотипы платежных систем отображаются");
    }

    @Test
    @DisplayName("Проверка ссылки 'Подробнее о сервисе'")
    public void testMoreInfoLink() {
        WebElement detailsLink = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[contains(text(), 'Подробнее о сервисе')]")
        ));
        String initialWindow = driver.getWindowHandle();
        detailsLink.click();

        assertTrue(driver.getCurrentUrl().contains("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/"),
                "Новая вкладка не открылась или неверный URL");
        driver.switchTo().window(initialWindow);
        System.out.println("Кнопка 'Подробнее о сервисе' кликабельна");
    }

    @Test
    @DisplayName("Проверка формы пополнения счета")
    public void testFillingForm() {
        WebElement phoneInput = driver.findElement(
                By.xpath("//input[@placeholder=\"Номер телефона\"]"));
        phoneInput.sendKeys("297777777");

        WebElement amountInput = driver.findElement(
                By.xpath("//input[@placeholder=\"Сумма\"]"));
        amountInput.sendKeys("10");

        WebElement continueButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//button[(text()='Продолжить')]")));
        continueButton.click();

        assertTrue(continueButton.isEnabled(), "Не удалось нажать кнопку");
        System.out.println("Форма работает исправно");
    }
}
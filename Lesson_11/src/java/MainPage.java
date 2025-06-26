package Lesson_11.src.java;

import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage {
    private static final String BASE_URL = "https://www.mts.by";

    @FindBy(xpath = "//button[contains(text(), 'Принять')]")
    private WebElement acceptCookiesButton;

    @FindBy(xpath = "//div[@class=\"pay__wrapper\"]//h2")
    private WebElement blockTitle;

    private java.util.List<WebElement> paymentSystemLogos = driver.findElements(
            By.xpath("//div[@class=\"pay__partners\"]//ul//li//img"));

    @FindBy(xpath = "//a[contains(text(), 'Подробнее о сервисе')]")
    private WebElement moreInfoLink;

    @FindBy(xpath = "//input[@id=\"connection-phone\"]")
    private WebElement phoneInput;

    @FindBy(xpath = "//input[@id=\"connection-sum\"]")
    private WebElement amountInput;

    @FindBy(xpath = "//input[@id=\"connection-email\"]")
    private WebElement emailInput;

    @FindBy(xpath = "//button[(text()='Продолжить')]")
    private WebElement continueButton;

    @FindBy(css = ".select__header")
    private WebElement servicesDropdown;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @Step("Открыть базовую страницу и принять куки, если они есть")
    public void open() {
        driver.get(BASE_URL);
        try {
            acceptCookiesButton.click();
        } catch (NoSuchElementException | ElementNotInteractableException e) {
        }
    }

    @Step("Получить текст заголовка блока")
    public String getBlockTitleText() {
        wait.until(ExpectedConditions.visibilityOf(blockTitle));
        return blockTitle.getText();
    }

    @Step("Проверить отображение логотипов платежных систем")
    public boolean arePaymentSystemLogosDisplayed() {
        return !paymentSystemLogos.isEmpty();
    }

    @Step("Нажать на ссылку 'Подробнее'")
    public void clickMoreInfoLink() {
        wait.until(ExpectedConditions.elementToBeClickable(moreInfoLink)).click();
    }

    @Step("Заполнить платежную форму: телефон = {phone}, сумма = {amount}")
    public void fillPaymentForm(String phone, String amount) {
        phoneInput.sendKeys(phone);
        amountInput.sendKeys(amount);
    }

    @Step("Нажать кнопку 'Продолжить'")
    public void clickContinueButton() {
        wait.until(ExpectedConditions.visibilityOf(continueButton)).click();
    }

    @Step("Проверить активность кнопки 'Продолжить'")
    public boolean isContinueButtonEnabled() {
        return continueButton.isEnabled();
    }

    @Step("Открыть выпадающий список сервисов")
    public void openServicesDropdown() {
        wait.until(ExpectedConditions.elementToBeClickable(servicesDropdown)).click();
    }

    @Step("Выбрать опцию '{optionText}' из выпадающего списка")
    public void selectOption(String optionText) {
        openServicesDropdown();
        WebElement option = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath(String.format("//li[@class='select__item']//p[text()='%s']", optionText))
        ));
        option.click();
    }

    @Step("Проверить плейсхолдеры для формы 'Связь'")
    public boolean isConnectionPlaceHoldersCorrect() {
        return phoneInput.getAttribute("placeholder").equals("Номер телефона") &&
                amountInput.getAttribute("placeholder").equals("Сумма") &&
                emailInput.getAttribute("placeholder").equals("E-mail для отправки чека");
    }

    @Step("Проверить плейсхолдеры для формы 'Интернет'")
    public boolean isInternetPlaceHoldersCorrect() {
        WebElement phone = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@id=\"internet-phone\"]")
        ));
        WebElement amount = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@id=\"internet-sum\"]")
        ));
        WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@id=\"internet-email\"]")
        ));
        return phone.getAttribute("placeholder").equals("Номер абонента") &&
                amount.getAttribute("placeholder").equals("Сумма") &&
                email.getAttribute("placeholder").equals("E-mail для отправки чека");
    }

    @Step("Проверить плейсхолдеры для формы 'Рассрочка'")
    public boolean isInstallmentPlaceHoldersCorrect() {
        WebElement score = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@id=\"score-instalment\"]")
        ));
        WebElement amount = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@id=\"instalment-sum\"]")
        ));
        WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@id=\"instalment-email\"]")
        ));
        return score.getAttribute("placeholder").equals("Номер счета на 44") &&
                amount.getAttribute("placeholder").equals("Сумма") &&
                email.getAttribute("placeholder").equals("E-mail для отправки чека");
    }

    @Step("Проверить плейсхолдеры для формы 'Задолженность'")
    public boolean isArrearsPlaceHoldersCorrect() {
        WebElement score = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@id=\"score-arrears\"]")
        ));
        WebElement sum = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@id=\"arrears-sum\"]")
        ));
        WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@id=\"arrears-email\"]")
        ));
        return score.getAttribute("placeholder").equals("Номер счета на 2073") &&
                sum.getAttribute("placeholder").equals("Сумма") &&
                email.getAttribute("placeholder").equals("E-mail для отправки чека");
    }
}
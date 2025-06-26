package Lesson_11.src.java;

import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class CardFormPage extends BasePage {

    @FindBy(xpath = "//div[@class=\"pay-description__cost\"]//span")
    private WebElement sumLabel;

    @FindBy(xpath = "//div[@class=\"pay-description__text\"]//span")
    private WebElement phoneLabel;

    @FindBy(css = "iframe.bepaid-iframe")
    private WebElement bepaidIframe;

    @Step("Переключиться на фрейм BePaid")
    public void switchToBePaidFrame() {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(bepaidIframe));
    }

    public CardFormPage(WebDriver driver) {
        super(driver);
    }

    @Step("Получить текст суммы платежа")
    public String getSumText() {
        wait.until(ExpectedConditions.visibilityOf(sumLabel));
        return sumLabel.getText();
    }

    @Step("Получить текст номера телефона")
    public String getPhoneText() {
        wait.until(ExpectedConditions.visibilityOf(phoneLabel));
        return phoneLabel.getText();
    }

    @Step("Проверить отображение логотипов платежных систем")
    public boolean arePaymentSystemLogosDisplayed() {
        List<WebElement> paymentSystemLogos = driver.findElements(
                By.xpath("//div[contains(@class,'icons-container')]//img"));
        return !paymentSystemLogos.isEmpty();
    }
    @Step("Проверить корректность плейсхолдеров формы оплаты")
    public boolean isPlaceHoldersCorrect() {
        WebElement cardNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@id='cc-number']/following-sibling::label")
        ));
        WebElement date = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@formcontrolname='expirationDate']/following-sibling::label")
        ));
        WebElement cvc = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@formcontrolname='cvc']/following-sibling::label")
        ));
        WebElement holder = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@formcontrolname='holder']/following-sibling::label")
        ));
        return cardNumber.getText().equals("Номер карты") &&
                date.getText().equals("Срок действия") &&
                cvc.getText().equals("CVC") &&
                holder.getText().equals("Имя и фамилия на карте");
    }
}
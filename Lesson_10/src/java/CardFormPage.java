package Lesson_10.src.java;

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

    public void switchToBePaidFrame() {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(bepaidIframe));
    }

    public CardFormPage(WebDriver driver) {
        super(driver);
    }

    public String getSumText() {
        wait.until(ExpectedConditions.visibilityOf(sumLabel));
        return sumLabel.getText();
    }

    public String getPhoneText() {
        wait.until(ExpectedConditions.visibilityOf(phoneLabel));
        return phoneLabel.getText();
    }

    public boolean arePaymentSystemLogosDisplayed() {
        List<WebElement> paymentSystemLogos = driver.findElements(
                By.xpath("//div[contains(@class,'icons-container')]//img"));
        return !paymentSystemLogos.isEmpty();
    }

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
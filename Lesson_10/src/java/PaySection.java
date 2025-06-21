package Lesson_10.src.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PaySection extends BaseTest {
    private String blockTitleXPath = "//div[@class=\"pay__wrapper\"]//h2";
    private String phoneNumberInput = "//div[@class='pay__form']//input[@id='connection-phone]";
    private String phoneSumInput = "//div[@class='pay__form']//input[@id='connection-sum]";

    public WebElement getBlockTitle() {

        return wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath(blockTitleXPath)));
    }
    public WebElement getNumberInput() {

        return wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath(phoneNumberInput)));
    }

    public WebElement getSumInput() {

        return wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath(phoneNumberInput)));
    }
}
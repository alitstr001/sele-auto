package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    WebDriver driver;
    //locators
    private By successMessage = By.id("flash");

    public SecureAreaPage(WebDriver driver) {
        this.driver = driver;
    }

    //Actions

    public String getSuccessMessageContent() {
        return driver.findElement(successMessage).getText();
    }

    public boolean getSuccessMessageElement() {
        return driver.findElement(successMessage).isDisplayed();
    }
}

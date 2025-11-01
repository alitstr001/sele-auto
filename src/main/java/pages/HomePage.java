package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    // Locators with private access
    private By formAuthenticationLink = By.linkText("Form Authentication");
    private By formForgotPasswordLink = By.linkText("Forgot Password");

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    // Actions
    public LoginPage clickFormAuthenticationLink() {
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }

    public void clickFormForgotPasswordLink() {
        driver.findElement(formForgotPasswordLink).click();
    }


}
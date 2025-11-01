package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    // Locators
    private By username = By.id("username"); // add real locators here
    private By password = By.id("password"); // add real locators here
    private By loginButton = By.cssSelector(".fa.fa-2x.fa-sign-in"); // add real locators here

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        // If using PageFactory: PageFactory.initElements(driver, this);
    }

    // Actions
    public void enterUserName(String username) {
        driver.findElement(this.username).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(this.password).sendKeys(password);
    }

    public SecureAreaPage clickLoginButton() {
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }


}

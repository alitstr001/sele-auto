package login;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test(priority = 1)
    public void loginWithValidData() {
        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/secure");
    }
    
    @Test(priority = 2)
    public void loginWithInvalidData() {
        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.id("username")).sendKeys("tomsmgfith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/login");
    }
    
    @Test(priority = 3)
    public void loginWithEmptyData() {
        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("login"));
    }
    
    @Test(priority = 4)
    public void loginWithInvalidPassword() {
        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSec retPassword!");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/login");
    }
    
    @Test(priority = 5)
    public void loginWithInvalidUsername() {
        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.id("username")).sendKeys("toms mith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/login");
    }   
    
    @Test(priority = 6)
    public void loginWithInvalidUsernameAndPassword() {
        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.id("username")).sendKeys("tomsmdfgxith");
        driver.findElement(By.id("password")).sendKeys("SuperSecregftPassword!");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/login");
    }
    
    @Test(priority = 7)
    public void logoutTest() {
        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        driver.findElement(By.cssSelector("a[href='/logout']")).click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/login");
    }
}
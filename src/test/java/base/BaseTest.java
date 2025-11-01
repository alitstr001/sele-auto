package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

public class BaseTest {
    protected WebDriver driver;
    protected HomePage homePage; // so that all test cases start from homePage

    @BeforeClass
    public void beforeClass() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }

    @BeforeMethod
    public void beforeMethod() {
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }


}

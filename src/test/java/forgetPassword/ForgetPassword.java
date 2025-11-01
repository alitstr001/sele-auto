package forgetPassword;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgetPassword extends BaseTest {
    @Test
    public void forgetPasswordTest() {
        driver.findElement(By.xpath("//a[@href='/forgot_password']")).click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/forgot_password");


    }
}

package forgetPassword;

import base.BaseTest;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import secureAreaMessage.SecureAreaMessageTest;

public class ForgetPassword extends BaseTest {
    private final Logger logger = LoggerFactory.getLogger(ForgetPassword.class);
    @Test
    public void forgetPasswordTest() {
        driver.findElement(By.xpath("//a[@href='/forgot_password']")).click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/forgot_password");


    }
}

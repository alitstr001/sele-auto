package secureAreaMessage;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

public class SecureAreaMessageTest extends
        BaseTest {
    @Test
    public void secureAreaMessageTest() {
        homePage.clickFormAuthenticationLink();
        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterUserName("tomsmith");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickLoginButton();
        SecureAreaPage secureAreaPage = new SecureAreaPage(driver);
        Assert.assertTrue(secureAreaPage.getSuccessMessageContent().contains("You logged into a secure area!"));
//        Assert.assertTrue(secureAreaPage.getSuccessMessageElement(), "Success Message is not Displayed!");
    }
}

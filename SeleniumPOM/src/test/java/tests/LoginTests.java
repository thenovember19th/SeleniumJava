package tests;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTests extends Base {

    @Test
    public void validLogin(){
        LoginPage login = new LoginPage(driver);
        login.enterUserName("standard_user");
        login.enterPassword("secret_sauce");
        login.clickOnLoginButton();

        String titleOfThePage = driver.getTitle();
        Assert.assertEquals(titleOfThePage,"Swag Labs");
    }
    @Test
    public void invalidLogin() {
        LoginPage login = new LoginPage(driver);
        login.enterUserName("standard_user");
        login.enterPassword("secret_sauce");
        login.clickOnLoginButton();
    }
}

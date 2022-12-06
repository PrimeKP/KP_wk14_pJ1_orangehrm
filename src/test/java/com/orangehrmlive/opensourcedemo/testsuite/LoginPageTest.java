package com.orangehrmlive.opensourcedemo.testsuite;

import com.orangehrmlive.opensourcedemo.pages.LoginPage;
import com.orangehrmlive.opensourcedemo.testbase.BaseTestClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTestClass {

    LoginPage loginPage = new LoginPage();
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        loginPage.enterUsername();
        loginPage.enterPassword();
        loginPage.clickOnLoginButton();
        String expectedMessage  = "Dashboard";
        Assert.assertEquals(loginPage.getHeaterTitleDashboard(),expectedMessage,"Login page not displayed");
    }


}

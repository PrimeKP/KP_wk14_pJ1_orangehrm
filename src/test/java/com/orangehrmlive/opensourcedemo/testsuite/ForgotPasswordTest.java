package com.orangehrmlive.opensourcedemo.testsuite;

import com.orangehrmlive.opensourcedemo.pages.ForgotPassword;
import com.orangehrmlive.opensourcedemo.testbase.BaseTestClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends BaseTestClass {

    ForgotPassword forgotPassword = new ForgotPassword();

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        forgotPassword.clickOnForgotPasswordLink();
        String expectedMessage  = "Reset Password";
        Assert.assertEquals(forgotPassword.getResetPasswordMessage(),expectedMessage,"Not matching message");
    }
}

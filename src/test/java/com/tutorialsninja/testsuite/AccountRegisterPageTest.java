package com.tutorialsninja.testsuite;

import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.pages.*;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class AccountRegisterPageTest extends BaseTest {
    HomePage homePage;
    RegisterPage registerPage;
    MyAccountPage accountPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        registerPage = new RegisterPage();
        accountPage = new MyAccountPage();

    }

    @Test (groups =   { "sanity" , "regression"})
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        homePage.clickOnMyQAccountTab();
        homePage.selectMyAccountOptions("Register");
//        Assert.assertEquals(registerPage.getRegisterAccountText(),
//                "Register Account", "Register page not displayed");
    }

    @Test (groups =   { "smoke" , "regression"})
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() {
        homePage.clickOnMyQAccountTab();
        homePage.selectMyAccountOptions("Register");
        registerPage.enterFirstNameField("kishan0"+getRandomString(2));
        registerPage.enterLastNameField("malaviya"+getRandomString(2));
        registerPage.enterEmailIdField("kishan_"+getRandomString(2)+"@yahoo.co.in");
        registerPage.enterPhoneNumberField("07534666850");
        registerPage.enterPasswordField("123456");
        registerPage.enterPasswordConfirmField("123456");
        registerPage.clickOnRadioButton();
        registerPage.clickOnPrivacyPolicy();
        registerPage.clickOnContinueButton();
        registerPage.verifyAccountCreated();
        registerPage.clickOnContinueButtonLink();
        registerPage.clickOnMyAccountLin();
        registerPage.clickOnLogOut();

    }


}

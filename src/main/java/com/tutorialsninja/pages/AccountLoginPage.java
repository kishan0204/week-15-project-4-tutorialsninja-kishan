package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

/**
 * Created by Jay Vaghani
 */
public class AccountLoginPage extends Utility {

    @CacheLookup
            @FindBy(xpath="//div[@id='content']/div/div[2]//h2")
    WebElement returningCustomerText;

   // By returningCustomerText = By.xpath("//div[@id='content']/div/div[2]//h2");
    @CacheLookup
           @FindBy(xpath="//div[@id='content']/div/div[1]//h2")
           WebElement newCustomerText;
    //By newCustomerText = By.xpath("//div[@id='content']/div/div[1]//h2");
    @CacheLookup
            @FindBy(id="input-email")
            WebElement emailAddressField;
    //By emailAddressField = By.id("input-email");
    @CacheLookup
            @FindBy(id="input-password")
            WebElement passwordField;
    //By passwordField = By.id("input-password");
    @CacheLookup
            @FindBy(xpath="//form[contains(@action,'login')]//input[@type='submit']")
            WebElement loginBtn;
    //By loginBtn = By.xpath("//form[contains(@action,'login')]//input[@type='submit']");

    public String getReturningCustomerText() {
        String message =getTextFromElement(returningCustomerText);
       // return getTextFromElement(returningCustomerText);
        CustomListeners.test.log(Status.PASS,"Get customer returning Message");
        return message;

    }

    public String getNewCustomerText() {
        String message = getTextFromElement(newCustomerText);
        CustomListeners.test.log(Status.PASS,"Get new customer textMessage");
        return message;
        //return getTextFromElement(newCustomerText);
    }

    public void enterEmailAddress(String email) {
        Reporter.log("Enter email " + email + "to email field" + emailAddressField.toString());
        sendTextToElement(emailAddressField, email);
        CustomListeners.test.log(Status.PASS,"Enter EmailId " + email);
    }

    public void enterPassword(String password) {
        Reporter.log("Enter password" + password + "to password field" + passwordField.toString());
        sendTextToElement(passwordField, password);
        CustomListeners.test.log(Status.PASS, "Your password is \"" + password.toString() + "\"");
    }

    public void clickOnLoginButton() {
        Reporter.log("click on loging button" + loginBtn);
        clickOnElement(loginBtn);
        CustomListeners.test.log(Status.PASS,"click\""+"\"");
    }

}

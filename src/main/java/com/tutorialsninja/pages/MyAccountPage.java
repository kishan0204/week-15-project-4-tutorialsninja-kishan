package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class MyAccountPage extends Utility {

    @CacheLookup
            @FindBy(xpath="//h1[contains(text(),'Account Logout')]")
    WebElement accountLogoutText;
   // By accountLogoutText = By.xpath("//h1[contains(text(),'Account Logout')]");
    @CacheLookup
           @FindBy(xpath="//h1[contains(text(),'Your Account Has Been Created!')]")
           WebElement accountCreatedText;
   // By accountCreatedText = By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");

    @CacheLookup
            @FindBy(xpath="//a[contains(text(),'Continue')]")
    WebElement continueBtn;
    @CacheLookup
    @FindBy(xpath="//div[@id='top-links']//li[contains(@class,'open')]/ul/li")
    List< WebElement> myAccountOptions1;

    @CacheLookup
    @FindBy(xpath="//span[contains(text(),'My Account')]")
    WebElement myAccountTab1;
    //By continueBtn = By.xpath("//a[contains(text(),'Continue')]");
    public void clickOnMyQAccountTab1() {

        clickOnElement(myAccountTab1);
    }
    public String getAccountLogoutText() {
        String message = getTextFromElement(accountLogoutText);
        Reporter.log("verify text"+accountLogoutText);
        CustomListeners.test.log(Status.PASS,"Get Account logout text message");
        return message;

    }

    public String getYourAccountHasBeenCreatedText() {
        String message =  getTextFromElement(accountCreatedText);
        Reporter.log("verify text messagae"+ accountCreatedText);
        CustomListeners.test.log(Status.PASS,"Get Account has been created");
        return message;

    }
    public void clickOnContinueButton() {
        clickOnElement(continueBtn);
        CustomListeners.test.log(Status.PASS,"Click on loginButton");
    }
    public void selectMyAccountOptions1(String option) {
        List<WebElement> myAccountList = myAccountOptions1;
        try {
            for (WebElement options : myAccountList) {
                if (options.getText().equalsIgnoreCase(option)) {
                    options.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            myAccountList = myAccountOptions1;
        }
    }
}

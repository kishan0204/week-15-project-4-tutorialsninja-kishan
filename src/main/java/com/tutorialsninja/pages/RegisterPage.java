package com.tutorialsninja.pages;


import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {

    @CacheLookup
            @FindBy(xpath="//input[@id='input-firstname']")
    WebElement firstNameField;
    //By firstNameField = By.xpath("//input[@id='input-firstname']");
    @CacheLookup
            @FindBy(xpath="//input[@id='input-lastname']")
            WebElement lastNameField;
    //By lastNameField = By.xpath("//input[@id='input-lastname']");
    @CacheLookup
            @FindBy(xpath="//input[@id='input-email']")
            WebElement emailIdField;
    //By emailIdField = By.xpath("//input[@id='input-email']");
    @CacheLookup
            @FindBy(xpath="//input[@id='input-telephone']")
            WebElement phoneNumberField;
    //By phoneNumberField = By.xpath("//input[@id='input-telephone']");
    @CacheLookup
            @FindBy(xpath="//input[@id='input-password']")
            WebElement passwordField;
    //By passwordField = By.xpath("//input[@id='input-password']");
    @CacheLookup
            @FindBy(xpath="//input[@id='input-confirm']")
            WebElement passwordConfirmField;
    //By passwordConfirmField = By.xpath("//input[@id='input-confirm']");
    @CacheLookup
            @FindBy(xpath="//body/div[@id='account-register']/div[1]/div[1]/form[1]/fieldset[3]/div[1]/div[1]/label[2]/input[1]")
            WebElement radioButton;
    //By radioButton = By.xpath("//body/div[@id='account-register']/div[1]/div[1]/form[1]/fieldset[3]/div[1]/div[1]/label[2]/input[1]");
    @CacheLookup
            @FindBy(xpath="//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
            WebElement privacyPolicy;
    //By privacyPolicy =By.xpath("//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]");
    @CacheLookup
            @FindBy(xpath="//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[2]")
            WebElement continueButton;
    //By continueButton =By.xpath("//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[2]");
    @CacheLookup
            @FindBy(xpath="//h1[contains(text(),'Your Account Has Been Created!')]")
            WebElement accountCreated;
    //By accountCreated =By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]"); //Your Account Has Been Created!
    @CacheLookup
            @FindBy(xpath="//a[contains(text(),'Continue')]")
            WebElement continueButtonLink;
   // By continueButtonLink = By.xpath("//a[contains(text(),'Continue')]");
    @CacheLookup
           @FindBy(xpath="//body/div[@id='account-account']/div[1]/aside[1]/div[1]/a[1]")
           WebElement myAccountLink;
   // By myAccountLink = By.xpath("//body/div[@id='account-account']/div[1]/aside[1]/div[1]/a[1]");
    @CacheLookup
           @FindBy(xpath="//body/div[@id='account-account']/div[1]/aside[1]/div[1]/a[13]")
    WebElement logOut;

   // By logOut =By.xpath("//body/div[@id='account-account']/div[1]/aside[1]/div[1]/a[13]");

    public void enterFirstNameField(String firstname){
        Reporter.log("Enter first name " + firstname + "to email field" + firstname.toString());
        sendTextToElement(firstNameField,firstname);
        CustomListeners.test.log(Status.PASS,"first name \""+firstNameField.toString()+"\"");}
    public void enterLastNameField(String lastName){
        Reporter.log("Enter last name " + lastName + "to email field" + lastName.toString());
        sendTextToElement(lastNameField,lastName);
    CustomListeners.test.log(Status.PASS,"last name \""+lastName.toString()+"\"");}
    public void enterEmailIdField(String emailId){
        Reporter.log("Enter email " +emailId + "to email field" + emailIdField.toString());
        sendTextToElement(emailIdField,emailId );
        CustomListeners.test.log(Status.PASS,"Your emaild id \""+emailId.toString()+"\"");}
    public void enterPhoneNumberField(String phoneNumber){
        Reporter.log("Enter phone number  " +phoneNumber + "to phone number field" + phoneNumberField.toString());
        sendTextToElement(phoneNumberField,phoneNumber);
        CustomListeners.test.log(Status.PASS,"phone number \""+phoneNumberField.toString()+"\"");
    }
    public void enterPasswordField (String password){
        Reporter.log("Enter password" + password+ "password field "+passwordField.toString());
        sendTextToElement(passwordField,password);
        CustomListeners.test.log(Status.PASS,"pasasword \""+passwordField.toString()+"\"");}
    public void enterPasswordConfirmField(String passwordConfirm){
        Reporter.log("Enter password confirm" + passwordConfirm+ "password conform field "+passwordConfirm.toString());
        sendTextToElement(passwordConfirmField,passwordConfirm);
        CustomListeners.test.log(Status.PASS,"password confoim \""+passwordConfirm.toString()+"\"");}

    public void clickOnRadioButton(){
        Reporter.log("click on loging button" + radioButton);
        clickOnElement(radioButton);
        CustomListeners.test.log(Status.PASS,"radio button\""+"\"");}
    public void clickOnPrivacyPolicy(){
        Reporter.log("radio buttton" + privacyPolicy);
        clickOnElement(privacyPolicy);
        CustomListeners.test.log(Status.PASS,"radio\""+"\"");}
    public void clickOnContinueButton(){
        Reporter.log("click" + continueButton);
        clickOnElement(continueButton);
        CustomListeners.test.log(Status.PASS,"click\""+"\"");
    }
    public void verifyAccountCreated() {
        Reporter.log("click on loging button" + accountCreated);
        verifyTextFromElements(accountCreated,"Your Account Has Been Created!");
        CustomListeners.test.log(Status.PASS,"verify\""+"\"");
    }
    public void clickOnContinueButtonLink(){
        Reporter.log("click on contunie button" + continueButtonLink);
        clickOnElement(continueButtonLink);
    CustomListeners.test.log(Status.PASS,"click on button\""+"\"");}
    public void clickOnMyAccountLin(){
        Reporter.log("click on my account link button" + myAccountLink);
        clickOnElement(myAccountLink);
        CustomListeners.test.log(Status.PASS,"click on my account button\""+"\"");}

    public void clickOnLogOut(){
        Reporter.log("click button" + logOut);
    clickOnElement(logOut);
        CustomListeners.test.log(Status.PASS,"click log out button\""+"\"");}
    }





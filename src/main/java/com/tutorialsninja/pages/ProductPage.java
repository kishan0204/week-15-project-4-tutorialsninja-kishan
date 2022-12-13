package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class ProductPage extends Utility {

    @CacheLookup
            @FindBy(xpath="//div[@id = 'content']//h1")
            WebElement productText;

    //By productText = By.xpath("//div[@id = 'content']//h1");
    @CacheLookup
            @FindBy(xpath="//div[@class = 'input-group date']//button")
            WebElement calendarButton;

    //By calendarButton = By.xpath("//div[@class = 'input-group date']//button");
    @CacheLookup
            @FindBy(xpath="//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']")
            WebElement monthAndYearText;
    //By monthAndYearText = By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']");
    @CacheLookup
            @FindBy(xpath="//div[@class = 'datepicker']/div[1]//th[@class='next']")
            WebElement nextButton;
    //By nextButton = By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='next']");
    @CacheLookup
            @FindBy(xpath="//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']")
           List< WebElement> dateList;
    //By dateList = By.xpath("//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']");
    @CacheLookup
            @FindBy(xpath="//input[@id='input-quantity']\n")
    WebElement qtyField;
    //By qtyField = By.cssSelector("#input-quantity");
    @CacheLookup
            @FindBy(xpath="//button[@id='button-cart']")
            WebElement addToCartButton;

   // By addToCartButton = By.xpath("//button[@id='button-cart']");
    @CacheLookup
           @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']\n")
    WebElement successMessage;
    //By successMessage = By.cssSelector("body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible");
    @CacheLookup
            @FindBy(xpath="//a[contains(text(),'shopping cart')]")
            WebElement shoppingCartLink;
    //By shoppingCartLink = By.xpath("//a[contains(text(),'shopping cart')]");
    @CacheLookup
            @FindBy(xpath="//div[@class = 'input-group date']//button")
    WebElement datePicker;
    //By datePicker = By.xpath("//div[@class = 'input-group date']//button");


    public String getProductText() {
        return getTextFromElement(productText);
    }

    public void selectDeliveryDate(String day, String month, String year) {
        clickOnElement(datePicker);
        while (true) {
            String monthAndYear = getTextFromElement(monthAndYearText);
            String[] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(nextButton);
            }
        }
        List<WebElement> allDates = dateList;
        for (WebElement e : allDates) {
            if (e.getText().equalsIgnoreCase(day)) {
                e.click();
                break;
            }
        }
    }

    public void clickOnAddToCartButton() {
        Reporter.log("click on add to chart" + addToCartButton);
        clickOnElement(addToCartButton);
        CustomListeners.test.log(Status.PASS,"click\""+"\"");

    }

    public String getProductAddedSuccessMessage() {
        String message = getTextFromElement(successMessage);
        Reporter.log("verify text messagae"+ successMessage);
        CustomListeners.test.log(Status.PASS,"add product success in chart");
        return message;

    }

    public void clickOnShoppingCartLinkIntoMessage() {
        Reporter.log("click on shoppinh chart message" + shoppingCartLink);
        clickOnElement(shoppingCartLink);
        CustomListeners.test.log(Status.PASS,"click\""+"\"");
    }

    public void enterQuantity(String qty) {
        Reporter.log("quenty"+qty+"quenty"+qtyField.toString());
        sendTextToElement(qtyField, qty);
        CustomListeners.test.log(Status.PASS,"Your emaild id \""+qtyField.toString()+"\"");
    }
}
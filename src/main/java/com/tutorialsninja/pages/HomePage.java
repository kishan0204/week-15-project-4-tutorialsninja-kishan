package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class HomePage extends Utility {

    @CacheLookup
            @FindBy(xpath="//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*")
           List<WebElement> topMenu;

    //By topMenu = By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*");
    @CacheLookup
           @FindBy(linkText="Desktops")
           WebElement desktopLink;
   // By desktopLink = By.linkText("Desktops");
    @CacheLookup
           @FindBy(linkText="Laptops & Notebooks")
           WebElement laptopsAndNotebooksLink;
   // By laptopsAndNotebooksLink = By.linkText("Laptops & Notebooks");
    @CacheLookup
           @FindBy(linkText="Components")
           WebElement componentsLinks;
    //By componentsLinks = By.linkText("Components");
    @CacheLookup
            @FindBy(xpath="//span[contains(text(),'Currency')]")
            WebElement currencyTab;
    //By currencyTab = By.xpath("//span[contains(text(),'Currency')]");
    @CacheLookup
            @FindBy(xpath="//ul[@class = 'dropdown-menu']/li")
            List<WebElement> currencyList;
    //By currencyList = By.xpath("//ul[@class = 'dropdown-menu']/li");
    @CacheLookup
            @FindBy(xpath="(//span[@class='hidden-xs hidden-sm hidden-md'])[3]")
            WebElement myAccountTab;
    @CacheLookup
    @FindBy(xpath="//span[contains(text(),'My Account')]")
    WebElement myAccountTab1;

   // By myAccountTab = By.xpath("//span[contains(text(),'My Account')]");

@CacheLookup
        @FindBy(xpath="//div[@id='top-links']//li[contains(@class,'open')]/ul/li")
       List< WebElement> myAccountOptions;
    //By myAccountOptions = By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li");


    public void selectMenu(String menu) {
        List<WebElement> topMenuList = topMenu;
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = topMenu;
        }
    }

    public void mouseHoverOnDesktopsLinkAndClick() {
        mouseHoverToElementAndClick(desktopLink);
    }

    public void mouseHoverOnLaptopsAndNotebooksLinkAndClick() {
        mouseHoverToElementAndClick(laptopsAndNotebooksLink);
    }

    public void mouseHoverOnComponentLinkAndClick() {
        mouseHoverToElementAndClick(componentsLinks);
    }

    public void selectCurrency(String currency) {
        clickOnElement(currencyTab);
        List<WebElement> listOfElements = currencyList;
        for (WebElement e : listOfElements) {
            if (e.getText().equalsIgnoreCase(currency)) {
                e.click();
                break;
            }
        }
    }

    public void clickOnMyQAccountTab() {
        clickOnElement(myAccountTab);
    }


    public void selectMyAccountOptions(String option) {
        List<WebElement> myAccountList = myAccountOptions;
        try {
            for (WebElement options : myAccountList) {
                if (options.getText().equalsIgnoreCase(option)) {
                    options.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            myAccountList = myAccountOptions;
        }
    }

}

package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Jay Vaghani
 */
public class ComponentsPage extends Utility {
    @CacheLookup
            @FindBy(xpath="//h2[contains(text(),'Components')]")
    WebElement componentsText;

    //By componentsText = By.xpath("//h2[contains(text(),'Components')]");

    public String getComponentsText() {
        String message = getTextFromElement(componentsText);
        //return getTextFromElement(componentsText);
        getTextFromElement(componentsText);
        return message;
    }
}

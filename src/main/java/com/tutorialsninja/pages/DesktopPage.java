package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class DesktopPage extends Utility {
    By desktopsText = By.xpath("//h2[contains(text(),'Desktops')]");
    By productsList = By.xpath("//h4/a");
    By sortBy = By.id("input-sort");


    public String getDesktopsText() {
        String message = getTextFromElement(desktopsText);
        CustomListeners.test.log(Status.PASS,"Get desktopsText");
       // return getTextFromElement(desktopsText);
        return message;
    }

    public ArrayList<String> getProductsNameList() {
        Reporter.log("get it product name "+ productsList);
        List<WebElement> products = getListOfElements(productsList);
        CustomListeners.test.log(Status.PASS,"product list\""+"");
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        return originalProductsName;
    }
    public void selectProductByName(String product) {
        Reporter.log("get it product list name"+productsList);
        List<WebElement> products = getListOfElements(productsList);
        CustomListeners.test.log(Status.PASS,"product list name\""+"");
        for (WebElement e : products) {
            if (e.getText().equals(product)) {
                e.click();
                break;
            }
        }
    }

    public void selectSortByOption(String option) {
        Reporter.log("Select option"+sortBy);
        selectByVisibleTextFromDropDown(sortBy, option);
        CustomListeners.test.log(Status.PASS,"Select by"+"");
    }
}

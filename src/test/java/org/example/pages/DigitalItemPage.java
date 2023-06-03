package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DigitalItemPage extends DriverManager {
    //String expectedText;
    @FindBy(xpath = "//a[@href=\"/digital-downloads\"]")
    WebElement digitalDownloadButton;

    @FindBy(id = "products-pagesize")
    WebElement displayButton;



    @FindBy(xpath = "//div[@data-productid =\"35\"]")
    WebElement item1;

    @FindBy(xpath = "//div[@data-productid =\"34\"]")
    WebElement item2;

    @FindBy(xpath = "//div[@data-productid =\"36\"]")
    WebElement item3;

    //@FindBy(className = "product-item")
   // WebElement productItem;

    public void clickOnDigitalDownloadButton(){
        digitalDownloadButton.click();
    }
    public void setDisplayButton(){
    Select select = new Select(displayButton);
     select.selectByIndex(0);
    }

    public void getItemName(){
//        Select select = new Select(productItem);
//        List<WebElement> productItem = select.getOptions();
//        for (WebElement options:productItem) {
//            System.out.println(productItem.get(3));
//        }

        waitForElementVisibility(item1,20,"element not found");
        item1.isDisplayed();
        System.out.println(item1.getText());

        waitForElementVisibility(item2,20,"element not found");
        item2.isDisplayed();
        System.out.println(item2.getText());

        waitForElementVisibility(item3,20,"element not found");
        item3.isDisplayed();
        System.out.println(item3.getText());

    }


}

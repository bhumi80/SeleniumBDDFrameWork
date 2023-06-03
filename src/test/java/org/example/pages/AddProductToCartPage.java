package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddProductToCartPage extends DriverManager {

    @FindBy(id = "small-searchterms")
    WebElement searchBox;

    @FindBy(className = "button-1")
    WebElement searchButton;

    @FindBy(className = "product-box-add-to-cart-button")
    WebElement addToCartButton;

    @FindBy(xpath = "//div[@class='bar-notification success']")
    WebElement popupMessage;

    public void enterProduct(){
        searchBox.click();
        searchBox.sendKeys("portable sound speakers");

        searchButton.click();
    }
    public void addToCart(){
        addToCartButton.click();
    }

    public void setPopupMessage(){
        popupMessage.isDisplayed();
        String getPopUpMessage = popupMessage.getText();
        System.out.println(getPopUpMessage);
}
}

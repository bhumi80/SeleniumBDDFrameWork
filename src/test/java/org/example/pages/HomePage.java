package org.example.pages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverManager {

    @FindBy(css = ".ico-login")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@class='header-links']/ul/li/a")
    public WebElement registrationButton;

    public void clickOnLoginButton() {
        loginButton.click();
    }

    public void clickOnRegistrationButton() {
        registrationButton.click();
    }

}

package org.example.pages;

import cucumber.api.java.en.Then;
import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends DriverManager {


@FindBy(xpath = "//div[@class='center-1']/div/div/h1")
    WebElement welcomeText;

@FindBy(id = "Email")
WebElement emailId;

@FindBy(id = "Password")
WebElement password;

@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")
WebElement loginButton;

@FindBy(className = "ico-logout")
WebElement logOutButton;

public String getWelcomeText(){
    String actualText = welcomeText.getText();
    return actualText;
}
public void enterValidCredentials(){
    emailId.clear();
    emailId.click();
    emailId.sendKeys("bs123@bp.com");

    password.clear();
    password.click();
    password.sendKeys("xyz12345");
}
public void clickLoginButton(){

    waitForElementVisibility(loginButton,20,"element is not visible");
    loginButton.click();
}

public void logOutButton(){
    logOutButton.isDisplayed();

}

}

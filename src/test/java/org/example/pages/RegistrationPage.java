package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends DriverManager {
    @FindBy(xpath = "//div[@class='center-1']/div/div/h1")
    WebElement registerText;

    public String getRegisterText() {
        String actualText = registerText.getText();
        System.out.println(actualText);
        return actualText;

    }
    @FindBy(id = "FirstName")
    WebElement firstName;

    @FindBy(id = "LastName")
    WebElement lastName;

    @FindBy(id = "Email")
    WebElement email;

    @FindBy(id = "Password")
    WebElement password;

    @FindBy(id = "ConfirmPassword")
    WebElement confirmPassword;

    public void enterValidDataOnMandatoryFields(){
        firstName.click();
        firstName.clear();
        firstName.sendKeys("Bhumika");

        lastName.click();
        lastName.clear();
        lastName.sendKeys("Patel");

        email.click();
        email.clear();
        email.sendKeys("bs123@bp.com");

        password.click();
        password.clear();
        password.sendKeys("xyz12345");

        confirmPassword.click();
        confirmPassword.clear();
        confirmPassword.sendKeys("xyz12345");
    }

    @FindBy(id = "register-button")
    WebElement registerButton;
    public void clickOnRegisterButtonOnRegisterPage(){
        registerButton.click();
    }

}

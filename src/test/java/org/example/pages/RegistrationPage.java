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

    @FindBy(id = "register-button")
    WebElement registerButton;

    @FindBy(xpath = "//div[@class=result]")
    WebElement regText;

  @FindBy(className = "register-continue-button")
   WebElement continueButton;

    @FindBy(id = "gender-male")
    WebElement maleRadioButton;

    @FindBy(id = "gender-female")
    WebElement femaleRadioButton;

    @FindBy(id = "FirstName")
    WebElement name;

    @FindBy(id = "LastName")
    WebElement surName;

//   @FindBy(xpath = "//div[@class=\"inputs date-of-birth\"]")
//    WebElement birthDate;

    @FindBy(id = "Email")
    WebElement emailId;

    @FindBy(id = "Password")
    WebElement passwordBox;

    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordBox;

    public void selectRadioButton() {
        maleRadioButton.click();
        femaleRadioButton.click();
    }


    public void enterRegistrationDetails(String firstName, String lastName, String email, String password, String confirmPassword) {
        name.clear();
        name.sendKeys(firstName);

        surName.clear();
        surName.sendKeys(lastName);

      // birthDate.sendKeys(dateOfBirth);

        emailId.clear();
        emailId.sendKeys(email);

        passwordBox.clear();
        passwordBox.sendKeys(password);

        confirmPasswordBox.clear();
        confirmPasswordBox.sendKeys(confirmPassword);


    }

//    public void enterValidDataOnMandatoryFields(){
//       // firstName.click();
//        firstName.clear();
//        firstName.sendKeys("Bhumika");
//
//       // lastName.click();
//        lastName.clear();
//        lastName.sendKeys("Patel");
//
//       // email.click();
//        email.clear();
//        email.sendKeys("bs123@bp.com");
//
//       // password.click();
//        password.clear();
//        password.sendKeys("xyz12345");
//
//       // confirmPassword.click();
//        confirmPassword.clear();
//        confirmPassword.sendKeys("xyz12345");
//    }

    public void clickOnRegisterButtonOnRegisterPage() {

        registerButton.click();
        boolean regButton = registerButton.isDisplayed();
    }

   public boolean displayContinueButton() {
        boolean conButton = continueButton.isDisplayed();
        return conButton;
   }
   public void getRegText(){
        String text = regText.getText();
       System.out.println(text);
   }
}

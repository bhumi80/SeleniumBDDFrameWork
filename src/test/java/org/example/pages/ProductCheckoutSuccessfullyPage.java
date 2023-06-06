package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ProductCheckoutSuccessfullyPage extends DriverManager {

//    @FindBy(id = "FirstName")
//    WebElement firstNameBox;
//    @FindBy(id = "LastName")
//    WebElement lastNameBox;
//    @FindBy(id = "Email")
//    WebElement emailId;
//
//    @FindBy(id = "Password")
//    WebElement passwordBox;
//
//    @FindBy(id = "ConfirmPassword")
//    WebElement confirmPasswordBox;

    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[6]/a")
    WebElement jewelryButton;

    @FindBy(partialLinkText = "Flower Girl Bracelet")
    WebElement bracelet;

    @FindBy(id = "add-to-cart-button-41")
    WebElement addToCartButton;

//    @FindBy(className = "bar-notification success")
//    WebElement popUpMessage;

//    @FindBy(xpath = "//*[@id=\"bar-notification\"]/div/span")
//    WebElement closePopUp;

    @FindBy(xpath = "//div[@class=\"header-links\"]/ul/li[4]/a")
    WebElement shoppingCartButton;

    @FindBy(id = "termsofservice")
    WebElement acceptTermAndConditionCheckBox;

    @FindBy(id = "checkout")
    WebElement checkoutButton;

    @FindBy(className = "checkout-as-guest-button")
    WebElement guestCheckoutButton;

    @FindBy(id = "BillingNewAddress_FirstName")
    WebElement firstNameBox;
    @FindBy(id = "BillingNewAddress_LastName")
    WebElement lastNameBox;
    @FindBy(id = "BillingNewAddress_Email")
    WebElement emailBox;
    @FindBy(name = "BillingNewAddress.CountryId")
    WebElement countryName;
    @FindBy(name = "BillingNewAddress.City")
    WebElement cityName;
    @FindBy(name = "BillingNewAddress.Address1")
    WebElement address1box;
    @FindBy(name = "BillingNewAddress.ZipPostalCode")
    WebElement postCodeBox;
    @FindBy(name = "BillingNewAddress.PhoneNumber")
    WebElement phoneNumberBox;

    @FindBy(name = "save")
    WebElement continueButtonOnBilling;

    @FindBy(xpath = "//div[@class=\"page-title\"]/h1")
    WebElement checkoutText;

    @FindBy(className = "shipping-method-next-step-button")
    WebElement continueButtonOnCheckout;

    @FindBy(id = "paymentmethod_1")
    WebElement creditCardRadioButton;

    @FindBy(className = "payment-method-next-step-button")
    WebElement continueButtonOnPayment;

    @FindBy(id = "CardholderName")
    WebElement cardHolderNameBox;
    @FindBy(id = "CardNumber")
    WebElement cardNumberBox;
//    @FindBy(xpath = "//*[@id=\"checkout-payment-info-load\"]/div/div/div/table/tbody/tr[4]")
//    WebElement expireYearBox;
    @FindBy (id = "CardCode")
    WebElement cardCodeBox;

    @FindBy(className = "payment-info-next-step-button")
    WebElement continueButtonOnPaymentInfo;

    @FindBy(className = "confirm-order-next-step-button")
    WebElement confirmButton;

    @FindBy (xpath = "//div[@class=\"page-title\"]/h1")
    WebElement thankYouText;

    @FindBy(xpath = "//div[@class=\"page-body checkout-data\"]/div/div/strong")
    WebElement text;

//    @FindBy(id = "Email")
//    WebElement regEmail;
//
//    @FindBy(id ="Password")
//    WebElement regPassword;

    @FindBy(className = "login-button")
    WebElement retLoginButton;

//    public void enterRegistrationDetails(String firstName, String lastName, String email, String password, String confirmPassword) {
//        firstNameBox.clear();
//        firstNameBox.sendKeys(firstName);
//
//        lastNameBox.clear();
//        lastNameBox.sendKeys(lastName);
//
//        emailId.clear();
//        emailId.sendKeys(email);
//
//        passwordBox.clear();
//        passwordBox.sendKeys(password);
//
//        confirmPasswordBox.clear();
//        confirmPasswordBox.sendKeys(confirmPassword);
//
//    }

    public void clickOnJewelryButton() {
        jewelryButton.click();
    }

    public void clickOnBracelet() {
        bracelet.click();
    }

    public void clickOnAddToCart() {
        addToCartButton.click();
    }

//    public void clickOnPopUpMessage() {
//        popUpMessage.getText();
//        closePopUp.click();
//    }

    public void clickGuestCheckoutButton(){
       guestCheckoutButton.click();
    }

    public void clickOnShoppingCart() {
        shoppingCartButton.click();
    }

   public void acceptTermAndCondition() {
       acceptTermAndConditionCheckBox.click();
    }

    public void clickCheckoutButton() {
        checkoutButton.click();
    }


    public void enterBillingDetails(String firstName,String lastName,String email,String country, String city, String address1, String postCode, String phoneNumber) {

        firstNameBox.sendKeys(firstName);
        lastNameBox.sendKeys(lastName);
        emailBox.sendKeys(email);
        countryName.sendKeys(country);
        cityName.sendKeys(city);
        address1box.sendKeys(address1);
        postCodeBox.sendKeys(postCode);
        phoneNumberBox.sendKeys(phoneNumber);
    }
    public void clickContinueButton(){
        continueButtonOnBilling.click();
    }

    public void getCheckoutText(){
        String text = checkoutText.getText();
        System.out.println(text);
    }
    public void clickContinueButtonOnCheckout(){
        continueButtonOnCheckout.click();
    }
    public void clickOnCreditCardRadioButton(){
        creditCardRadioButton.click();
    }
    public void clickOnContinueButtonOnPayment(){
        continueButtonOnPayment.click();
    }
    public void selectExpireYear() throws InterruptedException {

        Select selectByIndex = new Select(driver.findElement(By.id("ExpireYear")));
        selectByIndex.selectByIndex(2);
        Thread.sleep(5000);
    }
    public void enterPaymentDetails(String cardHolderName,String cardNumber, String cardCode){
        cardHolderNameBox.sendKeys(cardHolderName);
        cardNumberBox.sendKeys(cardNumber);
        cardCodeBox.sendKeys(cardCode);
    }
    public void clickOnContinueButtonOnPaymentInfo(){
        continueButtonOnPaymentInfo.click();
    }
    public void clickOnConfirmButton(){
        confirmButton.click();
    }
    public void getTextOnOrderComplition(){
        String text1 = thankYouText.getText();
        System.out.println(text1);

        String text2 = text.getText();
        System.out.println(text2);
    }

}

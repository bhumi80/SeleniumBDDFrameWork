package org.example.step_def;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.HomePage;
import org.example.pages.RegistrationPage;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class RegistrationSteps extends DriverManager {

    RegistrationPage registrationPage = new RegistrationPage();
    HomePage homepage = new HomePage();

    @Given("^I am on home page$")
    public void i_am_on_home_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        homepage.clickOnRegistrationButton();

    }

    @Given("^I am on register page$")
    public void i_am_on_register_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        registrationPage.getRegisterText();
    }

    @When("^I enter first name, lastname, valid email,password and confirm password$")
    public void i_enter_first_name_lastname_valid_email_password_and_confirm_password() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        registrationPage.enterValidDataOnMandatoryFields();
    }

    @Then("^I click on register button on register page$")
    public void i_click_on_register_button_on_register_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        registrationPage.clickOnRegisterButtonOnRegisterPage();
    }
}





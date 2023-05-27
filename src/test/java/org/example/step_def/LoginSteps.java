package org.example.step_def;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.LoginPage;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class LoginSteps extends DriverManager {

    LoginPage loginpage = new LoginPage();
    @Then("^I should see \"([^\"]*)\" text$")
    public void i_should_see_text(String expectedText) throws Throwable {
       String actualTest = loginpage.getWelcomeText();
       assertEquals (actualTest,expectedText);

    }

    @Then("^the Url should contain \"([^\"]*)\"$")
    public void the_Url_should_contain(String expectedText) throws Throwable {
       String myUrl = getUrl();
       assertThat(myUrl,containsString(expectedText));
    }

    @Given("^I click on login link button on home page$")
    public void i_click_on_login_link_button_on_home_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        loginpage.clickLoginButton();
    }

    @When("^I enter valid email address and password$")
    public void i_enter_valid_email_address_and_password() throws Throwable {

        loginpage.enterValidCredentials();
        loginpage.clickLoginButton();
    }

    @Then("^I can see logout button on header$")
    public void i_can_see_logout_button_on_header() throws Throwable {

        loginpage.logOutButton();

    }
    }

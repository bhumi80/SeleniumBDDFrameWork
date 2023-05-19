package org.example.step_def;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class HomeSteps extends DriverManager {

    HomePage homePage = new HomePage();


    @Given("^I am on homepage$")
    public void i_am_on_homepage() throws Throwable {
        String myUrl = getUrl();
        System.out.println(myUrl);
        assertThat(myUrl, is(endsWith("nopcommerce.com/")));

    }

    @When("^I click on login button$")
    public void i_click_on_login_button() throws Throwable {

        homePage.clickOnLoginButton();
    }

    @When("^I click on register button$")
    public void i_click_on_register_button() throws Throwable {
        homePage.clickOnRegistrationButton();
    }
}

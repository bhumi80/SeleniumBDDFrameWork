package org.example.step_def;

import cucumber.api.java.en.Then;
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
}

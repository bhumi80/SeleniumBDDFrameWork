package org.example.step_def;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.HomePage;
import org.example.pages.RegistrationPage;

import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

public class RegistrationSteps extends DriverManager {

    RegistrationPage registrationPage = new RegistrationPage();
    HomePage homepage = new HomePage();

    @Given("^I am on home page$")
    public void i_am_on_home_page() throws Throwable {

        homepage.clickOnRegistrationButton();

    }

    @Given("^I am on register page$")
    public void i_am_on_register_page() throws Throwable {

        registrationPage.getRegisterText();
    }


//    @When("^I enter first name, lastname, valid email,password and confirm password$")
//    public void i_enter_first_name_lastname_valid_email_password_and_confirm_password() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//
//        registrationPage.enterValidDataOnMandatoryFields();
//    }


    @When("^I enter following details for registration$")
    public void i_enter_following_details_for_registration(DataTable dataTable) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)

        registrationPage.selectRadioButton();

        List<Map<String,String>> data = dataTable.asMaps(String.class,String.class);
        System.out.println(data);
        System.out.println(dataTable);

        registrationPage.enterRegistrationDetails(
                data.get(0).get("firstName"),
                data.get(0).get("lastName"),
                data.get(0).get("email"),
                data.get(0).get("password"),
                data.get(0).get("confirmPassword")
        );
    }

//    @Then("^I click on register button on register page$")
//    public void i_click_on_register_button_on_register_page() throws Throwable {
//
//        registrationPage.clickOnRegisterButtonOnRegisterPage();
//    }


  @When("^I click on submit register button$")
public void i_click_on_submit_register_button() throws Throwable {

        registrationPage.clickOnRegisterButtonOnRegisterPage();
}

@Then("^I should see continue button & text \"([^\"]*)\"$")
public void i_should_see_continue_button_text(String arg1) throws Throwable {
    registrationPage.displayContinueButton();
    registrationPage.getRegText();
}






//        boolean check = registrationPage.displayContinueButton();
//        assertTrue(check);


}





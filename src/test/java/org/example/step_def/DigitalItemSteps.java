package org.example.step_def;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.DigitalItemPage;

public class DigitalItemSteps extends DriverManager {

    DigitalItemPage digitalItemPage = new DigitalItemPage();

    @When("^I click on digital downloads button$")
    public void i_click_on_digital_downloads_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

       digitalItemPage.clickOnDigitalDownloadButton();
    }

    @Then("^I select (\\d+) on display button$")
    public void i_select_on_display_button(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        digitalItemPage.setDisplayButton();
    }

    @Then("^display  three items$")
    public void display_three_items() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

         digitalItemPage.getItemName();
    }


}

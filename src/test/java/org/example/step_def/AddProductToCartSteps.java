package org.example.step_def;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.AddProductToCartPage;
import org.example.pages.HomePage;

public class AddProductToCartSteps extends DriverManager {

AddProductToCartPage addProductToCartPage = new AddProductToCartPage();
//HomePage homePage = new HomePage();
//    @Given("^I am on home page$")
//    public void i_am_on_home_page() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//
//
//    }
    @When("^I search for product \"([^\"]*)\"$")
    public void i_search_for_product(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        addProductToCartPage.enterProduct();
    }

    @When("^I add the product to cart$")
    public void i_add_the_product_to_cart() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        addProductToCartPage.addToCart();
    }

   @Then("^the product should be on cart$")
   public void the_product_should_be_on_cart() throws Throwable {
       // Write code here that turns the phrase above into concrete actions

       addProductToCartPage.setPopupMessage();

   }

}

package org.example.step_def;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.ProductCheckoutSuccessfullyPage;

import java.util.List;
import java.util.Map;

public class ProductCheckoutSuccessfullySteps extends DriverManager {
    ProductCheckoutSuccessfullyPage end2EndPage = new ProductCheckoutSuccessfullyPage();

    @When("^I click on \"([^\"]*)\"$")
    public void i_click_on(String arg1) throws Throwable {

        end2EndPage.clickOnJewelryButton();
    }

    @When("^I click on Flower Girl Bracelet$")
    public void i_click_on_Flower_Girl_Bracelet() throws Throwable {

        end2EndPage.clickOnBracelet();
        Thread.sleep(3000);
    }

    @When("^I click on Add To Cart$")
    public void i_click_on_Add_To_Cart() throws Throwable {

end2EndPage.clickOnAddToCart();
    }

//    @When("^I see pop up message \"([^\"]*)\"$")
//    public void i_see_pop_up_message(String arg1) throws Throwable {
//
//        end2EndPage.clickOnPopUpMessage();
//
//    }

    @When("^I click on shopping cart$")
    public void i_click_on_shopping_cart() throws Throwable {

        end2EndPage.clickOnShoppingCart();

    }

    @When("^I click on accept term and condition checkbox$")
    public void i_click_on_accept_term_and_condition_checkbox() throws Throwable {
        end2EndPage.acceptTermAndCondition();

    }

    @When("^I click on checkout button$")
    public void i_click_on_checkout_button() throws Throwable {

        end2EndPage.clickCheckoutButton();

    }

    @Given("^I click on checkout as guest$")
    public void i_click_on_checkout_as_guest() throws Throwable {
       end2EndPage.clickGuestCheckoutButton();
    }

    @Given("^I enter following details on billing address$")
    public void i_enter_following_details_on_billing_address(DataTable dataTable) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)

        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        System.out.println(data);
        System.out.println(dataTable);

        end2EndPage.enterBillingDetails(
                data.get(0).get("firstName"),
                data.get(0).get("lastName"),
                data.get(0).get("email"),
                data.get(0).get("country"),
                data.get(0).get("city"),
                data.get(0).get("address1"),
                data.get(0).get("postCode"),
                data.get(0).get("phoneNumber")
        );
    }



    @When("^I click on continue button$")
    public void i_click_on_continue_button() throws Throwable {

        end2EndPage.clickContinueButton();

    }

    @When("^I should see checkout text$")
    public void i_should_see_checkout_text() throws Throwable {

        end2EndPage.getCheckoutText();

    }

    @When("^I click on continue button on shipping method$")
    public void i_click_on_continue_button_on_shipping_method() throws Throwable {

        end2EndPage.clickContinueButtonOnCheckout();

    }

    @When("^I select on credit card$")
    public void i_select_on_credit_card() throws Throwable {

        end2EndPage.clickOnCreditCardRadioButton();

    }

    @When("^I click on continue button on payment method$")
    public void i_click_on_continue_button_on_payment_method() throws Throwable {

        end2EndPage.clickOnContinueButtonOnPayment();

    }

    @When("^I enter following details on payment page$")
    public void i_enter_following_details_on_payment_page(DataTable dataTable) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)

        end2EndPage.selectExpireYear();

        List<Map<String,String>> data = dataTable.asMaps(String.class,String.class);
        System.out.println(data);
        System.out.println(dataTable);

        end2EndPage.enterPaymentDetails(
                data.get(0).get("cardHolderName"),
                data.get(0).get("cardNumber"),
                data.get(0).get("cardCode")
        );

    }

    @When("^I click on continue button on payment information$")
    public void i_click_on_continue_button_on_payment_information() throws Throwable {

        end2EndPage.clickOnContinueButtonOnPaymentInfo();

    }

    @When("^I click on confirm button$")
    public void i_click_on_confirm_button() throws Throwable {

        end2EndPage.clickOnConfirmButton();

    }

    @Then("^I should see \"([^\"]*)\" text on confirmation page$")
    public void i_should_see_text_on_confirmation_page(String arg1) throws Throwable {

        end2EndPage.getTextOnOrderComplition();

    }

}

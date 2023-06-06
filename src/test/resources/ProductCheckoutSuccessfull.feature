@bsr6
Feature: As a user I want to check E2E functionality

  Scenario: Buy one product
    Given I am on homepage
#    When I click on register button
#    And I enter following details on register page
#      | firstName | lastName | email               | password | confirmPassword |
#      | Arya      | sharma   | sharma234@yahoo.com | 33445511 | 2233445511      |
#    And I click on register button
    And I click on "jewelry"
    And I click on Flower Girl Bracelet
    And I click on Add To Cart
#    And I see pop up message "The product has been added to your shopping cart"
    And I click on shopping cart
    And I click on accept term and condition checkbox
    And I click on checkout button
    And I click on checkout as guest
    And I enter following details on billing address
      | firstName | lastName | email            | country        | city | address1        | postCode | phoneNumber |
      | Rikin     | Patel    | rik346@patel.com | United Kingdom | York | 28 preston road | br24 9np | 8234567888  |
    And I click on continue button
    And I should see checkout text
    And I click on continue button on shipping method
    And I select on credit card
    And I click on continue button on payment method
    And I enter following details on payment page
      | cardHolderName | cardNumber       | expireYear | cardCode |
      | Rikin Patel    | 1133222255554444 | 2024       | 786      |
    And I click on continue button on payment information
    When I click on confirm button
    Then I should see "Thank you" text on confirmation page
    And I should see "Your order has been successfully processed!" text on confirmation page



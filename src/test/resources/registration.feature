@bsr2
Feature: registration feature
  As a user
  I want to add registration functionality
  So that customer can use it


#  Scenario: Validating Register text on register page
#
#    Given I am on homepage
#    When I click on register button
#    Then I should see "Register" text
#
#  Scenario: Validating mandatory field on register page
#    Given I am on home page
#    When I click on register button
#    And I enter first name, lastname, valid email,password and confirm password
#    Then I click on register button on register page

  @bsr5
  Scenario Outline: Register details with data table

    Given I am on homepage
    When I click on register button
    And I enter following details for registration
      | gender   | firstName   | lastName   | email   | password   | confirmPassword   |
      | <gender> | <firstName> | <lastName> | <email> | <password> | <confirmPassword> |
    And I click on submit register button
    Then I should see continue button & text "Your registration completed"

    Examples:
      | gender | firstName | lastName | email          | password   | confirmPassword |
      | female | Piku      | Taylor   | pt67@gmail.com | asdfghjkl1 | asdfghjkl1      |







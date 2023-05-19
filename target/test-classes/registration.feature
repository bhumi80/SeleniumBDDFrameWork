@bsr1
Feature: registration feature
  As a user
  I want to add registration functionality
  So that customer can use it


  Scenario: Validating Register text on register page

    Given I am on homepage
    When I click on register button
    Then I should see "Register" text

@bsr2
    Scenario: Validating mandatory field on register page
      Given I am on home page
      When I click on register button
      And I enter first name, lastname, valid email,password and confirm password
      Then I click on register button on register page





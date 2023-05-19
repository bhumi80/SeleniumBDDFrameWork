@nrk1

Feature: login feature
  As a user
  I want to add login functionality
  So that customer can use it

  Scenario: Validating login text on login page

    Given I am on homepage
    When I click on login button
    Then I should see "Welcome, Please Sign In!" text
    And the Url should contain "/login"

@bsr4
Feature: As a user I click on digital downloads i can able to see 6 items per page

  Scenario: Digital downloads page display 3 items
    Given I am on homepage
    When I click on digital downloads button
    Then I select 3 on display button
    And display  three items


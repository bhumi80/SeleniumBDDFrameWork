@bsr3
Feature: Product to cart
  As a user i want to add product to cart
  so i buy product

  Scenario: add product to basket
    Given I am on homepage
    When I search for product "portable sound speakers"
    And I add the product to cart
    Then the product should be on cart
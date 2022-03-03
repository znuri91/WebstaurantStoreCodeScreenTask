@regression
  Feature: As non-registered user, I should be able to perform a product search on the website and add/remove to the cart




  Scenario: Search for a product using valid product name and add/remove to/from cart

    Given I am on the HomePage
    When I search for "stainless work table"
    Then I should land on the search page with result
    And  All products on the search list should have the word "table" in its title
    When I add last found item into the cart
    Then I should be able to go to the cart and empty cart
    Then I should be able to see "Your cart is empty." message








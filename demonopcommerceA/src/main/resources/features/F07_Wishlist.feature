@smoke

Feature: F05_FollowUs | User could add products to wishlist

  Background:
    When      user navigate to login page
    And       user enter "akram_rashed5@yahoo.com" and "Udacity1112"
    Then      user click on login button
    And       user could login successfully and go to home page

  Scenario: success message is visible after adding item to wishlist
    When    user add item to wishlist
    Then    wishlist success operation massage is visible


  Scenario: number of wishlist items in home page is increased
    When    user add item to wishlist
    Then    wishlist success operation massage is visible
    And     user can get the number of wishlist items added
    Then    the number of wishlist increased


  Scenario: added items are displayed on wishlist
    When    user add item to wishlist
    Then    wishlist success operation massage is visible
    And     user can get the number of wishlist items added
    And     user can go to wishlist page
    Then    the number of items greater than zero in wishlist page

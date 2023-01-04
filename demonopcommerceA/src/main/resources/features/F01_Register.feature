@smoke

Feature: F01_Register | Users could register with new accounts

  Background:
    Given user navigate to register page

  Scenario: user full the data to be able to register to the website
    And     user select gender type
    When    user enter valid data
    Then    user click on register button
    Then    success message is displayed

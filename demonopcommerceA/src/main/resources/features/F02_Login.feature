@smoke

Feature: F02_Login | User should be able to login to the system


  Scenario: user login with valid data
    When    user navigate to login page
    And     user enter "akram_rashed5@yahoo.com" and "Udacity@1112"
    Then    user click on login button
    And     user could login successfully and go to home page


  Scenario: user login with invalid data
    When    user navigate to login page
    And     user enter "akram_rashed6@yahoo.com" and "Udacity"
    Then    user click on login button
    And     user could not login successfully and go to home page

@smoke

Feature: F03_Search |Logged user could search for any products


  Scenario: user could search for product name
    Given user clicks on search field
    When user search for product name like "Nokia"
    And user click on search Button
    Then user could search successfully and go to search page


  Scenario: user search using SKU
    Given   user clicks on search field
    When    user search for product name like "AP_MBP_13"
    And     user click on search Button
    Then    user could search successfully with SKU code


  Scenario: user search using invalid product name
    Given   user clicks on search field
    When    user search for product name like "Xiaomi"
    And     user click on search Button
    Then    user could not search for the product
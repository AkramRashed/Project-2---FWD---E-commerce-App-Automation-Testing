@smoke

Feature: F04_Categories | User could select different categories


  Scenario: user could select different categories
    When    user select category and subcategory
    And     user click on subcategory
    Then    user find relative product page

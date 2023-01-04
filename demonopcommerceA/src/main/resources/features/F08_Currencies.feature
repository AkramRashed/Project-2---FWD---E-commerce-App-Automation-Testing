@smoke

Feature: F06_Currencies | User could switch between currencies [$, €]


  Scenario: user can choose euro currency
    When user select “euro” from currency dropdown list
    Then  All the products change to euro symbol
    Then user choose Euro successfully


Feature: Login Page Test

  Scenario: Login Page Displayed With URL Valid
    Given User Enter Valid Url DMS
    Then User Get Text Title Login Page

  Scenario: Login Page No Displayed With URL Invalid
    Given User Enter Invalid Url DMS
    Then User Get Text 404 Not Found

  Scenario: User Input Valid Username And Password
    Given User Enter Valid Url DMS
    When User Input Valid Username
    And User Input Valid Password
    And User Click Button Login
    Then User Get Text Logo DMS In Dashboard

  Scenario: User Logout
    When User Click Button Logout
    Then User Get Text Title Login Page










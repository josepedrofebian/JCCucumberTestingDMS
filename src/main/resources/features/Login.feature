Feature: Login Page Test

  Scenario: Login Page Displayed URL Valid
    Given User Enter Valid Url DMS
    Then User Get Text Title Login Page

  Scenario: Login Page No Displayed URL Invalid
    Given User Enter Invalid Url DMS
    Then User Get Text 404 Not Found








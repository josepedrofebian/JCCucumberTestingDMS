Feature: Login Page Test

  Scenario: Login Page Displayed With URL Valid
    Given User Enter Valid Url DMS
    Then User Get Text Title Login Page

  Scenario: Login Page No Displayed With URL Invalid
    Given User Enter Invalid Url DMS
    Then User Get Text 404 Not Found

  Scenario: User Input Invalid Username And Password
    Given User Enter Valid Url DMS
    When User Input Invalid Username
    And User Input Invalid Password
    And User Click Button Login
    Then User Get Text Error Message Wrong Username Or Password

  Scenario: User Login Without Input Username
    Given User Enter Valid Url DMS
    When User Input Username empty
    And User Input Valid Password
    And User Click Button Login
    Then User Get Warning From Field Username Required

  Scenario: User Login Without Input Password
    Given User Enter Valid Url DMS
    When User Input Valid Username
    And User Input Password empty
    And User Click Button Login
    Then User Get Warning From Field Password Required

  Scenario: User Input Valid Username And Password
    Given User Enter Valid Url DMS
    When User Input Valid Username
    And User Input Valid Password
    And User Click Button Login
    Then User Get Text Logo DMS In Home page










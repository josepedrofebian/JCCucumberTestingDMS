Feature: Master Media Page Test

  Scenario: MM001 User Go To Data Media Arsip Page
    Given  User Enter Valid Url DMS
    When User Input Valid Username
    And User Input Valid Password
    And User Click Button Login
    When User Click Data Master Media
    And User Click Media Menu
    Then User Get Text Data Media Arsip Menu

  Scenario: MM002 User Input Data
    When User Click Button Input Data Media
    And User Input Nama Media
    And User Click Button Simpan Media
    And User Click Button Alert Ok Media
    Then User Get Text Data Media Arsip Menu
    And User Click Button Logout

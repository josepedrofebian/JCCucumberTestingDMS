Feature: Home Page Test

  Scenario: TH001 User Go To Internal Page From Internal Card More Info
    Given  User Enter Valid Url DMS
    And User Input Valid Username
    And User Input Valid Password
    And User Click Button Login
    When User Click Button More Info Internal
    Then User Direct To Internal Dokumen Page

  Scenario: TH002 User Go To Eksternal Page From Eksternal Card More Info
    When User Click Button More Info Eksternal
    Then User Direct To Eksternal Dokumen Page

  Scenario: TH003 User Go To Perizinan From Perizinan Card More Info
    When User Click Button More Info Perizinan
    Then User Direct To Perizinan Page

  Scenario: TH004 Value Internal Document Card Same Like Value Internal Document Page
    When Get Text Value Of Internal Document In Card
    And User Click Button More Info Internal
    Then Get Text Value Of Internal Document

  Scenario: TH005 Value Eksternal Document Card Same Like Value Eksternal Document Page
    When Get Text Value Of Eksternal Document In Card
    And User Click Button More Info Eksternal
    Then Get Text Value Of Eksternal Document

  Scenario: TH006 Value Perizinan Card Same Like Value Perizinan Page
    When Get Text Value Of Perizinan In Card
    And User Click Button More Info Perizinan
    Then Get Text Value Of Perizinan

  Scenario: TH007 User Go To Home Page From Side Bar Menu Home
    When User Click Side Bar Menu Home
    Then User Direct To Home Page

  Scenario: TH008 User Go To Home Page From Icon Home
    When User Click Icon Home
    Then User Direct To Home Page
    And User Click Button Logout





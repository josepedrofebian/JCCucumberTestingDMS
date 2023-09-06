Feature: Home Page Test

  Scenario: TH001 User Go To Internal Page From Internal Card More Info
    When User Click Button More Info Internal
    Then User Direct To Internal Dokumen Page

  Scenario: TH002 User Go To Eksternal Page From Eksternal Card More Info
    When User Click Button More Info Eksternal
    Then User Direct To Eksternal Dokumen Page

  Scenario: TH003 User Go To Perizinan From Perizinan Card More Info
    When User Click Button More Info Perizinan
    Then User Direct To Perizinan Page

  Scenario: TH007 User Go To Home Page From Side Bar Menu Home
    When User Click Side Bar Menu Home
    Then User Direct To Home Page

  Scenario: TH008 User Go To Home Page From Icon Home
    And User Click Icon Home
    Then User Direct To Home Page





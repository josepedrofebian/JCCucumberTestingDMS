Feature: Master Group Dokumen Page

  Scenario: TGD001 User Go To Group Dokumen Page
    Given User Enter Valid Url DMS
    And User Input Valid Username
    And User Input Valid Password
    And User Click Button Login
    When User Click Side Bar Menu Data Master
    And User Click Side Bar Menu Group Dokumen
    Then User Get Text Title In Group Dokumen Page

  Scenario: TGD002 User Search Some Document In Group Documents
    When User Fill Search Field
    And User Click Button Search Group Documents
    Then User Get Text Result Of Search

  Scenario: TGD005 User Input Data Group Dokumen
    When User Click Button Input Data Group Dokumen
    And User Input Kode Group Dokumen
    And User Input Nama Group Dokumen
    And User Input Retensi Group Dokumen
    And User Click Button Simpan Group Dokumen
    Then User Get Text Result Of Group Dokumen

  Scenario: TGD017 User Cancel Input Data Group Dokumen With Button Close
    When User Click Button Input Data Group Dokumen
    And User Click Button Close Input Data Group Dokumen
    Then User Get Text Result Of Group Dokumen
    And User Click Button Logout
Feature: Master Template Page Test

  Scenario: TT001 User Go To Template page from Side Bar Menu
    Given  User Enter Valid Url DMS
    And User Input Valid Username
    And User Input Valid Password
    And User Click Button Login
    When User Click Side Bar Menu Data Master
    And User Click Menu Template
    Then User Get Text Title In Template Page

  Scenario: TT002 User Search Some Template
    When User Input In Field Search Template
    And User Click Button Search Template
    Then User Get Data Result Of Search Template

  Scenario: TT003 User Input Data Kategory Internal And Departement Business Development Template
    When User Click Button Input Data Template
    And User Choose Kategory Dropdown Internal
    And User Choose Departemen Dropdown Business Development
    And User Input In Field Nama Template
    And User Input In Field Format Nomor Surat
    And User Click Button Simpan Template
    Then User Get Text Success Data Berhasil Disimpan Template

  Scenario: TT004 User Input Data Kategory Internal And Departement HRD Template
    When User Click Button Input Data Template
    And User Choose Kategory Dropdown Internal
    And User Choose Departemen Dropdown HRD
    And User Input In Field Nama Template
    And User Input In Field Format Nomor Surat
    And User Click Button Simpan Template
    Then User Get Text Success Data Berhasil Disimpan Template

  Scenario: TT005 User Input Data Kategory Internal And Departement Direksi Template
    When User Click Button Input Data Template
    And User Choose Kategory Dropdown Internal
    And User Choose Departemen Dropdown Direksi
    And User Input In Field Nama Template
    And User Input In Field Format Nomor Surat
    And User Click Button Simpan Template
    Then User Get Text Success Data Berhasil Disimpan Template

  Scenario: TT006 User Input Data Kategory Eksternal And Departement Business Development Template
    When User Click Button Input Data Template
    And User Choose Kategory Dropdown Eksternal
    And User Choose Departemen Dropdown Business Development
    And User Input In Field Nama Template
    And User Input In Field Format Nomor Surat
    And User Click Button Simpan Template
    Then User Get Text Success Data Berhasil Disimpan Template

  Scenario: TT007 User Input Data Kategory Eksternal And Departement HRD Template
    When User Click Button Input Data Template
    And User Choose Kategory Dropdown Eksternal
    And User Choose Departemen Dropdown HRD
    And User Input In Field Nama Template
    And User Input In Field Format Nomor Surat
    And User Click Button Simpan Template
    Then User Get Text Success Data Berhasil Disimpan Template

  Scenario: TT008 User Input Data Kategory Eksternal And Departement Direksi Template
    When User Click Button Input Data Template
    And User Choose Kategory Dropdown Eksternal
    And User Choose Departemen Dropdown Direksi
    And User Input In Field Nama Template
    And User Input In Field Format Nomor Surat
    And User Click Button Simpan Template
    Then User Get Text Success Data Berhasil Disimpan Template

  Scenario: TT009 User Cancel Input Data Template With Button Close
    When User Click Button Input Data Template
    And User Click Button CLose Input Data Template
    Then User Get Text Title In Template Page

  Scenario: TT010 User Cancel Input Data Template With Button X
    When User Click Button Input Data Template
    And User Click Button X Input Data Template
    Then User Get Text Title In Template Page

  Scenario: TT011 User Edit Data Kategory Internal And Departement Business Development Template
    When User Click Button Edit Data Template
    And User Choose Kategory Dropdown Internal Edit
    And User Choose Departemen Dropdown Business Development Edit
    And User Input In Field Nama Template Edit
    And User Input In Field Format Nomor Surat Edit
    And User Click Button Simpan Template Edit
    Then User Get Text Success Data Berhasil Diubah Template

  Scenario: TT012 User Edit Data Kategory Internal And Departement HRD Template
    When User Click Button Edit Data Template
    And User Choose Kategory Dropdown Internal Edit
    And User Choose Departemen Dropdown HRD Edit
    And User Input In Field Nama Template Edit
    And User Input In Field Format Nomor Surat Edit
    And User Click Button Simpan Template Edit
    Then User Get Text Success Data Berhasil Diubah Template

  Scenario: TT013 User Edit Data Kategory Internal And Departement Direksi Template
    When User Click Button Edit Data Template
    And User Choose Kategory Dropdown Internal Edit
    And User Choose Departemen Dropdown Direksi Edit
    And User Input In Field Nama Template Edit
    And User Input In Field Format Nomor Surat Edit
    And User Click Button Simpan Template Edit
    Then User Get Text Success Data Berhasil Diubah Template

  Scenario: TT014 User Edit Data Kategory Eksternal And Departement Business Development Template
    When User Click Button Edit Data Template
    And User Choose Kategory Dropdown Eksternal Edit
    And User Choose Departemen Dropdown Business Development Edit
    And User Input In Field Nama Template Edit
    And User Input In Field Format Nomor Surat Edit
    And User Click Button Simpan Template Edit
    Then User Get Text Success Data Berhasil Diubah Template

  Scenario: TT015 User Edit Data Kategory Eksternal And Departement HRD Template
    When User Click Button Edit Data Template
    And User Choose Kategory Dropdown Eksternal Edit
    And User Choose Departemen Dropdown HRD Edit
    And User Input In Field Nama Template Edit
    And User Input In Field Format Nomor Surat Edit
    And User Click Button Simpan Template Edit
    Then User Get Text Success Data Berhasil Diubah Template

  Scenario: TT016 User Edit Data Kategory Eksternal And Departement Direksi Template
    When User Click Button Edit Data Template
    And User Choose Kategory Dropdown Eksternal Edit
    And User Choose Departemen Dropdown Direksi Edit
    And User Input In Field Nama Template Edit
    And User Input In Field Format Nomor Surat Edit
    And User Click Button Simpan Template Edit
    Then User Get Text Success Data Berhasil Diubah Template

  Scenario: TT017 User Cancel Edit Data Template With Button Close
    When User Click Button Edit Data Template
    And User Click Button CLose Edit Data Template
    Then User Get Text Title In Template Page

  Scenario: TT018 User Cancel Edit Data Template With Button X
    When User Click Button Edit Data Template
    And User Click Button X Edit Data Template
    Then User Get Text Title In Template Page
    And User Click Button Logout

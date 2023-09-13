Feature: Master Departemen Page Test

  Scenario: TD001 User menuju Departemen Page melalui Side Bar Menu Data Master
    Given User Enter Valid Url DMS
    And User Input Valid Username
    And User Input Valid Password
    And User Click Button Login
    When User pilih Side Bar Menu Data Master
    And User pilih menu Departemen
    Then User menuju Departemen Page

  Scenario: TD003 User Input Data Departemen
    When User Pilih Tombol Input Data Departemen
    And User Input Data Nama Departemen
    And User pilih Tombol Simpan Departemen
    Then User Mendapat text Data Berhasil Disimpan Departemen

  Scenario: TD004 User Input Data Nama Departemen dengan Kosong
    When User Pilih Tombol Input Data Departemen
    And User Input Data Nama Departemen dengan Kosong
    And User pilih Tombol Simpan Departemen
    Then Tammpilkan Pesan Error Nama Harus Diisi Departemen

  Scenario: TD009 User Batal Input Data Deprtemen dengan Pilih Tombol Close
    When User Pilih Tombol Input Data Departemen
    And User pilih Tombol Close
    Then User menuju Departemen Page

  Scenario: TD010 User Batal Input Data Departemen Dengan Tombol X
    When User Pilih Tombol Input Data Departemen
    And User Pilih Tombol X
    Then User menuju Departemen Page
    And User Click Button Logout
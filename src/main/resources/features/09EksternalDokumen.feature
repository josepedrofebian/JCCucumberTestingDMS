Feature: Eksternal Dokumen Page Test

  Scenario: ED001 User Go To Eksternal Page
    Given  User Enter Valid Url DMS
    And User Input Valid Username
    And User Input Valid Password
    And User Click Button Login
    When User Click Button Eksternal Dokumen
    Then User Direct To Dokumen Eksternal

  Scenario: ED024 User Filter Some Documents Eksternal
    When User Input Nomor Dokumen Field
    And User Input Nama Dokumen Field
    And User Click Button Filter Eksternal
    Then User Get Data Result Of Search

  Scenario: ED027 Show Input Data Page Documents Eksternal
    When User click Button Input Data Eksternal
    Then User Get Text Title Input Data Eksternal

    Scenario: ED003 User Input Data Eksternal Share Ya Status Aktif
      When User click Button Input Data Eksternal
      And User Choose Template Eksternal
      And User Fill Nama Dokumen
      And User Fill Nama Klien
      And User Fill Tanggal Mulai
      And User Fill Tanggal Berakhir
      And User Fill Diterbitkan Oleh
      And User Fill Deskripsi
      And User Fill Pemilik Dokumen
      And User Fill Dibuat Oleh
      And User Fill Tim Terkait
      And User Fill Tanggal Reminder
      And User Choose Jenis Media
      And User Click Button Simpan Eksternal
      Then User Get Message Data Berhasil Di Saved! Eksternal
      And User Click Button Logout


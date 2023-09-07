Feature: Master Lokasi Penyimpanan Page Test

  Scenario: TLP001 User Go To Lokasi Penyimpanan page from Side Bar Menu
    When User click Side Bar Menu Data Master
    And User click menu lokasi penyimpanan
    Then User Direct To Lokasi Penyimpanan Page

  Scenario: TLP002 User Search Some Document
    When User Input In Field Search
    And User Click Button Search
    Then User Get Data Result Of Search

#  Scenario: TLP008 Show Modal For Input Data
#    When User Click Button Input Data
#    Then User Get Text Title Input Data

  Scenario: TLP003 User Input Data Name Lokasi Penyimpanan
    When User Click Button Input Data
    And User Input Data Nama Lokasi Penyimpanan
    And User Click Button Simpan
    Then User Get Text Success Data Berhasil Disimpan

  Scenario: TLP004 User Input Data Name With Empty
    When User Click Button Input Data
    And User Input Data Nama Lokasi Penyimpanan With Empty
    And User Click Button Simpan
    Then Show Message Error Nama Harus Diisi

  Scenario: TLP005 User Input Data Name With Same Name
    When User Click Button Input Data
    And User Input Data Nama Lokasi Penyimpanan With Same Name
    And User Click Button Simpan
    Then Show Message Error Nama Lokasi Sudah Ada

#  Scenario: TLP006 User Input Data Name With Space
#    When User Click Button Input Data
#    And User Input Data Nama Lokasi Penyimpanan With Space
#    And User Click Button Simpan
#    Then Show Message Error Nama Tidak Boleh Hanya Spasi
#    And User Click Button Close

#  Scenario: TLP007 User Input Data Name With Special Character
#    When User Click Button Input Data
#    And User Input Data Nama Lokasi Penyimpanan With Special Character
#    And User Click Button Simpan
#    Then Show Message Error Nama Tidak Boleh Mengandung Spesial Karakter

  Scenario: TLP009 User Cancel Input Data With Click Button Close
    When User Click Button Input Data
    And User Click Button Close
    Then User Direct To Lokasi Penyimpanan Page

  Scenario: TLP010 User Cancel Input Data With Click X
    When User Click Button Input Data
    And User Click Button X
    Then User Direct To Lokasi Penyimpanan Page

  Scenario: TLP011 User Edit Data
    When User Click Button Edit Data
    And User Edit Data Nama Lokasi Penyimpanan
    And User Click Button Simpan Edit
    Then User Get Text Success Data Berhasil Diubah

#  Scenario: TLP012 User Edit Data With Same Name
#    When User Click Button Edit Data
#    And User Edit Data Nama Lokasi Penyimpanan With Same Name
#    And User Click Button Simpan
#    Then Show Message Error Edit Data Dengan Lokasi Yang Baru

#  Scenario: TLP013 User Edit Data With Special Character
#    When User Click Button Input Data
#    And User Edit Data Nama Lokasi Penyimpanan
#    And User Click Button Simpan
#    Then Show Message Error Nama Tidak Boleh Mengandung Spesial Karakter

#  Scenario: TLP014 User Edit Data With Space
#    When User Click Button Input Data
#    And User Edit Data Nama Lokasi Penyimpanan
#    And User Click Button Simpan
#    Then Show Message Error Nama Harus Diisi

#  Scenario: TLP015 User Edit Data With Empty
#    When User Click Button Input Data
#    And User Input Data Nama Lokasi Penyimpanan
#    And User Click Button Simpan
#    Then Show Message Error Nama Harus Diisi
#
  Scenario: TLP016 User Cancel Edit Data With Click Button Cancel
    When User Click Button Edit Data
    And User Click Button Close Edit
    Then User Direct To Lokasi Penyimpanan Page

  Scenario: TLP017 User Cancel Edit Data With Click Button X
    When User Click Button Edit Data
    And User Click Button X Edit
    Then User Direct To Lokasi Penyimpanan Page

  Scenario: TLP018 User Go To Home page from Icon Home
    When User Click Icon Home From Lokasi Penyimpanan Page
    Then User Direct To Home Page
Feature: Master Lokasi Penyimpanan Page Test

  Scenario: TLP001 User Go To Lokasi Penyimpanan page from Side Bar Menu
    Given  User Enter Valid Url DMS
    And User Input Valid Username
    And User Input Valid Password
    And User Click Button Login
    When User click Side Bar Menu Data Master
    And User click menu lokasi penyimpanan
    Then User Direct To Lokasi Penyimpanan Page

  Scenario: TLP002 User Search Some Lokasi Penyimpanan
    When User Input In Field Search Lokasi Penyimpanan
    And User Click Button Search Lokasi Penyimpanan
    Then User Get Data Result Of Search Lokasi Penyimpanan

  Scenario: TLP003 User Input Data Name Lokasi Penyimpanan
    When User Click Button Input Data Lokasi Penyimpanan
    And User Input Data Nama Lokasi Penyimpanan
    And User Click Button Simpan Lokasi Penyimpanan
    Then User Get Text Success Data Berhasil Disimpan Lokasi Penyimpanan

  Scenario: TLP004 User Input Data Lokasi Penyimpanan Name With Empty
    When User Click Button Input Data Lokasi Penyimpanan
    And User Input Data Nama Lokasi Penyimpanan With Empty
    And User Click Button Simpan Lokasi Penyimpanan
    Then Show Message Error Nama Harus Diisi Lokasi Penyimpanan

  Scenario: TLP005 User Input Data Lokasi Penyimpanan Name With Same Name
    When User Click Button Input Data Lokasi Penyimpanan
    And User Input Data Nama Lokasi Penyimpanan With Same Name
    And User Click Button Simpan Lokasi Penyimpanan
    Then Show Message Error Nama Lokasi Sudah Ada Lokasi Penyimpanan

  Scenario: TLP006 User Input Data Lokasi Penyimpanan Name With Space
    When User Click Button Input Data Lokasi Penyimpanan
    And User Input Data Nama Lokasi Penyimpanan With Space
    And User Click Button Simpan Lokasi Penyimpanan
    Then Show Message Error Nama Tidak Boleh Hanya Spasi

  Scenario: TLP007 User Input Data Lokasi Penyimpanan Name With Spesial Character
    When User Click Button Close
    And User Click Button Input Data Lokasi Penyimpanan
    And User Input Data Nama Lokasi Penyimpanan With Special Character
    And User Click Button Simpan Lokasi Penyimpanan
    Then Show Message Error Nama Tidak Boleh Mengandung Spesial Karakter

  Scenario: TLP008 Show Modal Input Data
    When User Click Button Input Data Lokasi Penyimpanan
    Then Show Modal Tambah Data
    And User Click Button Close

  Scenario: TLP009 User Cancel Input Data Lokasi Penyimpanan With Click Button Close
    When User Click Button Input Data Lokasi Penyimpanan
    And User Click Button Close
    Then User Direct To Lokasi Penyimpanan Page

  Scenario: TLP010 User Cancel Input Data Lokasi Penyimpanan With Click X
    When User Click Button Input Data Lokasi Penyimpanan
    And User Click Button X
    Then User Direct To Lokasi Penyimpanan Page

  Scenario: TLP011 User Edit Data Lokasi Penyimpanan
    When User Click Button Edit Data Lokasi Penyimpanan
    And User Edit Data Nama Lokasi Penyimpanan
    And User Click Button Simpan Edit
    Then User Get Text Success Data Berhasil Diubah

  Scenario: TLP012 User Edit Data Nama Lokasi Penyimpanan With Same Name
    When User Click Button Edit Data Lokasi Penyimpanan
    And User Click Button Simpan Edit
    Then Show Message Error Edit Data Dengan Lokasi Yang Baru

  Scenario: TLP013 User Edit Data Nama Lokasi Penyimpanan With Special Character
    When User Click Button Close Edit Lokasi Penyimpanan
    And User Click Button Edit Data Lokasi Penyimpanan
    And User Edit Data Nama Lokasi Penyimpanan With Special Character
    And User Click Button Simpan Edit
    Then Show Message Error Nama Tidak Boleh Mengandung Spesial Karakter

  Scenario: TLP014 User Edit Data Nama With Space
    When User Click Button Edit Data Lokasi Penyimpanan
    And User Edit Data Nama Lokasi Penyimpanan With Space
    And User Click Button Simpan Edit
    Then Show Message Error Edit Data Dengan Lokasi Yang Baru

  Scenario: TLP015 User Edit Data Nama With Empty
    When User Edit Data Nama Lokasi Penyimpanan With Empty
    And User Click Button Simpan Edit
    Then Show Message Error Edit Data Tidak Boleh Kosong

  Scenario: TLP016 User Cancel Edit Data Lokasi Penyimpanan With Click Button Cancel
    When User Click Button Edit Data Lokasi Penyimpanan
    And User Click Button Close Edit Lokasi Penyimpanan
    Then User Direct To Lokasi Penyimpanan Page

  Scenario: TLP017 User Cancel Edit Data Lokasi Penyimpanan With Click Button X
    When User Click Button Edit Data Lokasi Penyimpanan
    And User Click Button X Edit Lokasi Penyimpanan
    Then User Direct To Lokasi Penyimpanan Page

  Scenario: TLP018 User Go To Home page from Icon Home Lokasi Penyimpanan
    When User Click Icon Home From Lokasi Penyimpanan Page
    Then User Direct To Home Page
    And User Click Button Logout

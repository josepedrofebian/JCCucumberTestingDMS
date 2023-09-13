Feature: Internal Dokumen Page Test

  Scenario:ID001 User Go To Internal Page From Internal
    Given  User Enter Valid Url DMS
    And User Input Valid Username
    And User Input Valid Password
    And User Click Button Login
    When User Click Button Internal Dokumen
    Then User Direct To Dokumen Internal

  Scenario:ID002 User Go To Dokumen Internal Page From Internal
    When User Click Button Input Data
    Then User Direct To Internal Dokumen

  Scenario:ID003 User Input Data Internal Dokumen Share Ya
    When User Click Drop Down Template Internal
    And User Click Drop Down Group Dokumen
    And User Input Nomor Dokumen
    And User Input Nama Dokumen
    And User Input Deskripsi Dokumen
    And User Choose Start Date
    And User Choose End Date
    And User Input Owner Dokumen
    And User Choose Dokumen Date
    And User Click Lokasi Arsip
    And User Click Reminder Date
    And User Click Drop Down Jenis Media
    And User Upload File
    And User Click Drop Down Share Ya
    And User Click Checkbox Share Ya
    And User Click Button Simpan
    Then User Get Massage Data Berhasil Di Saved!

  Scenario:ID004 User Input Data Internal Dokumen Share Tidak
    When User Click Button Input Data
    And User Click Drop Down Template Internal
    And User Click Drop Down Group Dokumen
    And User Input Nomor Dokumen
    And User Input Nama Dokumen
    And User Input Deskripsi Dokumen
    And User Choose Start Date
    And User Choose End Date
    And User Input Owner Dokumen
    And User Choose Dokumen Date
    And User Click Lokasi Arsip
    And User Click Reminder Date
    And User Click Drop Down Jenis Media
    And User Upload File
    And User Click Drop Down Share Tidak
    And User Click Button Simpan
    Then User Get Massage Data Berhasil Di Saved!

  Scenario:ID005 User Input Data Kosong
    When User Click Button Input Data
    And User Click Button Simpan
    Then User Get Massage Required

#    Scenario: ID006 BELUM SIAP

  Scenario:ID007 User Tidak Klik List Group Dokumen
    When User Click Button Internal Dokumen
    And User Click Button Input Data
    And User Click Drop Down Template Internal
    And User Input Nomor Dokumen
    And User Input Nama Dokumen
    And User Input Deskripsi Dokumen
    And User Choose Start Date
    And User Choose End Date
    And User Input Owner Dokumen
    And User Choose Dokumen Date
    And User Click Lokasi Arsip
    And User Click Reminder Date
    And User Click Drop Down Jenis Media
    And User Upload File
    And User Click Drop Down Share Tidak
    And User Click Button Simpan
    Then User Get Massage Required

  Scenario:ID008 User Tidak Input Nama Dokumen
    When User Click Button Internal Dokumen
    And User Click Button Input Data
    And User Click Drop Down Template Internal
    And User Click Drop Down Group Dokumen
    And User Input Nomor Dokumen
    And User Input Deskripsi Dokumen
    And User Choose Start Date
    And User Choose End Date
    And User Input Owner Dokumen
    And User Choose Dokumen Date
    And User Click Lokasi Arsip
    And User Click Reminder Date
    And User Click Drop Down Jenis Media
    And User Upload File
    And User Click Drop Down Share Tidak
    And User Click Button Simpan
    Then User Get Massage Required

  Scenario:ID009 User Tidak Input Deskripsi Dokumen
    When User Click Button Internal Dokumen
    And User Click Button Input Data
    And User Click Drop Down Template Internal
    And User Click Drop Down Group Dokumen
    And User Input Nomor Dokumen
    And User Input Nama Dokumen
    And User Choose Start Date
    And User Choose End Date
    And User Input Owner Dokumen
    And User Choose Dokumen Date
    And User Click Lokasi Arsip
    And User Click Reminder Date
    And User Click Drop Down Jenis Media
    And User Upload File
    And User Click Drop Down Share Tidak
    And User Click Button Simpan
    Then User Get Massage Required

  Scenario:ID010 User Tidak Klik Tanggal Mulai
    When User Click Button Internal Dokumen
    And User Click Button Input Data
    And User Click Drop Down Template Internal
    And User Click Drop Down Group Dokumen
    And User Input Nomor Dokumen
    And User Input Nama Dokumen
    And User Input Deskripsi Dokumen
    And User Choose End Date
    And User Input Owner Dokumen
    And User Choose Dokumen Date
    And User Click Lokasi Arsip
    And User Click Reminder Date
    And User Click Drop Down Jenis Media
    And User Upload File
    And User Click Drop Down Share Tidak
    And User Click Button Simpan
    Then User Get Massage Required
#
  Scenario:ID011 User Tidak Klik Tanggal Berakhir
    When User Click Button Internal Dokumen
    And User Click Button Input Data
    And User Click Drop Down Template Internal
    And User Click Drop Down Group Dokumen
    And User Input Nomor Dokumen
    And User Input Nama Dokumen
    And User Input Deskripsi Dokumen
    And User Choose Start Date
    And User Input Owner Dokumen
    And User Choose Dokumen Date
    And User Click Lokasi Arsip
    And User Click Reminder Date
    And User Click Drop Down Jenis Media
    And User Upload File
    And User Click Drop Down Share Tidak
    And User Click Button Simpan
    Then User Get Massage Required

  Scenario:ID012 User Tidak Input Owner Dokumen
    When User Click Button Internal Dokumen
    And User Click Button Input Data
    And User Click Drop Down Template Internal
    And User Click Drop Down Group Dokumen
    And User Input Nomor Dokumen
    And User Input Nama Dokumen
    And User Input Deskripsi Dokumen
    And User Choose Start Date
    And User Choose End Date
    And User Choose Dokumen Date
    And User Click Lokasi Arsip
    And User Click Reminder Date
    And User Click Drop Down Jenis Media
    And User Upload File
    And User Click Drop Down Share Tidak
    And User Click Button Simpan
    Then User Get Massage Required

  Scenario:ID013 User Tidak Pilih Tanggal Dokumen
    When User Click Button Internal Dokumen
    And User Click Button Input Data
    And User Click Drop Down Template Internal
    And User Click Drop Down Group Dokumen
    And User Input Nomor Dokumen
    And User Input Nama Dokumen
    And User Input Deskripsi Dokumen
    And User Choose Start Date
    And User Choose End Date
    And User Input Owner Dokumen
    And User Click Lokasi Arsip
    And User Click Reminder Date
    And User Click Drop Down Jenis Media
    And User Upload File
    And User Click Drop Down Share Tidak
    And User Click Button Simpan
    Then User Get Massage Required

  Scenario:ID014 User Tidak Klik List Lokasi Arsip
    When User Click Button Internal Dokumen
    And User Click Button Input Data
    And User Click Drop Down Template Internal
    And User Click Drop Down Group Dokumen
    And User Input Nomor Dokumen
    And User Input Nama Dokumen
    And User Input Deskripsi Dokumen
    And User Choose Start Date
    And User Choose End Date
    And User Input Owner Dokumen
    And User Choose Dokumen Date
    And User Click Reminder Date
    And User Click Drop Down Jenis Media
    And User Upload File
    And User Click Drop Down Share Tidak
    And User Click Button Simpan
    Then User Get Massage Required

  Scenario:ID015 User Tidak Klik Tanggal Reminder
    When User Click Button Internal Dokumen
    And User Click Button Input Data
    And User Click Drop Down Template Internal
    And User Click Drop Down Group Dokumen
    And User Input Nomor Dokumen
    And User Input Nama Dokumen
    And User Input Deskripsi Dokumen
    And User Choose Start Date
    And User Choose End Date
    And User Input Owner Dokumen
    And User Choose Dokumen Date
    And User Click Lokasi Arsip
    And User Click Drop Down Jenis Media
    And User Upload File
    And User Click Drop Down Share Tidak
    And User Click Button Simpan
    Then User Get Massage Required

  Scenario:ID016 User Tidak Klik List Jenis Media
    When User Click Button Internal Dokumen
    And User Click Button Input Data
    And User Click Drop Down Template Internal
    And User Click Drop Down Group Dokumen
    And User Input Nomor Dokumen
    And User Input Nama Dokumen
    And User Input Deskripsi Dokumen
    And User Choose Start Date
    And User Choose End Date
    And User Input Owner Dokumen
    And User Choose Dokumen Date
    And User Click Lokasi Arsip
    And User Click Reminder Date
    And User Upload File
    And User Click Drop Down Share Tidak
    And User Click Button Simpan
    Then User Get Massage Required

  Scenario:ID018 User Melakukan View Data
    When User Click Button Internal Dokumen
    And User Click Icon Plus
    And User Click Button View Data
    Then User Get Text View Data

  Scenario:ID019 User Melakukan View File
    When User Click Button View File

  Scenario:ID020 User Tidak Merubah Data Pada Edit Data
    When User Click Button Internal Dokumen
    And User Click Icon Plus
    And User Click Button Edit
    And User Click Button Simpan
    Then User Get Massage Required

  Scenario:ID021 User Melakukan Edit Data Lokasi Arsip
    When User Click Button Internal Dokumen
    And User Click Icon Plus
    And User Click Button Edit
    And User Click Lokasi Arsip
    And User Click Button Simpan
    Then User Get Massage Required

  Scenario:ID022 User Melakukan Edit Data Jenis Media
    When User Click Button Internal Dokumen
    And User Click Icon Plus
    And User Click Button Edit
    And User Click Lokasi Arsip
    And User Click Drop Down Jenis Media
    And User Click Button Simpan
    Then User Get Massage Data Berhasil Di Update

  Scenario:ID023 User Mengedit Upload File
    When User Click Button Internal Dokumen
    And User Click Icon Plus
    And User Click Button Edit
    And User Click Lokasi Arsip
    And User Click Drop Down Jenis Media
    And User Click Icon Silang
    And User Click Button Hapus
    And User Click Button Ok
    And User Upload File
    And User Click Button Simpan
    Then User Get Massage Data Berhasil Di Update

  Scenario:ID024 User Klik Button Filter
    When User Click Button Internal Dokumen
    And User Input Nomor Dokumen Filter
    And User Click Button Filter

  Scenario:ID025 User Memfilter Memasukkan Nomor Dokumen Dengan Dokumen Tidak Ada
    When User Click Button Internal Dokumen
    And User Input Nomor Dokumen Filter
    And User Click Ketersediaan File Belum Ada
    And User Click Button Filter

  Scenario:ID026 User Memfilter Memasukkan Nomor Dokumen Dengan Dokumen Ada
    When User Click Button Internal Dokumen
    And User Input Nomor Dokumen Filter
    And User Click Ketersediaan File Ada
    And User Click Button Filter

  Scenario:ID027 User Showing Data Entries 25
    When User Click Button Internal Dokumen
    And User Click Shorting Data 25
    Then User Get Text Showing 25

  Scenario:ID028 User Showing Data Entries 50
    When User Click Button Internal Dokumen
    And User Click Shorting Data 50
    Then User Get Text Showing 50

  Scenario:ID029 User Showing Data Entries 100
    When User Click Button Internal Dokumen
    And User Click Shorting Data 100
    Then User Get Text Showing 100
    And User Click Button Logout
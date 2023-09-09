package com.juaracoding.utils;

public enum TestCases {

    T1("TL001 Login Page Displayed With URL Valid"),
    T2("TL002 Login Page No Displayed With URL Invalid"),
    T3("TL004 User Input Invalid Username And Password"),
    T4("TL005 User Login Without Input Username"),
    T5("TL006 User Login Without Input Password"),
    T6("TL008 User Input Username And Password Just Space"),
    T7("TL003 User Input Valid Username And Password"),
    T8("TH001 User Go To Internal Page From Internal Card More Info"),
    T9("TH002 User Go To Eksternal Page From Eksternal Card More Info"),
    T10("TH003 User Go To Perizinan From Perizinan Card More Info"),
    T11("TH007 User Go To Home Page From Side Bar Menu Home"),
    T12("TH008 User Go To Home Page From Icon Home"),
    T13("ID001 User Go To Internal Page From Internal"),
    T14("ID002 User Go To Dokumen Internal Page From Internal"),
    T15("ID003 User Input Data Internal Dokumen"),
    T16("ID004 User Input Data Internal Dokumen Share Tidak"),
    T17("ID005 User Input Data Kosong"),
    T18("ID007 User Tidak Klik List Group Dokumen"),
    T19("ID008 User Tidak Input Nama Dokumen"),
    T20("ID009 User Tidak Input Deskripsi Dokumen"),
    T21("ID010 User Tidak Klik Tanggal Mulai"),
    T22("ID011 User Tidak Klik Tanggal Berakhir"),
    T23("ID012 User Tidak Input Owner Dokumen"),
    T24("ID013 User Tidak Pilih Tanggal Dokumen"),
    T25("ID014 User Tidak Klik List Lokasi Arsip"),
    T26("ID015 User Tidak Klik Tanggal Reminder"),
    T27("ID016 User Tidak Klik List Jenis Media"),
    T28("ID018 User Melakukan View Data"),
    T29("ID019 User Melakukan View File"),
    T31("ID020 User Tidak Merubah Data Pada Edit Data"),
    T32("ID021 User Melakukan Edit Data Lokasi Arsip"),
    T33("ID022 User Melakukan Edit Data Jenis Media"),
    T34("ID023 User Mengedit Upload File"),
    T35("ID024 User Klik Button Filter"),
    T36("ID025 User Memfilter Memasukkan Nomor Dokumen Dengan Dokumen Tidak Ada"),
    T37("ID026 User Memfilter Memasukkan Nomor Dokumen Dengan Dokumen Ada"),
    T38("ID027 User Click Shorting Data 25"),
    T39("ID027 User Click Shorting Data 50"),
    T40("ID028 User Click Shorting Data 100"),
    T41("TL009 User Logout");



    private String testCaseName;

    TestCases(String value) {
        testCaseName = value;
    }

    public String getTestCaseName() {
        return testCaseName;
    }

}

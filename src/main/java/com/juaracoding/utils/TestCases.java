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
    T13("TLP001 User Go To Lokasi Penyimpanan page from Side Bar Menu"),
    T14("TLP002 User Search Some Document"),
    T15("TLP003 User Input Data Name Lokasi Penyimpanan"),
    T16("TLP004 User Input Data Name With Empty"),
    T17("TLP005 User Input Data Name With Same Name"),
    T18("TLP009 User Cancel Input Data With Click Button Close"),
    T19("TLP010 User Cancel Input Data With Click X"),
    T20("TLP011 User Edit Data"),
    T21("TLP016 User Cancel Edit Data With Click Button Cancel"),
    T22("TLP017 User Cancel Edit Data With Click Button X"),

    //Halaman Perizinan
    T201("TP001 User Mengunjungi Halaman Perizinan menggunakan Sidebar Menu"),
    T202("TP002 User mengunjungi halaman Input Data Perizinan"),
//    T203("TP003 User Berhasil Menambahkan Data Perizinan"), //< bagian ini
//    di komen aja klo gak mau kebanyakan data masuk,
//    jgn lupa juga dicoment .feature line 15-39, uncoment line 40
    T204("TP004 User Tidak Memasukkan Data Apapun"),
    T205("TP005 User Tidak input Nomor Perizinan"),
    T206("TP006 User Tidak Input Nama Perizinan"),
    T207("TP007 User Tidak Input Tanggal Mulai"),
    T208("TP008 User Tidak Input Tanggal Akhir"),
    T209("TP009 User Tidak Input Diterbitkan Oleh"),
    T210("TP010 User Tidak Input Deskripsi"),
    T211("TP011 User Tidak Input Pemilik Dokumen"),
    T212("TP012 User Tidak Input Dibuat Oleh"),
    T213("TP013 User Tidak Input Tim Terkait"),
    T214("TP014 User Tidak Input Tanggal Reminder"),
    T215("TP015 User Tidak Input Jenis Media"),
    T216("TP016 User Input Tanggal Berakhir Di Bawah Tanggal Mulai"),
    T217("TP017 User Input Tanggal Reminder Di Bawah Tanggal Mulai"),
    T218("TP018 User Menambahkan File PDF"),
    T219("TP019 User Menambahkan File DOCX"),
    T220("TP020 User Hanya Memasukkan Data Kosong dan Invalid"),
    // tbc...
    T249("TLP018 User Go To Home page from Icon Home"),
    T250("TL009 User Logout");


    private String testCaseName;

    TestCases(String value) {
        testCaseName = value;
    }

    public String getTestCaseName() {
        return testCaseName;
    }

}

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
    T14("TLP002 User Search Some Lokasi Penyimpanan"),
    T15("TLP003 User Input Data Name Lokasi Penyimpanan"),
    T16("TLP004 User Input Data Lokasi Penyimpanan Name With Empty"),
    T17("TLP005 User Input Data Lokasi Penyimpanan Name With Same Name"),
    T18("TLP009 User Cancel Input Data Lokasi Penyimpanan With Click Button Close"),
    T19("TLP010 User Cancel Input Data Lokasi Penyimpanan With Click X"),
    T20("TLP011 User Edit Data Lokasi Penyimpanan"),
    T21("TLP016 User Cancel Edit Data Lokasi Penyimpanan With Click Button Cancel"),
    T22("TLP017 User Cancel Edit Data Lokasi Penyimpanan With Click Button X"),
    T23("TLP018 User Go To Home page from Icon Home Lokasi Penyimpanan"),
    T24("TT001 User Go To Template Page"),
    T25("TT002 User Search Some Template"),
    T26("TT003 User Input Data Kategory Internal And Departement Business Development Template"),
    T27("TT004 User Input Data Kategory Internal And Departement HRD Template"),
    T28("TT005 User Input Data Kategory Internal And Departement Direksi Template"),
    T29("TT006 User Input Data Kategory Eksternal And Departement Business Development Template"),
    T30("TT007 User Input Data Kategory Eksternal And Departement HRD Template"),
    T31("TT008 User Input Data Kategory Eksternal And Departement Direksi Template"),
    T32("TT009 User Cancel Input Data Template With Button Close"),
    T33("TT010 User Cancel Input Data Template With Button X"),
    T34("TT011 User Edit Data Kategory Internal And Departement Business Development Template"),
    T35("TT012 User Edit Data Kategory Internal And Departement HRD Template"),
    T36("TT013 User Edit Data Kategory Internal And Departement Direksi Template"),
    T38("TT014 User Cancel Edit Data Template With Button Close"),
    T39("TT015 User Cancel Edit Data Template With Button X"),
    T40("TL009 User Logout");

    private String testCaseName;

    TestCases(String value) {
        testCaseName = value;
    }

    public String getTestCaseName() {
        return testCaseName;
    }

}

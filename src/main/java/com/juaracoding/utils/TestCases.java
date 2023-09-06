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
//    T18("TLP006 User Input Data Name With Space"),
//    T19("TLP007 User Input Data Name With Special Character"),
//    T20("TLP008 User Cancel Input Data With Click Button Cancel"),
//    T21("TLP009 User Cancel Input Data With Click X"),
//    T22("TLP010 User Edit Data"),
//    T23("TLP011 User Edit Data With Same Name"),
//    T24("TLP012 User Edit Data With Special Character"),
//    T25("TLP013 User Edit Data With Space"),
//    T26("TLP014 User Edit Data With Empty"),
//    T27("TLP015 User Cancel Edit Data With Click Button Cancel"),
//    T28("TLP016 User Cancel Edit Data With Click Button X"),
//    T29("TLP017 User Go To Home page from Ikon Home"),
    T18("TL009 User Logout");


    private String testCaseName;

    TestCases(String value) {
        testCaseName = value;
    }

    public String getTestCaseName() {
        return testCaseName;
    }

}

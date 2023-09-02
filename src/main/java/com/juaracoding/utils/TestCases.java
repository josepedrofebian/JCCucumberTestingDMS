package com.juaracoding.utils;

public enum TestCases {
    T1("Login Page Displayed With URL Valid"),
    T2("Login Page No Displayed With URL Invalid"),
    T3("User Input Invalid Username And Password"),
    T4("User Login Without Input Username"),
    T5("User Login Without Input Password"),
    T6("User Input Valid Username And Password"),
    T7("User Go To Internal Page"),
    T8("User Go To Eksternal Page"),
    T9("User Go To Eksternal Page"),
    T10("User Logout"),
    T11("User Go To Home Page From Side Bar Menu Home");

    private String testCaseName;

    TestCases(String value){
        testCaseName = value;
    }

    public String getTestCaseName() {
        return testCaseName;
    }

}

package com.juaracoding.utils;

public enum TestCases {
    T1("Login Page Displayed With URL Valid"),
    T2("Login Page No Displayed With URL Invalid"),
    T3("User Input Valid Username And Password");

    private String testCaseName;

    TestCases(String value){
        testCaseName = value;
    }

    public String getTestCaseName() {
        return testCaseName;
    }

}

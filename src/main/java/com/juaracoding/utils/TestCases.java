package com.juaracoding.utils;

public enum TestCases {
    T1("Login Page Displayed"),
    T2("Login Page No Displayed URL Invalid");

    private String testCaseName;

    TestCases(String value){
        testCaseName = value;
    }

    public String getTestCaseName() {
        return testCaseName;
    }

}

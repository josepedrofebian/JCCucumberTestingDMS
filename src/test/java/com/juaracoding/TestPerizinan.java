package com.juaracoding;

import com.juaracoding.pages.LoginAndLogoutPage;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;

public class TestPerizinan {
    static WebDriver driver;
    static ExtentTest extentTest;
    static LoginAndLogoutPage loginAndLogoutPage = new LoginAndLogoutPage();

    public TestPerizinan() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
}

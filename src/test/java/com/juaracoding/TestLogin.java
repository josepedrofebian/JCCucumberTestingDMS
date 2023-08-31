package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.juaracoding.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

// Kumpulan method untuk menjalankan aksi
public class TestLogin {
    static WebDriver driver;
    static ExtentTest extentTest;
    static LoginPage loginPage = new LoginPage();

    public TestLogin() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("User Enter Valid Url DMS")
    public void user_enter_valid_url_dms() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "User Enter Valid Url DMS");
    }

    @Then("User Get Text Title Login Page")
    public void user_get_text_title_login_page() {
        Assert.assertEquals(loginPage.getTextLoginPage(),"DIKA | DOKUMEN");
        extentTest.log(LogStatus.PASS, "User Get Text Title Login Page");
    }

    @Given("User Enter Invalid Url DMS")
    public void user_enter_invalid_url_dms() {
        driver.get(Constants.URLINVALID);
        extentTest.log(LogStatus.PASS, "User Enter Invalid Url DMS");
    }

    @Then("User Get Text 404 Not Found")
    public void user_get_text_404_not_found() {
        Assert.assertEquals(loginPage.getErrorText404NotFound(),"404 Page Not Found");
        extentTest.log(LogStatus.PASS, "User Get Text 404 Not Found");
    }
    
}

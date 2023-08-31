package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
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
        DriverSingleton.delay(3);
    }

    @Then("User Get Text 404 Not Found")
    public void user_get_text_404_not_found() {
        Assert.assertEquals(loginPage.getErrorText404NotFound(),"404 Page Not Found");
        extentTest.log(LogStatus.PASS, "User Get Text 404 Not Found");
    }

    @When("User Input Valid Username")
    public void user_input_valid_username(){

        loginPage.inputUsername(Constants.USERNAME);

        loginPage.inputUsername("sqamagang2g");

        extentTest.log(LogStatus.PASS, "User Input Valid Username");
    }

    @And("User Input Valid Password")
    public void user_input_valid_password(){
        loginPage.inputPassword(Constants.PASSWORD);
        extentTest.log(LogStatus.PASS, "User Input Valid Password");
    }
    @And("User Click Button Login")
    public void user_click_button_login(){
        loginPage.clickButtonLogin();
        extentTest.log(LogStatus.PASS, "User Click Button Login");
    }
    @Then("User Get Text Logo DMS In Dashboard")
    public void user_get_text_logo_dms_in_dashboard(){
        Assert.assertEquals(loginPage.getTextLogoDMSDashboard(),"DMS");
        extentTest.log(LogStatus.PASS, "User Get Text Logo DMS In Dashboard");
    }
    @When("User Click Button Logout")
    public void user_click_button_logout(){
        loginPage.clickButtonLogout();
        extentTest.log(LogStatus.PASS, "User Click Button Logout");
    }
    
}

package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.LoginAndLogoutPage;
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
    static LoginAndLogoutPage loginAndLogoutPage = new LoginAndLogoutPage();

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
        DriverSingleton.delay(5);
        Assert.assertEquals(loginAndLogoutPage.getTextLoginPage(), "DIKA | DOKUMEN");
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
        Assert.assertEquals(loginAndLogoutPage.getErrorText404NotFound(), "404 Page Not Found");
        extentTest.log(LogStatus.PASS, "User Get Text 404 Not Found");
    }

    @When("User Input Valid Username")
    public void user_input_valid_username() {
        loginAndLogoutPage.inputUsername(Constants.USERNAME);
        extentTest.log(LogStatus.PASS, "User Input Valid Username");
    }

    @And("User Input Valid Password")
    public void user_input_valid_password() {
        loginAndLogoutPage.inputPassword(Constants.PASSWORD);
        extentTest.log(LogStatus.PASS, "User Input Valid Password");
    }

    @And("User Click Button Login")
    public void user_click_button_login() {
        loginAndLogoutPage.clickButtonLogin();
        extentTest.log(LogStatus.PASS, "User Click Button Login");
    }

    @Then("User Get Text Logo DMS In Home page")
    public void user_get_text_logo_dms_in_dashboard() {
        Assert.assertEquals(loginAndLogoutPage.getTextLogoDMSDashboard(), "DMS");
        extentTest.log(LogStatus.PASS, "User Get Text Logo DMS In Home page");
    }

    @When("User Input Invalid Username")
    public void user_input_invalid_username() {
        loginAndLogoutPage.inputUsername("test1");
        extentTest.log(LogStatus.PASS, "User Input Invalid Username");
    }

    @And("User Input Invalid Password")
    public void user_input_invalid_password() {
        loginAndLogoutPage.inputPassword("test1");
        extentTest.log(LogStatus.PASS, "User Input Invalid Password");
    }

    @Then("User Get Text Error Message Wrong Username Or Password")
    public void user_get_text_error_message_wrong_username_or_password() {
        Assert.assertEquals(loginAndLogoutPage.getTextErrorMessage(), "×\n" + "Wrong username or password!");
        extentTest.log(LogStatus.PASS, "User Get Text Error Message Wrong Username Or Password");
    }

    @When("User Input Username empty")
    public void user_input_username_empty() {
        loginAndLogoutPage.inputUsername("");
        extentTest.log(LogStatus.PASS, "User Input Username empty");
    }

    @When("User Input Password empty")
    public void user_input_password_empty() {
        loginAndLogoutPage.inputPassword("");
        extentTest.log(LogStatus.PASS, "User Input Password empty");
    }

    @Then("User Get Warning From Field Username Required")
    public void user_get_warning_from_field_username_required(){
        loginAndLogoutPage.getUsernameFieldRequired();
        Assert.assertEquals(loginAndLogoutPage.getUsernameFieldRequired(),"true");
        extentTest.log(LogStatus.PASS, "User Get Warning From Field Username Required");
    }

    @Then("User Get Warning From Field Password Required")
    public void user_get_warning_from_field_password_required(){
        loginAndLogoutPage.getPasswordFieldRequired();
        Assert.assertEquals(loginAndLogoutPage.getPasswordFieldRequired(),"true");
        extentTest.log(LogStatus.PASS, "User Get Warning From Field Password Required");
    }

    @When("User Input Username Just Space")
    public void user_input_username_just_space() {
        loginAndLogoutPage.inputUsername("    ");
        extentTest.log(LogStatus.PASS, "User Input Username Just Space");
    }

    @And("User Input Password Just Space")
    public void user_input_password_just_space() {
        loginAndLogoutPage.inputPassword("    ");
        extentTest.log(LogStatus.PASS, "User Input Password Just Space");
    }
}

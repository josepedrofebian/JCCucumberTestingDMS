package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.HomePage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.*;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestHome {
    static WebDriver driver;
    static ExtentTest extentTest;
    static HomePage homePage = new HomePage();

    public TestHome() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User Click Button More Info Internal")
    public void user_click_button_more_info_internal() {
        homePage.clickMoreInfoToInternalPage();
        extentTest.log(LogStatus.PASS, "User Click Button More Info Internal");
    }

    @When("User Click Button More Info Eksternal")
    public void user_click_button_more_info_eksternal() {
        homePage.clickMoreInfoToEksternalPage();
        extentTest.log(LogStatus.PASS, "User Click Button More Info Eksternal");
    }

    @When("User Click Button More Info Perizinan")
    public void user_click_button_more_info_perizinan() {
        homePage.clickMoreInfoToPerizinanPage();
        extentTest.log(LogStatus.PASS, "User Click Button More Info Perizinan");
    }

    @Then("User Direct To Internal Dokumen Page")
    public void user_direct_to_internal_dokumen_page() {
        Assert.assertEquals(homePage.getTextDokumenInternal(), "Dokumen Internal");
        extentTest.log(LogStatus.PASS, "User Direct To Internal Dokumen Page");
        homePage.clickSideBarMenuHome();
    }

    @Then("User Direct To Eksternal Dokumen Page")
    public void user_direct_to_eksternal_dokumen_page() {
        Assert.assertEquals(homePage.getTextDokumenEksternal(), "Dokumen Eksternal");
        extentTest.log(LogStatus.PASS, "User Direct To Eksternal Dokumen Page");
        homePage.clickSideBarMenuHome();
    }

    @Then("User Direct To Perizinan Page")
    public void user_direct_to_perizinan_page() {
        Assert.assertEquals(homePage.getTextPerizinan(), "Perizinan");
        extentTest.log(LogStatus.PASS, "User Direct To Perizinan Page");
        homePage.clickSideBarMenuHome();
    }

    @When("User Click Side Bar Menu Home")
    public void user_click_side_bar_menu_home() {
        homePage.clickSideBarMenuHome();
        extentTest.log(LogStatus.PASS, "User Click Side Bar Menu Home");
    }

    @Then("User Direct To Home Page")
    public void user_direct_to_home_page() {
        Assert.assertEquals(homePage.getTextHome(), "Home");
        extentTest.log(LogStatus.PASS, "User Direct To Home Page");
    }

}

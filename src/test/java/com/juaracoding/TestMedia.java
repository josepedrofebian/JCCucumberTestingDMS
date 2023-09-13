package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.MasterLokasiPenyimpananPage;
import com.juaracoding.pages.MasterMediaPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestMedia {
    static WebDriver driver;
    static ExtentTest extentTest;
    static MasterMediaPage masterMediaPage = new MasterMediaPage();

    public TestMedia() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    //MM01
    @When("User Click Data Master Media")
    public void user_click_data_master_media() {
        masterMediaPage.clickDataMaster();
        extentTest.log(LogStatus.PASS, "User Click Data Master");
    }

    @And("User Click Media Menu")
    public void user_click_media_menu_media() {
        masterMediaPage.clickSidebarMaster();
        extentTest.log(LogStatus.PASS, "User Click Media Menu");
    }

    @Then("User Get Text Data Media Arsip Menu")
    public void user_get_text_data_media_arsip_menu() {
        Assert.assertEquals(masterMediaPage.getTxtDataMediaArsip(), "Data Media Arsip");
        extentTest.log(LogStatus.PASS, "User Get Text Data Media Arsip");
    }

    //MM02
    @When("User Click Button Input Data Media")
    public void user_click_button_input_data_media() {
        masterMediaPage.clickButtonInputData();
        extentTest.log(LogStatus.PASS, "User Click Button Input Data");
    }

    @And("User Input Nama Media")
    public void user_input_nama_media() {
        masterMediaPage.userInputNama(DriverSingleton.randomString());
        extentTest.log(LogStatus.PASS, "User Input Nama");
    }
    @And("User Click Button Simpan Media")
    public void user_click_button_simpan_media() {
        masterMediaPage.clickButtonSimpan();
        extentTest.log(LogStatus.PASS, "User Click Button Simpan Media");
        DriverSingleton.delay(5);
    }
    @And("User Click Button Alert Ok Media")
    public void user_click_button_alert_ok_media() {
        driver.switchTo().alert().accept();
        extentTest.log(LogStatus.PASS, "User Click Button Alert Ok");
    }



}

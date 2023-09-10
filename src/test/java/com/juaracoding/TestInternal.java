package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.HomePage;
import com.juaracoding.pages.InternalDokumenPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.*;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


import static org.testng.AssertJUnit.assertEquals;

public class TestInternal {
    static WebDriver driver;
    static ExtentTest extentTest;
    static InternalDokumenPage internalDokumenPage = new InternalDokumenPage();

    public TestInternal() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    @When("User Click Button Internal Dokumen")
    public void user_click_button_internal_dokumen() {
        internalDokumenPage.clickBtnInternalDokumen();
        extentTest.log(LogStatus.PASS, "User Click Button Internal Dokumen");
    }
    @Then("User Direct To Dokumen Internal")
    public void user_direct_to_dokumen_internal() {
        Assert.assertEquals(internalDokumenPage.getTxtDokumenInternal(), "Dokumen Internal");
        extentTest.log(LogStatus.PASS, "User Direct To Dokumen Internal");
    }
    @When("User Click Button Input Data")
    public void user_click_button_input_data() {
        internalDokumenPage.clickBtnInputData();
        extentTest.log(LogStatus.PASS, "User Click Button Input Data");
    }
    @Then("User Direct To Internal Dokumen")
    public void user_direct_to_internal_dokument() {
        Assert.assertEquals(internalDokumenPage.getTxtInternalDokumen(), "Internal Dokumen");
        extentTest.log(LogStatus.PASS, "User Direct To Internal Dokumen");
    }
    @When("User Click Drop Down Template Internal")
    public void user_click_dropdown_template_internal() {
        internalDokumenPage.clickDropDownTemplateInternal();
        extentTest.log(LogStatus.PASS, "User Click Drop Down Template Internal");
    }
    @And("User Click Drop Down Group Dokumen")
    public void user_click_button_login() {
        internalDokumenPage.clickDropDownGroupDokumen();
        extentTest.log(LogStatus.PASS, "User Click Drop Down Group Dokumen");
    }
    @And("User Input Nomor Dokumen")
    public void user_input_nomor_dokumen() {
        internalDokumenPage.inputNomorDokumen();
        extentTest.log(LogStatus.PASS, "User Input Nomor Dokumen");
    }
    @And("User Input Nomor Dokumen Filter")
    public void user_input_nomor_dokumen_filter() {
        internalDokumenPage.inputNomorDokumenFilter();

        extentTest.log(LogStatus.PASS, "User Input Nomor Dokumen Filter");
    }
    @And("User Input Nama Dokumen")
    public void user_input_nama_dokumen() {
        internalDokumenPage.inputNamaDokumen();
        extentTest.log(LogStatus.PASS, "User Input Nama Dokumen");
    }

    @And("User Input Deskripsi Dokumen")
    public void user_input_deskripsi_dokumen() {
        internalDokumenPage.inputDeskripsiDokumen();
        extentTest.log(LogStatus.PASS, "User Input Deskripsi Dokumen");
    }
    @And("User Choose Start Date")
    public void user_choose_start_date() {
        internalDokumenPage.clickStartDate();
        extentTest.log(LogStatus.PASS, "User Choose Start Date");
    }
    @And("User Choose End Date")
    public void user_choose_end_date() {
        internalDokumenPage.clickEndDate();
        extentTest.log(LogStatus.PASS, "User Choose End Date");
    }
    @And("User Input Owner Dokumen")
    public void user_input_owner_dokumen() {
        internalDokumenPage.inputOwnerDokumen();
        extentTest.log(LogStatus.PASS, "User Input Owner Dokumen");
    }
    @And("User Choose Dokumen Date")
    public void user_choose_dokumen_data() {
        internalDokumenPage.clickDokumenDate();
        extentTest.log(LogStatus.PASS, "User Choose Dokumen Date");
    }
    @And("User Click Lokasi Arsip")
    public void user_click_dokumen_arsip() {
        internalDokumenPage.clickLokasiArsip();
        extentTest.log(LogStatus.PASS, "User Click Lokasi Arsip");
    }
    @And("User Click Reminder Date")
    public void user_click_reminder_date() {
        internalDokumenPage.clickReminderDate();
        extentTest.log(LogStatus.PASS, "User Click Reminder Date");
    }
    @And("User Click Drop Down Jenis Media")
    public void user_click_dropdown_jenis_media() {
        internalDokumenPage.clickDropDownJenisMedia();
        extentTest.log(LogStatus.PASS, "User Click Drop Down Jenis Media");
    }
    @And("User Upload File")
    public void user_upload_file() {
        internalDokumenPage.uploadFile();
        extentTest.log(LogStatus.PASS, "User Upload File");
    }
    @And("User Click Drop Down Share Ya")
    public void user_click_dropdown_share_Ya() {
        internalDokumenPage.dropDownShareYa();
        internalDokumenPage.delay(5);
        extentTest.log(LogStatus.PASS, "User Click Drop Down Share Ya");
    }

    @And("User Click Checkbox Share Ya")
    public void user_click_cehckbox_share_ya() {
        internalDokumenPage.checkBoxShareYa();
        extentTest.log(LogStatus.PASS, "User Click Checkbox Share Ya");
    }
    @And("User Click Button Simpan")
    public void user_click_button_simpan() {
        internalDokumenPage.btnSimpan();
        extentTest.log(LogStatus.PASS, "User Click Button Simpan");
    }
    @Then("User Get Massage Data Berhasil Di Saved!")
    public void user_get_massage_data_berhasil_di_saved() {
        Assert.assertEquals(internalDokumenPage.getTxtDataBerhasilDiSaved(),"Data berhasil di saved!");
        extentTest.log(LogStatus.PASS, "User Get Massage Data Berhasil Di Saved!");
    }

    //////////////////////////////////////// Share tidak //////////////////////////////
    @And("User Click Drop Down Share Tidak")
    public void user_click_dropdown_share_Tidak() {
        internalDokumenPage.dropDownShareTidak();
        internalDokumenPage.delay(5);
        extentTest.log(LogStatus.PASS, "User Click Drop Down Share Tidak");
    }
    @And("User Click Ketersediaan File Belum Ada")
    public void user_click_ketersediaan_file_belum_ada() {
        internalDokumenPage.clickKetersediaanFileBelumAda();
        internalDokumenPage.delay(5);
        extentTest.log(LogStatus.PASS, "User Click Ketersediaan File Belum Ada");
    }
    @And("User Click Ketersediaan File Ada")
    public void user_click_ketersediaan_file_ada() {
        internalDokumenPage.clickKetersediaanFileAda();
        internalDokumenPage.delay(5);
        extentTest.log(LogStatus.PASS, "User Click Ketersediaan File Ada");
    }
    @And("User Click Shorting Data 25")
    public void user_click_shorting_data_25() {
        internalDokumenPage.clickBtnShorting25();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2100)");
        extentTest.log(LogStatus.PASS, "User Click Shorting Data 25");
    }
    @And("User Click Shorting Data 50")
    public void user_click_shorting_data_50() {
        internalDokumenPage.clickBtnShorting50();
        extentTest.log(LogStatus.PASS, "User Click Shorting Data 50");
    }
    @And("User Click Shorting Data 100")
    public void user_click_shorting_data_100() {
        internalDokumenPage.clickBtnShorting100();
        extentTest.log(LogStatus.PASS, "User Click Shorting Data 100");
    }

    @And("User Click Icon Plus")
    public void user_click_view_data() {
        internalDokumenPage.iconPlus();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
        internalDokumenPage.delay(5);
        extentTest.log(LogStatus.PASS, "User Click Icon Plus");
    }
    @And("User Click Button View Data")
    public void user_click_button_view_data() {
        internalDokumenPage.btnView();
        internalDokumenPage.delay(5);
        extentTest.log(LogStatus.PASS, "User Click Button View Data");
    }

    @When("User Click Button View File")
    public void user_click_button_view_file() {
        internalDokumenPage.btnViewFile();
        internalDokumenPage.delay(5);
        extentTest.log(LogStatus.PASS, "User Click Button View File");
    }
    @And("User Click Button Edit")
    public void user_click_button_edit() {
        internalDokumenPage.btnEdit();
        internalDokumenPage.delay(5);
        extentTest.log(LogStatus.PASS,  "User Click Button Edit");
    }
    @And("User Click Icon Silang")
    public void user_click_icon_silang() {
        internalDokumenPage.iconSilang();
        DriverSingleton.delay(10);
//        driver.switchTo().alert().dismiss();// hapus
//        driver.switchTo().alert().accept();// ok
        extentTest.log(LogStatus.PASS,  "User Click Icon Silang");
    }

    @And("User Click Button Hapus")
    public void user_click_button_hapus() {
        internalDokumenPage.btnHapus();
        DriverSingleton.delay(5);
//        driver.switchTo().alert().dismiss();// hapus
//        driver.switchTo().alert().accept();// ok
        extentTest.log(LogStatus.PASS,  "User Click Button Hapus");
    }
    @And("User Click Button Ok")
    public void user_click_icon_ok() {
        driver.switchTo().alert().accept();//ok
        extentTest.log(LogStatus.PASS,  "User Click Button Ok");
    }
    @And("User Click Button Filter")
    public void user_click_button_filter() {
        internalDokumenPage.clickBtnFilter();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
        extentTest.log(LogStatus.PASS,  "User Click Button Filter");
    }
    @Then("User Get Massage Required")
    public void user_get_massage_required() {
        internalDokumenPage.alertInternal();
        extentTest.log(LogStatus.PASS, "User Click Drop Down Share");
        internalDokumenPage.delay(5);
        Assert.assertEquals(internalDokumenPage.alertInternal(),"true");
        extentTest.log(LogStatus.PASS, "Then User Get Massage Required");
    }
    @Then("User Get Text View Data")
    public void user_get_text_view_data() {
        Assert.assertEquals(internalDokumenPage.getTextViewData(),"View Data");
        extentTest.log(LogStatus.PASS, "User Get Text View Data");
    }
    @Then("User Get Text Showing 25")
    public void user_get_text_showing_25() {
        Assert.assertEquals(internalDokumenPage.getTextShowing25(),"25");
        extentTest.log(LogStatus.PASS, "User Get Text Showing 25");
    }

    @Then("User Get Text Showing 50")
    public void user_get_text_showing_50() {
        Assert.assertEquals(internalDokumenPage.getTextShowing50(),"50");
        extentTest.log(LogStatus.PASS, "User Get Text Showing 50");
    }

    @Then("User Get Text Showing 100")
    public void user_get_text_showing_100() {
        Assert.assertEquals(internalDokumenPage.getTextShowing100(),"100");
        extentTest.log(LogStatus.PASS, "User Get Text Showing 100");
    }


    @Then("User Get Massage Data Berhasil Di Update")
    public void user_get_massage_data_berhasil_di_update() {
        Assert.assertEquals(internalDokumenPage.getTxtDataBerhasilDiUpdate(),"Data berhasil di update!");
        extentTest.log(LogStatus.PASS, "User Get Massage Data Berhasil Di Update");
    }

}


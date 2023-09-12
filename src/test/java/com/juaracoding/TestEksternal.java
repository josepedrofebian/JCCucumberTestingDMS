package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.EksternalDokumenPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestEksternal {
    static WebDriver driver;
    static ExtentTest extentTest;
    static EksternalDokumenPage eksternalDokumenPage = new EksternalDokumenPage();

    public TestEksternal() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User Click Button Eksternal Dokumen")
    public void user_click_button_eksternal_dokumen(){
        eksternalDokumenPage.clickSideBarEksternalDokumen();
        extentTest.log(LogStatus.PASS, "User Click Button Eksternal Dokumen");
    }
    @Then("User Direct To Dokumen Eksternal")
    public void user_direct_to_dokumen_eksternal(){
        DriverSingleton.delay(5);
        Assert.assertEquals(eksternalDokumenPage.getTextTitleEksternalDokumen(),"Dokumen Eksternal");
        extentTest.log(LogStatus.PASS, "User Direct To Dokumen Eksternal");
    }

    @When("User Input Nomor Dokumen Field")
    public void user_input_nomor_dokumen_field() {
        eksternalDokumenPage.inputFieldNomorDokumenSearch("045/PKS/DIKA-BCA DIGITAL/IX/2022");
        extentTest.log(LogStatus.PASS, "User Input Nomor Dokumen Field");
    }

    @And("User Input Nama Dokumen Field")
    public void user_input_nama_dokumen_field() {
        eksternalDokumenPage.inputFieldNamaDokumenSearch("a");
        extentTest.log(LogStatus.PASS, "User Input Nama Dokumen Field");
    }

    @And("User Click Button Filter Eksternal")
    public void user_click_button_filter_eksternal() {
        eksternalDokumenPage.clickButtonFilter();
        extentTest.log(LogStatus.PASS, "User Click Button Filter Eksternal");
    }

    @Then("User Get Data Result Of Search")
    public void user_get_data_result_of_search() {
        DriverSingleton.delay(10);
        Assert.assertEquals(eksternalDokumenPage.getTextResultOfSearchEksternal(),"045/PKS/DIKA-BCA DIGITAL/IX/2022");
        extentTest.log(LogStatus.PASS, "User Get Data Result Of Search");
        DriverSingleton.delay(5);
        eksternalDokumenPage.clearFieldSearchEksternal();
        eksternalDokumenPage.clickButtonFilter();
    }

    @When("User click Button Input Data Eksternal")
    public void user_click_button_input_data_eksternal() {
        eksternalDokumenPage.clickButtonInputEksternal();
        extentTest.log(LogStatus.PASS, "User click Button Input Data Eksternal");
    }

    @Then("User Get Text Title Input Data Eksternal")
    public void user_get_text_title_input_data_eksternal() {
        DriverSingleton.delay(5);
        Assert.assertEquals(eksternalDokumenPage.getTextTitleInputDataEksternal(),"Eksternal Dokumen");
        extentTest.log(LogStatus.PASS, "User Get Text Title Input Data Eksternal");
        driver.navigate().back();
    }


    @And("User Choose Template Eksternal")
    public void user_choose_template_eksternal() {
        DriverSingleton.delay(5);
        eksternalDokumenPage.chooseDropdownTemplateEksternal();
        extentTest.log(LogStatus.PASS, "User Choose Template Eksternal");
    }

    @And("User Fill Nama Dokumen")
    public void userFillNamaDokumen() {
        eksternalDokumenPage.inputNamaDokumen(DriverSingleton.randomString());
        extentTest.log(LogStatus.PASS, "User Fill Nama Dokumen");
    }

    @And("User Fill Nama Klien")
    public void userFillNamaKlien() {
        eksternalDokumenPage.inputNamaKlien(DriverSingleton.randomString());
        extentTest.log(LogStatus.PASS, "User Fill Nama Klien");
    }

    @And("User Fill Tanggal Mulai")
    public void userFillTanggalMulai() {
        eksternalDokumenPage.inputTanggalMulai();
        extentTest.log(LogStatus.PASS, "User Fill Tanggal Mulai");
    }

    @And("User Fill Tanggal Berakhir")
    public void userFillTanggalBerakhir() {
        eksternalDokumenPage.inputTanggalBerakhir();
        extentTest.log(LogStatus.PASS, "User Fill Tanggal Berakhir");
    }

    @And("User Fill Diterbitkan Oleh")
    public void userFillDiterbitkanOleh() {
        eksternalDokumenPage.inputDiterbitkanOleh(DriverSingleton.randomString());
        extentTest.log(LogStatus.PASS, "User Fill Diterbitkan Oleh");
    }

    @And("User Fill Deskripsi")
    public void userFillDeskripsi() {
        eksternalDokumenPage.inputDeksripsi(DriverSingleton.randomString());
        extentTest.log(LogStatus.PASS, "User Fill Deskripsi");
    }

    @And("User Fill Pemilik Dokumen")
    public void userFillPemilikDokumen() {
        eksternalDokumenPage.inputPemilikDokumen(DriverSingleton.randomString());
        extentTest.log(LogStatus.PASS, "User Fill Pemilik Dokumen");
    }

    @And("User Fill Dibuat Oleh")
    public void userFillDibuatOleh() {
        eksternalDokumenPage.inputDibuatOleh(DriverSingleton.randomString());
        extentTest.log(LogStatus.PASS, "User Fill Dibuat Oleh");
    }

    @And("User Fill Tim Terkait")
    public void userFillTimTerkait() {
        eksternalDokumenPage.inputTimTerkait(DriverSingleton.randomString());
        extentTest.log(LogStatus.PASS, "User Fill Tim Terkait");
    }

    @And("User Fill Tanggal Reminder")
    public void userFillTanggalReminder() {
        eksternalDokumenPage.inputTanggalReminder();
        extentTest.log(LogStatus.PASS, "User Fill Diterbitkan Oleh");
    }

    @And("User Choose Jenis Media")
    public void userChooseJenisMedia() {
        eksternalDokumenPage.chooseDropdownMediaEksternal();
        extentTest.log(LogStatus.PASS, "User Choose Jenis Media");
    }

    @And("User Click Button Simpan Eksternal")
    public void userClickButtonSimpanEksternal() {
        eksternalDokumenPage.clickButtonSimpanInputEksternal();
        extentTest.log(LogStatus.PASS, "User Click Button Simpan Eksternal");
    }

    @Then("User Get Message Data Berhasil Di Saved! Eksternal")
    public void user_get_message_data_berhasil_di_saved_eksternal() {
        DriverSingleton.delay(5);
        Assert.assertEquals(eksternalDokumenPage.getTxtDataBerhasilDiSaved(),"Data berhasil di saved!");
        extentTest.log(LogStatus.PASS, "User Get Massage Data Berhasil Di Saved!");
    }
}

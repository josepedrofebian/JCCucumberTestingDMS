package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.MasterLokasiPenyimpananPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestMasterLokasiPenyimpanan {
    static WebDriver driver;
    static ExtentTest extentTest;
    static MasterLokasiPenyimpananPage masterLokasiPenyimpananPage = new MasterLokasiPenyimpananPage();

    public TestMasterLokasiPenyimpanan() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    @When("User click Side Bar Menu Data Master")
    public void user_click_side_bar_menu_data_master(){
        masterLokasiPenyimpananPage.clickSideBarMasterData();
        extentTest.log(LogStatus.PASS, "User click Side Bar Menu Data Master");
    }
    @And("User click menu lokasi penyimpanan")
    public void user_click_menu_lokasi_penyimpanan(){
        masterLokasiPenyimpananPage.clickSideBarLokasiPenyimpanan();
        extentTest.log(LogStatus.PASS, "User click menu lokasi penyimpanan");
    }
    @Then("User Direct To Lokasi Penyimpanan Page")
    public void user_direct_to_lokasi_penyimpanan_page(){
        Assert.assertEquals(masterLokasiPenyimpananPage.getTextDataLokasiArsip(),"Data Lokasi Arsip");
        extentTest.log(LogStatus.PASS, "User Direct To Lokasi Penyimpanan Page");
    }

    @When("User Input In Field Search")
    public void user_input_in_field_search(){
        masterLokasiPenyimpananPage.inputFieldSearch("test");
        extentTest.log(LogStatus.PASS, "User Input In Field Search");
    }
    @And("User Click Button Search")
    public void user_click_button_search(){
        masterLokasiPenyimpananPage.clickButtonSearch();
        extentTest.log(LogStatus.PASS, "User Click Button Search");
    }

    @Then("User Get Data Result Of Search")
    public void user_get_data_result_of_search(){
        Assert.assertEquals(masterLokasiPenyimpananPage.getTextResultSearch(),"test");
        extentTest.log(LogStatus.PASS,"User Get Data Result Of Search");
    }

    @When("User Click Button Input Data")
    public void user_click_button_input_data(){
        masterLokasiPenyimpananPage.clickInputData();
        extentTest.log(LogStatus.PASS,"User Click Button Input Data");
    }
    @And("User Input Data Nama Lokasi Penyimpanan")
    public void user_input_data_nama_lokasi_penyimpanan(){
        masterLokasiPenyimpananPage.inputDataNamaLokasi(DriverSingleton.randomString());
        extentTest.log(LogStatus.PASS,"User Input Data Nama Lokasi Penyimpanan");
    }
    @And("User Click Button Simpan")
    public void user_click_button_simpan(){
        masterLokasiPenyimpananPage.clickButtonSimpanInput();
        extentTest.log(LogStatus.PASS,"User Click Button Simpan");
    }
    @Then("User Get Text Success Data Berhasil Disimpan")
    public void user_get_text_success_data_berhasil_disimpan(){
        DriverSingleton.delay(10);
        Assert.assertEquals(masterLokasiPenyimpananPage.getAlertText(),"Data berhasil disimpan");
        extentTest.log(LogStatus.PASS,"User Get Text Success Data Berhasil Disimpan");
        DriverSingleton.delay(10);
        driver.switchTo().alert().accept();
    }
    @And("User Input Data Nama Lokasi Penyimpanan With Empty")
    public void user_input_data_nama_lokasi_penyimpanan_with_empty(){
        masterLokasiPenyimpananPage.inputDataNamaLokasi("");
        extentTest.log(LogStatus.PASS,"User Input Data Nama Lokasi Penyimpanan With Empty");
    }
    @And("User Input Data Nama Lokasi Penyimpanan With Same Name")
    public void user_input_data_nama_lokasi_penyimpanan_with_same_name(){
        masterLokasiPenyimpananPage.inputDataNamaLokasi("test890");
        extentTest.log(LogStatus.PASS,"User Input Data Nama Lokasi Penyimpanan With Same Name");
    }
    @And("User Input Data Nama Lokasi Penyimpanan With Space")
    public void user_input_data_nama_lokasi_penyimpanan_with_space(){
        masterLokasiPenyimpananPage.inputDataNamaLokasi("   ");
        extentTest.log(LogStatus.PASS,"User Input Data Nama Lokasi Penyimpanan With Space");
    }
    @And("User Input Data Nama Lokasi Penyimpanan With Special Character")
    public void user_input_data_nama_lokasi_penyimpanan_with_spesial_character(){
        masterLokasiPenyimpananPage.inputDataNamaLokasi("&&&^^%");
        extentTest.log(LogStatus.PASS,"User Input Data Nama Lokasi Penyimpanan With Special Character");
        driver.switchTo().alert().accept();
    }
    @Then("Show Message Error Nama Harus Diisi")
    public void show_message_error_nama_harus_diisi(){
        try{
            Assert.assertEquals(masterLokasiPenyimpananPage.getTextErrorMessage(),"Nama\n" + "Nama harus diisi");
            extentTest.log(LogStatus.PASS,"Show Message Error Nama Harus Diisi");
        }catch (Exception ignored){
        }
        masterLokasiPenyimpananPage.clickButtonCloseInput();
    }
    @Then("Show Message Error Nama Lokasi Sudah Ada")
    public void show_message_error_nama_lokasi_sudah_ada(){
        try{
            Assert.assertEquals(masterLokasiPenyimpananPage.getTextErrorMessage(),"Nama\n" + "Nama Lokasi sudah ada");
            extentTest.log(LogStatus.PASS,"Show Message Error Nama Lokasi Sudah Ada");
        }catch (Exception ignored){
        }
        masterLokasiPenyimpananPage.clickButtonCloseInput();
    }
    @Then("Show Message Error Nama Tidak Boleh Mengandung Spesial Karakter")
    public void show_message_error_nama_tidak_boleh_mengandung_spesial_karakter(){
        Assert.assertEquals(masterLokasiPenyimpananPage.getTextErrorMessage(),"Nama Tidak Boleh Mengandung Spesisal Karakter");
        extentTest.log(LogStatus.PASS,"Show Message Error Nama Tidak Boleh Mengandung Spesial Karakter");
        masterLokasiPenyimpananPage.clickButtonCloseInput();
    }

    @Then("User Get Text Success Data Berhasil Diubah")
    public void user_get_text_success_data_berhasil_diubah(){
        Assert.assertEquals(masterLokasiPenyimpananPage.getAlertText(),"Data berhasil diubah");
        extentTest.log(LogStatus.PASS,"User Get Text Success Data Berhasil Diubah");
        driver.switchTo().alert().accept();
    }
    @Then("Show Message Error Edit Data Dengan Lokasi Yang Baru")
    public void show_message_error_edit_data_dengan_lokasi_yang_baru(){
        Assert.assertEquals(masterLokasiPenyimpananPage.getAlertText(),"Data berhasil diubah");
        extentTest.log(LogStatus.PASS,"User Get Text Success Data Berhasil Diubah");
        driver.switchTo().alert().accept();
    }
}

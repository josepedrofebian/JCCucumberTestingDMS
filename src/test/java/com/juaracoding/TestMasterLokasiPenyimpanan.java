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
    public void user_click_side_bar_menu_data_master() {
        masterLokasiPenyimpananPage.clickSideBarMasterData();
        extentTest.log(LogStatus.PASS, "User click Side Bar Menu Data Master");
    }

    @And("User click menu lokasi penyimpanan")
    public void user_click_menu_lokasi_penyimpanan() {
        masterLokasiPenyimpananPage.clickSideBarLokasiPenyimpanan();
        extentTest.log(LogStatus.PASS, "User click menu lokasi penyimpanan");
    }

    @Then("User Direct To Lokasi Penyimpanan Page")
    public void user_direct_to_lokasi_penyimpanan_page() {
        Assert.assertEquals(masterLokasiPenyimpananPage.getTextDataLokasiArsip(), "Data Lokasi Arsip");
        extentTest.log(LogStatus.PASS, "User Direct To Lokasi Penyimpanan Page");
    }

    @When("User Input In Field Search Lokasi Penyimpanan")
    public void user_input_in_field_search_lokasi_penyimpanan() {
        masterLokasiPenyimpananPage.inputFieldSearch("gudang data");
        extentTest.log(LogStatus.PASS, "User Input In Field Search Lokasi Penyimpanan");
    }

    @And("User Click Button Search Lokasi Penyimpanan")
    public void user_click_button_search_lokasi_penyimpanan() {
        masterLokasiPenyimpananPage.clickButtonSearch();
        extentTest.log(LogStatus.PASS, "User Click Button Search Lokasi Penyimpanan");
    }

    @Then("User Get Data Result Of Search Lokasi Penyimpanan")
    public void user_get_data_result_of_search_lokasi_penyimpanan() {
        Assert.assertEquals(masterLokasiPenyimpananPage.getTextResultSearch(), "gudang data");
        extentTest.log(LogStatus.PASS, "User Get Data Result Of Search Lokasi Penyimpanan");
        masterLokasiPenyimpananPage.clearInputFieldSearch();
        masterLokasiPenyimpananPage.clickButtonSearch();
    }

    @When("User Click Button Input Data Lokasi Penyimpanan")
    public void user_click_button_input_data_lokasi_penyimpanan() {
        masterLokasiPenyimpananPage.clickInputData();
        extentTest.log(LogStatus.PASS, "User Click Button Input Data Lokasi Penyimpanan");
    }

    @And("User Input Data Nama Lokasi Penyimpanan")
    public void user_input_data_nama_lokasi_penyimpanan() {
        masterLokasiPenyimpananPage.inputDataNamaLokasi(DriverSingleton.randomString());
        extentTest.log(LogStatus.PASS, "User Input Data Nama Lokasi Penyimpanan");
    }

    @And("User Click Button Simpan Lokasi Penyimpanan")
    public void user_click_button_simpan_lokasi_penyimpanan() {
        masterLokasiPenyimpananPage.clickButtonSimpanInput();
        extentTest.log(LogStatus.PASS, "User Click Button Simpan Lokasi Penyimpanan");
    }

    @Then("User Get Text Success Data Berhasil Disimpan Lokasi Penyimpanan")
    public void user_get_text_success_data_berhasil_disimpan_lokasi_penyimpanan() {
        DriverSingleton.delay(10);
        Assert.assertEquals(masterLokasiPenyimpananPage.getAlertText(), "Data berhasil disimpan");
        extentTest.log(LogStatus.PASS, "User Get Text Success Data Berhasil Disimpan Lokasi Penyimpanan");
        DriverSingleton.delay(10);
        driver.switchTo().alert().accept();
    }

    @And("User Input Data Nama Lokasi Penyimpanan With Empty")
    public void user_input_data_nama_lokasi_penyimpanan_with_empty() {
        masterLokasiPenyimpananPage.inputDataNamaLokasi("");
        extentTest.log(LogStatus.PASS, "User Input Data Nama Lokasi Penyimpanan With Empty");
    }

    @And("User Input Data Nama Lokasi Penyimpanan With Same Name")
    public void user_input_data_nama_lokasi_penyimpanan_with_same_name() {
        masterLokasiPenyimpananPage.inputDataNamaLokasi("test890");
        extentTest.log(LogStatus.PASS, "User Input Data Nama Lokasi Penyimpanan With Same Name");
    }

    @And("User Input Data Nama Lokasi Penyimpanan With Space")
    public void user_input_data_nama_lokasi_penyimpanan_with_space() {
        masterLokasiPenyimpananPage.inputDataNamaLokasi(" ");
        extentTest.log(LogStatus.PASS, "User Input Data Nama Lokasi Penyimpanan With Space");
    }

    @And("User Input Data Nama Lokasi Penyimpanan With Special Character")
    public void user_input_data_nama_lokasi_penyimpanan_with_spesial_character() {
        masterLokasiPenyimpananPage.inputDataNamaLokasi(DriverSingleton.randomCharacter());
        extentTest.log(LogStatus.PASS, "User Input Data Nama Lokasi Penyimpanan With Special Character");
    }

    @Then("Show Message Error Nama Harus Diisi Lokasi Penyimpanan")
    public void show_message_error_nama_harus_diisi_lokasi_penyimpanan() {
        DriverSingleton.delay(5);
        Assert.assertEquals(masterLokasiPenyimpananPage.getTextErrorMessage(), "Nama harus diisi");
        extentTest.log(LogStatus.PASS, "Show Message Error Nama Harus Diisi Lokasi Penyimpanan");
        DriverSingleton.delay(5);
        masterLokasiPenyimpananPage.clickButtonCloseInput();
    }

    @Then("Show Message Error Nama Lokasi Sudah Ada Lokasi Penyimpanan")
    public void show_message_error_nama_lokasi_sudah_ada() {
        DriverSingleton.delay(5);
        Assert.assertEquals(masterLokasiPenyimpananPage.getTextErrorMessage(), "Nama Lokasi sudah ada");
        extentTest.log(LogStatus.PASS, "Show Message Error Nama Lokasi Sudah Ada Lokasi Penyimpanan");
        DriverSingleton.delay(5);
        masterLokasiPenyimpananPage.clickButtonCloseInput();
    }

    @Then("Show Message Error Nama Tidak Boleh Hanya Spasi")
    public void show_message_error_nama_tidak_boleh_hanya_spasi() {
        DriverSingleton.delay(5);
        Assert.assertEquals(masterLokasiPenyimpananPage.getTextErrorMessage(), "Nama tidak boleh hanya spasi");
        extentTest.log(LogStatus.PASS, "Show Message Error Nama Tidak Boleh Hanya Spasi");
        DriverSingleton.delay(10);
        masterLokasiPenyimpananPage.clickButtonCloseInput();
    }

    @Then("Show Message Error Nama Tidak Boleh Mengandung Spesial Karakter")
    public void show_message_error_nama_tidak_boleh_mengandung_spesial_karakter() {
        DriverSingleton.delay(5);
        Assert.assertEquals(masterLokasiPenyimpananPage.getTextErrorMessage(), "Nama Tidak Boleh Mengandung Spesisal Karakter");
        extentTest.log(LogStatus.PASS, "Show Message Error Nama Tidak Boleh Mengandung Spesial Karakter");
        DriverSingleton.delay(10);
        masterLokasiPenyimpananPage.clickOtherSpace();
    }

    @Then("User Get Text Success Data Berhasil Diubah")
    public void user_get_text_success_data_berhasil_diubah() {
        DriverSingleton.delay(10);
        Assert.assertEquals(masterLokasiPenyimpananPage.getAlertText(), "Data berhasil diubah");
        extentTest.log(LogStatus.PASS, "User Get Text Success Data Berhasil Diubah");
        DriverSingleton.delay(10);
        driver.switchTo().alert().accept();
    }

    @Then("Show Message Error Edit Data Dengan Lokasi Yang Baru")
    public void show_message_error_edit_data_dengan_lokasi_yang_baru() {
        DriverSingleton.delay(5);
        Assert.assertEquals(masterLokasiPenyimpananPage.isRequiredEditField(), "Edit Data Dengan Lokasi Yang Baru");
        extentTest.log(LogStatus.PASS, "Show Message Error Edit Data Dengan Lokasi Yang Baru");
        DriverSingleton.delay(10);
        masterLokasiPenyimpananPage.clickButtonCloseEdit();
    }
    @Then("Show Message Error Edit Data Tidak Boleh Kosong")
    public void show_message_error_edit_data_tidak_boleh_kosong(){
        DriverSingleton.delay(5);
        Assert.assertEquals(masterLokasiPenyimpananPage.isRequiredEditField(),"Edit Data Tidak Boleh Kosong");
        extentTest.log(LogStatus.PASS, "Show Message Error Edit Data Tidak Boleh Kosong");
    }
    @And("User Click Button Close")
    public void user_click_button_close() {
        masterLokasiPenyimpananPage.clickButtonCloseInput();
        extentTest.log(LogStatus.PASS, "User Click Button Close");
    }

    @And("User Click Button X")
    public void user_click_button_x() {
        masterLokasiPenyimpananPage.clickButtonXInput();
        extentTest.log(LogStatus.PASS, "User Click Button X");
    }

    @When("User Click Button Edit Data Lokasi Penyimpanan")
    public void user_click_button_edit_data_lokasi_penyimpanan() {
        DriverSingleton.delay(10);
        masterLokasiPenyimpananPage.clickButtonEdit();
        extentTest.log(LogStatus.PASS, "User Click Button Edit Data Lokasi Penyimpanan");
    }

    @And("User Edit Data Nama Lokasi Penyimpanan")
    public void user_edit_data_nama_lokasi_penyimpanan() {
        masterLokasiPenyimpananPage.editDataField(DriverSingleton.randomString());
        extentTest.log(LogStatus.PASS, "User Edit Data Nama Lokasi Penyimpanan");
    }

    @And("User Click Button Simpan Edit")
    public void user_click_button_simpan_edit() {
        masterLokasiPenyimpananPage.clickButtonSimpanEdit();
        extentTest.log(LogStatus.PASS, "User Click Button Simpan Edit");
    }

    @Then("User Get Text Title Input Data")
    public void user_get_title_input_data() {
        Assert.assertEquals(masterLokasiPenyimpananPage.getTextModalTitleTambahData(), "Tambah Data");
        extentTest.log(LogStatus.PASS, "User Get Text Title Input Data");
        masterLokasiPenyimpananPage.clickButtonCloseInput();
    }

    @And("User Click Button Close Edit Lokasi Penyimpanan")
    public void user_click_button_close_edit_lokasi_penyimpanan() {
        masterLokasiPenyimpananPage.clickButtonCloseEdit();
        extentTest.log(LogStatus.PASS, "User Click Button Close Edit Lokasi Penyimpanan");
    }

    @And("User Click Button X Edit Lokasi Penyimpanan")
    public void user_click_button_x_edit_lokasi_penyimpanan() {
        masterLokasiPenyimpananPage.clickButtonXEdit();
        extentTest.log(LogStatus.PASS, "User Click Button X Edit Lokasi Penyimpanan");
    }

    @When("User Click Icon Home From Lokasi Penyimpanan Page")
    public void user_click_icon_home_from_lokasi_penyimpanan_page() {
        masterLokasiPenyimpananPage.clickIconHome();
        extentTest.log(LogStatus.PASS, "User Click Icon Home From Lokasi Penyimpanan Page");
    }
    @Then("Show Modal Tambah Data")
    public void show_modal_tambah_data(){
        DriverSingleton.delay(5);
        Assert.assertEquals(masterLokasiPenyimpananPage.getTextModalTitleTambahData(),"Tambah Data");
        extentTest.log(LogStatus.PASS, "Show Modal Tambah Data");
        DriverSingleton.delay(5);
    }
    @And("User Edit Data Nama Lokasi Penyimpanan With Special Character")
    public void user_edit_data_nama_lokasi_penyimpanan_with_special_character(){
        masterLokasiPenyimpananPage.clearEditDataField();
        masterLokasiPenyimpananPage.editDataField(DriverSingleton.randomCharacter());
        extentTest.log(LogStatus.PASS, "User Edit Data Nama Lokasi Penyimpanan With Special Character");
    }
    @And("User Edit Data Nama Lokasi Penyimpanan With Space")
    public void user_edit_data_nama_lokasi_penyimpanan_with_space(){
        masterLokasiPenyimpananPage.clearEditDataField();
        DriverSingleton.delay(5);
        masterLokasiPenyimpananPage.editDataField("    ");
        extentTest.log(LogStatus.PASS, "User Edit Data Nama Lokasi Penyimpanan With Space");
    }
    @And("User Edit Data Nama Lokasi Penyimpanan With Empty")
    public void user_edit_data_nama_lokasi_penyimpanan_with_empty(){
        masterLokasiPenyimpananPage.clearEditDataField();
        DriverSingleton.delay(5);
        extentTest.log(LogStatus.PASS, "User Edit Data Nama Lokasi Penyimpanan With Empty");
    }

}

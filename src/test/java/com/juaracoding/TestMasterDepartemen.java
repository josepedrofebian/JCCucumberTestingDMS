package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.MasterDepartemenPage;
import com.juaracoding.pages.MasterLokasiPenyimpananPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestMasterDepartemen {
    static WebDriver driver;
    static ExtentTest extentTest;
    static MasterDepartemenPage departementPage = new MasterDepartemenPage();

    public TestMasterDepartemen() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    @When("User pilih Side Bar Menu Data Master")
    public void user_pilih_side_bar_menu_data_master() {
        departementPage.clickSideBarMasterData();
        extentTest.log(LogStatus.PASS, "User pilih Side Bar Menu Data Master");
    }

    @And("User pilih menu Departemen")
    public void user_pilih_menu_departemen() {
        departementPage.clickSideBarDepartement();
        extentTest.log(LogStatus.PASS, "User pilih menu Departemen");
    }

    @Then("User menuju Departemen Page")
    public void user_menuju_departemen_page() {
        Assert.assertEquals(departementPage.getTextDataDepartemen(), "Data Departemen");
        extentTest.log(LogStatus.PASS, "User menuju Departemen Page");
    }

    @When("User Input di Field Pencarian Departemen")
    public void user_input_di_field_pencarian_departemen() {
        departementPage.inputFieldSearch("Legall");
        extentTest.log(LogStatus.PASS, "User Input di Field Pencarian Departemen");
    }

    @And("User Pilih Tombol Pencarian Departemen")
    public void user_pilih_button_search_departemen() {
        departementPage.clickBtnSearch();
        extentTest.log(LogStatus.PASS, "User Pilih Tombol Pencarian Departemen");
    }//

    @Then("User Mendapat Data Hasil dari Pencarian Departemen")
    public void ser_mendapat_data_hasil_dari_pencarian_departemen() {
        Assert.assertEquals(departementPage.getTextResultSearch(), "Legall");
        extentTest.log(LogStatus.PASS, "User Mendapat Data Hasil dari Pencarian Departemen");
        departementPage.clearInputFieldSearch();
        departementPage.clickBtnSearch();
    }

    @When("User Pilih Tombol Input Data Departemen")
    public void User_pilih_tombol_tnput_data_departemen() {
        departementPage.clickInputData();
        extentTest.log(LogStatus.PASS, "User Pilih Tombol Input Data Departemen");
    }

    @And("User pilih Tombol Simpan Departemen")
    public void user_pilih_tombol_simpan_departemen() {
        departementPage.clickBtnSimpanInput();
        extentTest.log(LogStatus.PASS, "User pilih Tombol Simpan Departemen");
    }

    @Then("User Mendapat text Data Berhasil Disimpan Departemen")
    public void user_mendapat_text_data_berhasil_disimpan_departemen() {
        DriverSingleton.delay(10);
        Assert.assertEquals(departementPage.getAlertText(), "Data berhasil disimpan");
        extentTest.log(LogStatus.PASS, "User Mendapat text Data Berhasil Disimpan Departemen");
        DriverSingleton.delay(10);
        driver.switchTo().alert().accept();
    }

    @Then("User Mendapat Text Data Berhasil Diubah")
    public void user_mendapat_data_berhasil_diubah() {
        DriverSingleton.delay(10);
        Assert.assertEquals(departementPage.getAlertText(), "Data berhasil diubah");
        extentTest.log(LogStatus.PASS, "User Mendapat Text Data Berhasil Diubah");
        DriverSingleton.delay(10);
        driver.switchTo().alert().accept();
    }

    @And("User Input Data Nama Departemen dengan Kosong")
    public void user_input_data_nama_departemen_with_empty() {
        departementPage.inputDataNamaDepartemen("");
        extentTest.log(LogStatus.PASS, "User Input Data Nama Departemen With Empty");
    }

    @And("User Input Data Nama Departemen")
    public void user_input_data_nama_departemen() {
        departementPage.inputDataNamaDepartemen(DriverSingleton.randomString());
        extentTest.log(LogStatus.PASS, "User Input Data Nama Departemen");
    }

    @And("User Input Data Nama Departemen Dengan Nama Sama")
    public void user_input_data_nama_departemen_dengan_nama_sama() {
        departementPage.inputDataNamaDepartemen("Javas");
        extentTest.log(LogStatus.PASS, "User Input Data Nama Departemen Dengan Nama Sama");
    }

    @And("User Input Data Nama Departemen dengan Spasi")
    public void user_input_data_nama_departemen_dengan_spasi() {
        departementPage.inputDataNamaDepartemen("      ");
        extentTest.log(LogStatus.PASS, "User Input Data Nama Departemen dengan Spasi");
    }

    @And("User Input Data Nama Depatemen dengan Special Character")
    public void user_input_data_nama_departemen_dengan_spesial_character() {
        departementPage.inputDataNamaDepartemen(DriverSingleton.randomCharacter());
        extentTest.log(LogStatus.PASS, "User Input Data Nama Depatemen dengan Special Character");
    }

    @And("User Edit Data Nama Departemen Dengan Spesial KaraKter")
    public void user_edit_data_nama_departemen_dengan_spesial_karakter(){
        departementPage.clearEditDataField();
        departementPage.editDataField(DriverSingleton.randomCharacter());
        extentTest.log(LogStatus.PASS, "User Edit Data Nama Departemen Dengan Spesial KaraKter");
    }

    @Then("Tammpilkan Pesan Error Nama Harus Diisi Departemen")
    public void show_message_error_nama_harus_diisi_departemen() {
        DriverSingleton.delay(5);
        Assert.assertEquals(departementPage.getTextErrorMessage(), "Nama harus diisi");
        extentTest.log(LogStatus.PASS, "Tammpilkan Pesan Error Nama Harus Diisi Departemen");
        DriverSingleton.delay(5);
        departementPage.clickBtnCloseInput();
    }

    @And("User Edit Data Nama Departemen Dengan Spesial Karakter")
    public void user_edit_data_departemen_penyimpanan_with_spesial_karakter(){
        departementPage.clearEditDataField();
        departementPage.editDataField(DriverSingleton.randomCharacter());
        extentTest.log(LogStatus.PASS, "User Edit Data Nama Departemen Dengan Spesial Karakter");
    }

    @Then("Tampilkan Pesan Error Nama Departemen Sudah Ada")
    public void tampilkan_pesan_error_nama_Departemen_sudah_ada() {
        DriverSingleton.delay(5);
        Assert.assertEquals(departementPage.getTextErrorMessageSudahAda(), "Nama Departemen sudah ada");
        extentTest.log(LogStatus.PASS, "Tampilkan Pesan Error Nama Departemen Sudah Ada");
        DriverSingleton.delay(5);
        departementPage.clickBtnSimpanInput();
    }

    @Then("Tampilkan Pesan Error Edit Nama Departemen")
    public void show_message_error_edit_data_dengan_lokasi_yang_baru() {
        DriverSingleton.delay(5);
        Assert.assertEquals(departementPage.isRequiredEditDepartemenField(), "Nama Departemen sudah ada");
        extentTest.log(LogStatus.PASS, "Tampilkan Pesan Error Edit Nama Departemen");
        DriverSingleton.delay(10);
        departementPage.clickBtnCancelEdit();
    }

    @Then("Tampilkan Pesan Error Nama Tidak Boleh Hanya Berisi Spasi")
    public void tampilkan_pesan_error_nama_tidak_boleh_hanya_berisi_spasi() {
        DriverSingleton.delay(5);
        Assert.assertEquals(departementPage.getTextErrorMessage(), "Nama tidak boleh hanya berisi spasi");
        extentTest.log(LogStatus.PASS, "Tampilkan Pesan Error Nama Tidak Boleh Hanya berisi Spasi");
        DriverSingleton.delay(10);
        departementPage.clickBtnCancelEdit();
    }

    @Then("Tampilkan Pesan Error Nama Tidak Boleh Mengandung Spesial Karakter")
    public void tampilkan_pesan_error_nama_tidak_boleh_mengandung_spesial_karakter() {
        DriverSingleton.delay(5);
        Assert.assertEquals(departementPage.getTextErrorMessage(), "Nama Tidak Boleh Mengandung Spesisal Karakter");
        extentTest.log(LogStatus.PASS, "Tampilkan Pesan Error Nama Tidak Boleh Mengandung Spesial Karakter");
        DriverSingleton.delay(10);
        departementPage.clickBtnCancelEdit();
    }

    @Then("Tampilkan Pesan Error Edit Data Dengan Departemen Yang Baru")
    public void tampilkan_pesan_error_edit_data_dengan_departemen_yang_baru() {
        DriverSingleton.delay(5);
        Assert.assertEquals(departementPage.isRequiredEditDepartemenField(), "Edit Data Dengan Departemen Yang Baru");
        extentTest.log(LogStatus.PASS, "Tampilkan Pesan Error Edit Data Dengan Departemen Yang Baru");
        DriverSingleton.delay(10);
        departementPage.clickBtnCancelEdit();
    }

    @And("User pilih Tombol Close")
    public void user_pilih_tombol_close() {
        departementPage.clickBtnCloseInput();
        extentTest.log(LogStatus.PASS, "User pilih Tombol Close");
    }

    @And("User Pilih Tombol X")
    public void user_pilih_tombol_x() {
        departementPage.clickXInputDepartement();
        extentTest.log(LogStatus.PASS, "User Pilih Tombol X");
    }

    @When("User Pilih Tombol Edit Data Departemen")
    public void user_pilih_tombol_edit_data_departemen() {
        departementPage.clickButtonEdit();
        extentTest.log(LogStatus.PASS, "User Pilih Tombol Edit Data Departemen");
    }

    @And("User Edit Data Nama Departemen")
    public void user_edit_data_nama_departemen() {
        departementPage.editDataField(DriverSingleton.randomString());
        extentTest.log(LogStatus.PASS, "User Edit Data Nama Departemen");
    }

    @And("User Pilih Tombol Simpan Edit")
    public void user_pilih_tobol_simpan_edit() {
        departementPage.clickBtnSimpanEdit();
        extentTest.log(LogStatus.PASS, "User Pilih Tombol Simpan Edit");
    }

    @Then("User Mendapat Text Title Input Data")
    public void user_mendapat_text_title_input_data() {
        Assert.assertEquals(departementPage.getTextModalTitleTambahData(), "Tambah Data");
        extentTest.log(LogStatus.PASS, "User Mendapat Text Title Input Data");
        departementPage.clickBtnCloseInput();
    }

    @And("User Pilih Tombol Close Edit Departemen")
    public void user_pilih_tombol_close_edit_departemen() {
        departementPage.clickBtnCancelEdit();
        extentTest.log(LogStatus.PASS, "User Pilih Tombol Close Edit Departemen");
    }

    @And("User Pilih Tombol X Edit Departemen")
    public void user_click_button_x_edit_departemen() {
        departementPage.clickBtnCancelEdit();
        extentTest.log(LogStatus.PASS, "User Click Button X Edit Departemen");
    }

    @When("User Pilih Icon Home Dari Halaman Departemen")
    public void user_pilih_icon_home_dari_halaman_departemen() {
        departementPage.clickIconHome();
        extentTest.log(LogStatus.PASS, "User Pilih Icon Home Dari Halaman Departemen");
    }

    @And("User Edit Data Nama Departemen Dengan Spasi")
    public void user_edit_data_nama_departemen_dengan_spasi() {
        departementPage.clearEditDataField();
        DriverSingleton.delay(5);
        departementPage.editDataField("    ");
        extentTest.log(LogStatus.PASS, "User Edit Data Nama Departemen Dengan Spasi");
    }

    @Then("Tampilkan Pesan Error Edit Data Tidak Boleh Kosong")
    public void show_message_error_edit_data_tidak_boleh_kosong() {
        DriverSingleton.delay(5);
        Assert.assertEquals(departementPage.isRequiredEditDepartemenField(), "Nama Departemen harus diisi");
        extentTest.log(LogStatus.PASS, "Tampilkan Pesan Error Edit Data Tidak Boleh Kosong");
    }

    @And("User Edit Data Nama Departemen Dengan Kosong")
    public void user_edit_data_nama_departemen_dengan_kosong(){
        departementPage.clearEditDataField();
        DriverSingleton.delay(5);
        extentTest.log(LogStatus.PASS, "User Edit Data Nama Departemen Dengan Kosong");
    }

    @Then("Tunjukan Modal Input Data")
    public void tunjukan_modal_input_data() {
        DriverSingleton.delay(5);
        Assert.assertEquals(departementPage.getTextModalTitleTambahData(), "Tambah Data");
        extentTest.log(LogStatus.PASS, "Tunjukan Modal Input Data");
        DriverSingleton.delay(5);
    }
}

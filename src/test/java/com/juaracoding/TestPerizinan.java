package com.juaracoding;

import com.juaracoding.pages.InputPerizinanPage;
import com.juaracoding.pages.PerizinanPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestPerizinan {
    static WebDriver driver;
    static ExtentTest extentTest;
    static PerizinanPage perizinanPage = new PerizinanPage();
    static InputPerizinanPage inputPerizinanPage = new InputPerizinanPage();

    public TestPerizinan() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("Refresh Halaman")
    public void refresh_halaman() {
        driver.navigate().refresh();
    }

    @Given("Kembali ke halaman sebelumnya")
    public void back_halaman() {
        driver.navigate().back();
    }

    // ============================ WHEN =============================== //
    @When("User Klik Menu Perizinan di Sidebar")
    public void user_klik_menu_perizinan_di_sidebar() {
        perizinanPage.clickMenuPerizinan();
        extentTest.log(LogStatus.PASS, "User Klik Menu Perizinan di Sidebar");
    }

    @When("User Klik Tombol Input Data")
    public void user_klik_tombol_input_data() {
        perizinanPage.clickBtnInputData();
        extentTest.log(LogStatus.PASS, "User Klik Tombol Input Data");
    }

    @When("User Input Nomor Perizinan")
    public void user_input_nomor_perizinan() {
        inputPerizinanPage.addNomorPerizinan();
        extentTest.log(LogStatus.PASS, "User Input Nomor Perizinan");
    }

    @When("User Input Invalid Nomor Perizinan")
    public void user_input_invalid_nomor_perizinan() {
        inputPerizinanPage.addInvalidNomorPerizinan();
        extentTest.log(LogStatus.PASS, "User Input Invalid Nomor Perizinan");
    }

    // ============================ AND =============================== //
    @And("User Input Nama Perizinan")
    public void user_input_nama_perizinan() {
        inputPerizinanPage.addNamaPerizinan();
        extentTest.log(LogStatus.PASS, "User Input Nama Perizinan");
    }

    @And("User Input Invalid Nama Perizinan")
    public void user_input_invalid_nama_perizinan() {
        inputPerizinanPage.addInvalidNamaPerizinan();
        extentTest.log(LogStatus.PASS, "User Input Invalid Nama Perizinan");
    }

    @And("User Input Tanggal Mulai Perizinan")
    public void user_input_tgl_mulai() {
        inputPerizinanPage.addTglAwal();
        extentTest.log(LogStatus.PASS, "User Input Tanggal Mulai Perizinan");
    }

    @And("User Input Invalid Tanggal Mulai Perizinan")
    public void user_input_invalid_tgl_mulai() {
        inputPerizinanPage.addInvalidTglAwal();
        extentTest.log(LogStatus.PASS, "User Input Invalid Tanggal Mulai Perizinan");
    }

    @And("User Input Invalid Tanggal Mulai Perizinan Today")
    public void user_input_invalid_tgl_mulai_today() {
        inputPerizinanPage.addInvalidTglAwalToday();
        extentTest.log(LogStatus.PASS, "User Input Invalid Tanggal Mulai Perizinan");
    }

    @And("User Input Tanggal Berakhir Perizinan")
    public void user_input_tgl_akhir() {
        inputPerizinanPage.addTglAkhir();
        extentTest.log(LogStatus.PASS, "User Input Tanggal Berakhir Perizinan");
    }

    @And("User Input Invalid Tanggal Berakhir Perizinan")
    public void user_input_invalid_tgl_akhir() {
        inputPerizinanPage.addInvalidTglAkhir();
        extentTest.log(LogStatus.PASS, "User Input Invalid Tanggal Berakhir Perizinan");
    }

    @And("User Input Invalid Tanggal Berakhir Perizinan Today")
    public void user_input_invalid_tgl_akhir_today() {
        inputPerizinanPage.addInvalidTglAkhirToday();
        extentTest.log(LogStatus.PASS, "User Input Invalid Tanggal Berakhir Perizinan Today");
    }

    @And("User Input Diterbitkan Oleh")
    public void user_input_diterbitkan() {
        inputPerizinanPage.addDiterbitkan();
        extentTest.log(LogStatus.PASS, "User Input Diterbitkan Oleh");
    }

    @And("User Input Invalid Diterbitkan Oleh")
    public void user_input_Invalid_diterbitkan() {
        inputPerizinanPage.addInvalidDiterbitkan();
        extentTest.log(LogStatus.PASS, "User Input Invalid Diterbitkan Oleh");
    }

    @And("User Input Deskripsi")
    public void user_input_desc() {
        inputPerizinanPage.addDeskripsi();
        extentTest.log(LogStatus.PASS, "User Input Deskripsi");
    }

    @And("User Input Invalid Deskripsi")
    public void user_input_invalid_desc() {
        inputPerizinanPage.addInvalidDeskripsi();
        extentTest.log(LogStatus.PASS, "User Input Invalid Deskripsi");
    }

    @And("User Input Pemilik Dokumen")
    public void user_input_pemilik() {
        inputPerizinanPage.addPemilik();
        extentTest.log(LogStatus.PASS, "User Input Pemilik Dokumen");
    }

    @And("User Input Invalid Pemilik Dokumen")
    public void user_input_invalid_pemilik() {
        inputPerizinanPage.addInvalidPemilik();
        extentTest.log(LogStatus.PASS, "User Input Invalid Pemilik Dokumen");
    }

    @And("User Input Dibuat Oleh")
    public void user_input_dibuat_oleh() {
        inputPerizinanPage.addDibuatOleh();
        extentTest.log(LogStatus.PASS, "User Input Dibuat Oleh");
    }

    @And("User Input Invalid Dibuat Oleh")
    public void user_input_invalid_dibuat_oleh() {
        inputPerizinanPage.addInvalidDibuatOleh();
        extentTest.log(LogStatus.PASS, "User Input Invalid Dibuat Oleh");
    }

    @And("User Input Tim Terkait")
    public void user_input_tim_terkait() {
        inputPerizinanPage.addTimTerkait();
        extentTest.log(LogStatus.PASS, "User Input Tim Terkait");
    }

    @And("User Input Invalid Tim Terkait")
    public void user_input_invalid_tim_terkait() {
        inputPerizinanPage.addInvalidTimTerkait();
        extentTest.log(LogStatus.PASS, "User Input Invalid Tim Terkait");
    }

    @And("User Input Tanggal Reminder")
    public void user_input_tgl_reminder() {
        inputPerizinanPage.addTglReminder();
        extentTest.log(LogStatus.PASS, "User Input Tanggal Reminder");
    }

    @And("User Input Invalid Tanggal Reminder")
    public void user_input_invalid_tgl_reminder() {
        inputPerizinanPage.addInvalidTglReminder();
        extentTest.log(LogStatus.PASS, "User Input Invalid Tanggal Reminder");
    }

    @And("User Input Invalid Tanggal Reminder Today")
    public void user_input_invalid_tgl_reminder_Today() {
        inputPerizinanPage.addInvalidTglReminderToday();
        extentTest.log(LogStatus.PASS, "User Input Invalid Tanggal Reminder Today");
    }

    @And("User Input Jenis Media")
    public void user_input_jenis_media() {
        inputPerizinanPage.addJenisMedia();
        extentTest.log(LogStatus.PASS, "User Input Jenis Media");
    }

    @And("User Input Invalid Jenis Media")
    public void user_input_invalid_jenis_media() {
        inputPerizinanPage.addInvalidJenisMedia();
        extentTest.log(LogStatus.PASS, "User Input Invalid Jenis Media");
    }

    @And("User Input Jumlah Dokumen")
    public void user_input_jumlah() {
        inputPerizinanPage.addJumlah();
        extentTest.log(LogStatus.PASS, "User Input Jumlah Dokumen");
    }

    @And("User Pilih File PDF Dokumen di Explorer")
    public void user_tambah_pdfdokumen() {
        inputPerizinanPage.addDokumenPdf();
        extentTest.log(LogStatus.PASS, "User Pilih File Dokumen PDF di Explorer");
    }

    @And("User Pilih File DOCX Dokumen di Explorer")
    public void user_tambah_docxdokumen() {
        inputPerizinanPage.addDokumenDocx();
        extentTest.log(LogStatus.PASS, "User Pilih File Dokumen Docx di Explorer");
    }

    @And("User Input Share")
    public void user_input_shared() {
        inputPerizinanPage.addShare();
        extentTest.log(LogStatus.PASS, "User Input Share");
    }

    @And("User Input Status Dokumen")
    public void user_input_status() {
        inputPerizinanPage.addStatus();
        extentTest.log(LogStatus.PASS, "User Input Status Dokumen");
    }

    @And("User Klik Simpan")
    public void user_klik_simpan() {
        inputPerizinanPage.clickBtnSimpan();
        extentTest.log(LogStatus.PASS, "User Klik Simpan");
    }

    // ============================ THEN =============================== //
    @Then("User Berhasil Menampilkan Halaman Perizinan")
    public void user_get_text_title_perizinan_page() {
        Assert.assertEquals(perizinanPage.getTxtListPerizinan(), "Perizinan");
        extentTest.log(LogStatus.PASS, "User Berhasil Menampilkan Halaman Perizinan");
    }

    @Then("User Berhasil Menampilkan Halaman Input Data Perizinan")
    public void user_get_text_tittle_input_perizinan() {
        Assert.assertEquals(perizinanPage.getTxtInputPerizinan(), "Input Perizinan");
        extentTest.log(LogStatus.PASS, "User Berhasil Menampilkan Halaman Input Data Perizinan");
    }

    @Then("User Berhasil Menyimpan Data")
    public void user_get_text_berhasil_save() {
        Assert.assertEquals(inputPerizinanPage.getTxtBerhasilSave(), "Data berhasil di saved!");
        extentTest.log(LogStatus.PASS, "User Berhasil Menyimpan Data");
    }

    @Then("Menampilkan Alert di Kolom Nomor Dokumen")
    public void user_get_required_no_dokumen() {
        Assert.assertEquals(inputPerizinanPage.getNoPerizinanRequired(), "true");
        extentTest.log(LogStatus.PASS, "Menampilkan Alert di Kolom Nomor Dokumen");
    }

    @Then("Menampilkan Alert di Kolom Nama Perizinan")
    public void user_get_required_nama_dokumen() {
        Assert.assertEquals(inputPerizinanPage.getNamaPerizinanRequired(), "true");
        extentTest.log(LogStatus.PASS, "Menampilkan Alert di Kolom Nomor Dokumen");
    }

    @Then("Menampilkan Alert di Kolom Tanggal Mulai")
    public void user_get_required_tanggal_mulai() {
        Assert.assertEquals(inputPerizinanPage.getTglMulaiRequired(), "true");
        extentTest.log(LogStatus.PASS, "Menampilkan Alert di Kolom Tanggal Mulai");
    }

    @Then("Menampilkan Alert di Kolom Tanggal Akhir")
    public void user_get_required_tanggal_akhir() {
        Assert.assertEquals(inputPerizinanPage.getTglAkhirRequired(), "true");
        extentTest.log(LogStatus.PASS, "Menampilkan Alert di Kolom Tanggal Akhir");
    }

    @Then("Menampilkan Alert di Kolom Diterbitkan Oleh")
    public void user_get_required_diterbitkan() {
        Assert.assertEquals(inputPerizinanPage.getDiterbitkanRequired(), "true");
        extentTest.log(LogStatus.PASS, "Menampilkan Alert di Kolom Diterbitkan Oleh");
    }

    @Then("Menampilkan Alert di Kolom Deskripsi")
    public void user_get_required_deskripsi() {
        Assert.assertEquals(inputPerizinanPage.getDeskripsiRequired(), "true");
        extentTest.log(LogStatus.PASS, "Menampilkan Alert di Kolom Deskripsi");
    }

    @Then("Menampilkan Alert di Kolom Pemilik Dokumen")
    public void user_get_required_pemilik() {
        Assert.assertEquals(inputPerizinanPage.getPemilikRequired(), "true");
        extentTest.log(LogStatus.PASS, "Menampilkan Alert di Kolom Pemilik Dokumen");
    }

    @Then("Menampilkan Alert di Kolom Dibuat Oleh")
    public void user_get_required_dibuat_oleh() {
        Assert.assertEquals(inputPerizinanPage.getDibuatOlehRequired(), "true");
        extentTest.log(LogStatus.PASS, "Menampilkan Alert di Kolom Dibuat Oleh");
    }

    @Then("Menampilkan Alert di Kolom Tim Terkait")
    public void user_get_required_tim_terkait() {
        Assert.assertEquals(inputPerizinanPage.getTimTerkaitRequired(), "true");
        extentTest.log(LogStatus.PASS, "Menampilkan Alert di Kolom Tim Terkait");
    }

    @Then("Menampilkan Alert di Kolom Tanggal Reminder")
    public void user_get_required_tgl_reminder() {
        Assert.assertEquals(inputPerizinanPage.getTglReminderRequired(), "true");
        extentTest.log(LogStatus.PASS, "Menampilkan Alert di Kolom Tanggal Reminder");
    }

    @Then("Menampilkan Alert di Kolom Jenis Media")
    public void user_get_required_jenis_media() {
        Assert.assertEquals(inputPerizinanPage.getJenisMediaRequired(), "true");
        extentTest.log(LogStatus.PASS, "Menampilkan Alert di Kolom Jenis Media");
    }

    @Then("Menampilkan Alert Tanggal Akhir Tidak boleh Lebih Kecil")
    public void get_alert_tgl_akhir_tidak_kurang_dari_tgl_awal() {
        System.out.println("belum ada peringatannya");
        Assert.assertEquals(inputPerizinanPage.getAlertTglAkhir(), "Tanggal Akhir Tidak boleh Lebih Kecil Dari Tanggal Mulai");
        extentTest.log(LogStatus.FAIL, "Menampilkan Alert Tanggal Akhir Tidak boleh Lebih Kecil");
    }

    @Then("Menampilkan Alert di Kolom Tanggal Reminder Tidak Boleh Lebih Kecil")
    public void get_alert_tgl_reminder_tidak_kurang_dari_tgl_awal() {
        System.out.println("belum ada peringatannya");
        Assert.assertEquals(inputPerizinanPage.getAlertTglReminder(), "Tanggal Reminder Tidak boleh Lebih Kecil/Besar Dari Tanggal Mulai/Berakhir");
        extentTest.log(LogStatus.FAIL, "Menampilkan Alert di Kolom Tanggal Reminder Tidak Boleh Lebih Kecil");
    }

    @Then("User Berhasil Diupload File PDF")
    public void user_get_file_pdf() {
        Assert.assertEquals(inputPerizinanPage.getFileExtension(), "pdf");
        extentTest.log(LogStatus.PASS, "User Berhasil Diupload File PDF");
    }

    @Then("User Berhasil Diupload File DOCX")
    public void user_get_file_docx() {
        Assert.assertEquals(inputPerizinanPage.getFileExtension(), "docx");
        extentTest.log(LogStatus.PASS, "User Berhasil Diupload File docx");
    }

    @Then("Menampilkan Alert Data Tidak Boleh Kosong")
    public void get_alert_data_invalid() {
        System.out.println("belum ada peringatannya");
        Assert.assertEquals(inputPerizinanPage.getAlertTidakBolehKosong(), "Mohon Masukkan Data yang Valid");
        extentTest.log(LogStatus.FAIL, "User Menampilkan Alert Data Tidak Boleh Kosong");
    }

}

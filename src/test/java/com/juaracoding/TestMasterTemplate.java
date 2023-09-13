package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.MasterTemplatePage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static com.juaracoding.drivers.DriverSingleton.delay;

public class TestMasterTemplate {
    static WebDriver driver;
    static ExtentTest extentTest;
    static MasterTemplatePage masterTemplatePage = new MasterTemplatePage();

    public TestMasterTemplate() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User Click Side Bar Menu Data Master")
    public void user_click_side_bar_menu_data_master() {
        masterTemplatePage.clickSideBarDataMaster();
        extentTest.log(LogStatus.PASS, "User Click Side Bar Menu Data Master");
    }
    @And("User Click Menu Template")
    public void user_click_menu_template() {
        masterTemplatePage.clickSideBarTemplate();
        extentTest.log(LogStatus.PASS, "User Click Menu Template");
    }
    @Then("User Get Text Title In Template Page")
    public void user_get_text_title_in_template_page() {
        Assert.assertEquals(masterTemplatePage.getTextTitleTemplatePage(),"Data Template Nomor Surat");
        extentTest.log(LogStatus.PASS, "User Get Text Title In Template Page");
        DriverSingleton.delay(5);
    }
    @When("User Input In Field Search Template")
    public void user_input_in_field_search_lokasi_penyimpanan() {
        masterTemplatePage.inputFieldSearch("BD1");
        extentTest.log(LogStatus.PASS, "User Input In Field Search Template");
    }
    @And("User Click Button Search Template")
    public void user_click_button_search_template(){
        masterTemplatePage.clickIconSearch();
        extentTest.log(LogStatus.PASS, "User Click Button Search Template");
    }
    @Then("User Get Data Result Of Search Template")
    public void user_get_data_result_of_search_template(){
        Assert.assertEquals(masterTemplatePage.getTextResultSearch(), "BD1");
        extentTest.log(LogStatus.PASS, "User Get Data Result Of Search Lokasi Penyimpanan");
        masterTemplatePage.clearInputFieldSearch();
        masterTemplatePage.clickButtonSearch();
    }
    @When("User Click Button Input Data Template")
    public void user_click_button_input_data_template(){
        masterTemplatePage.clickInputData();
        extentTest.log(LogStatus.PASS, "User Click Button Input Data Template");
    }
    @And("User Choose Kategory Dropdown Internal")
    public void user_choose_kategory_dropdown_internal(){
        masterTemplatePage.kategoryChooseInternal();
        extentTest.log(LogStatus.PASS,"User Choose Kategory Dropdown Internal");
    }
    @And("User Choose Departemen Dropdown Business Development")
    public void user_choose_departemen_dropdown_business_development(){
        masterTemplatePage.departementChooseBusinessDevelopment();
        extentTest.log(LogStatus.PASS,"User Choose Departemen Dropdown Business Development");
    }
    @And("User Input In Field Nama Template")
    public void user_input_in_field_nama_template(){
        masterTemplatePage.inputFieldNamaTemplate(DriverSingleton.randomString());
        extentTest.log(LogStatus.PASS,"User Input In Field Nama Template");
    }
    @And("User Input In Field Format Nomor Surat")
    public void user_input_in_field_format_nomor_surat(){
        masterTemplatePage.inputFieldFormatNomorSurat(DriverSingleton.randomString());
        extentTest.log(LogStatus.PASS,"User Input In Field Format Nomor Surat");
    }
    @And("User Click Button Simpan Template")
    public void user_click_button_simpan_template(){
        masterTemplatePage.clickButtonSimpanTambahData();
        extentTest.log(LogStatus.PASS,"User Click Button Simpan Template");
    }
    @Then("User Get Text Success Data Berhasil Disimpan Template")
    public void user_get_text_success_data_berhasil_disimpan_template(){
        delay(10);
        Assert.assertEquals(masterTemplatePage.getAlertText(), "Data berhasil disimpan");
        extentTest.log(LogStatus.PASS,"User Click Button Simpan Template");
        delay(10);
        driver.switchTo().alert().accept();
    }
    @And("User Choose Departemen Dropdown HRD")
    public void user_choose_departemen_dropdown_hrd(){
        masterTemplatePage.departementChooseHRD();
        extentTest.log(LogStatus.PASS,"User Choose Departemen Dropdown HRD");
    }
    @And("User Choose Departemen Dropdown Direksi")
    public void user_choose_departemen_dropdown_direksi(){
        masterTemplatePage.departementChooseDireksi();
        extentTest.log(LogStatus.PASS,"User Choose Departemen Dropdown Direksi");
    }
    @And("User Choose Kategory Dropdown Eksternal")
    public void user_choose_kategory_dropdown_eksternal(){
        masterTemplatePage.kategoryChooseEksternal();
        extentTest.log(LogStatus.PASS,"User Choose Kategory Dropdown Eksternal");
    }
    @And("User Click Button CLose Input Data Template")
    public void user_click_button_close_input_data_template(){
        masterTemplatePage.closeModalInputDataTemplateWithButtonClose();
        extentTest.log(LogStatus.PASS,"User Click Button CLose Input Data Template");
    }
    @And("User Click Button X Input Data Template")
    public void user_click_button_x_input_data_template(){
        masterTemplatePage.closeModalInputDataTemplateWithButtonX();
        extentTest.log(LogStatus.PASS,"User Click Button X Input Data Template");
    }
    @And("User Choose Kategory Dropdown Internal Edit")
    public void user_choose_kategory_dropdown_internal_edit(){
        masterTemplatePage.kategoryChooseInternalEdit();
        extentTest.log(LogStatus.PASS,"User Choose Kategory Dropdown Internal Edit");
    }
    @And("User Choose Kategory Dropdown Eksternal Edit")
    public void user_choose_kategory_dropdown_eksternal_edit(){
        masterTemplatePage.kategoryChooseEksternalEdit();
        extentTest.log(LogStatus.PASS,"User Choose Kategory Dropdown Eksternal Edit");
    }
    @And("User Choose Departemen Dropdown Business Development Edit")
    public void user_choose_department_dropdown_business_development_edit(){
        masterTemplatePage.departementChooseBusinessDevelopmentEdit();
        extentTest.log(LogStatus.PASS,"User Choose Departemen Dropdown Business Development Edit");
    }
    @And("User Input In Field Nama Template Edit")
    public void user_input_in_field_nama_template_edit(){
        masterTemplatePage.inputFieldNamaTemplateEdit(DriverSingleton.randomString());
        extentTest.log(LogStatus.PASS,"User Input In Field Nama Template Edit");
    }
    @And("User Input In Field Format Nomor Surat Edit")
    public void user_input_in_field_format_nomor_surat_edit(){
        masterTemplatePage.inputFieldFormatNomorSuratEdit(DriverSingleton.randomString());
        extentTest.log(LogStatus.PASS,"User Input In Field Format Nomor Surat Edit");
    }
    @And("User Click Button Simpan Template Edit")
    public void user_click_button_simpan_template_edit(){
        masterTemplatePage.clickButtonSimpanEditData();
        extentTest.log(LogStatus.PASS,"User Click Button Simpan Template Edit");
    }
    @When("User Click Button Edit Data Template")
    public void user_click_button_edit_data_template(){
        masterTemplatePage.clickButtonEdit();
        extentTest.log(LogStatus.PASS,"User Click Button Edit Data Template");
    }
    @Then("User Get Text Success Data Berhasil Diubah Template")
    public void user_get_text_success_data_berhasil_diubah_template(){
        delay(10);
        Assert.assertEquals(masterTemplatePage.getAlertText(), "Data berhasil diubah");
        extentTest.log(LogStatus.PASS,"User Get Text Success Data Berhasil Diubah Template");
        delay(10);
        driver.switchTo().alert().accept();
    }
    @And("User Choose Departemen Dropdown HRD Edit")
    public void user_choose_departemen_dropdown_hrd_edit(){
        masterTemplatePage.departementChooseHRDEdit();
        extentTest.log(LogStatus.PASS,"User Choose Departemen Dropdown HRD Edit");
    }
    @And("User Choose Departemen Dropdown Direksi Edit")
    public void user_choose_departemen_dropdown_direksi_edit(){
        masterTemplatePage.departementChooseDireksiEdit();
        extentTest.log(LogStatus.PASS,"User Choose Departemen Dropdown HRD Edit");
    }
    @And("User Click Button CLose Edit Data Template")
    public void user_click_button_close_edit_data_template(){
        masterTemplatePage.clickButtonCloseEdit();
        extentTest.log(LogStatus.PASS,"User Click Button CLose Edit Data Template");
    }
    @And("User Click Button X Edit Data Template")
    public void user_click_button_x_edit_data_template(){
        masterTemplatePage.clickButtonXEdit();
        extentTest.log(LogStatus.PASS,"User Click Button X Edit Data Template");
    }
}

package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.MasterGroupDokumenPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestMasterGroupDokumen {
    static WebDriver driver;
    static ExtentTest extentTest;
    static MasterGroupDokumenPage masterGroupDokumenPage = new MasterGroupDokumenPage();

    public TestMasterGroupDokumen() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @And("User Click Side Bar Menu Group Dokumen")
    public void user_click_side_bar_menu_group_dokumen(){
        masterGroupDokumenPage.clickSideBarGroupDokumen();
        extentTest.log(LogStatus.PASS,"User Click Side Bar Menu Group Dokumen");
    }

    @Then("User Get Text Title In Group Dokumen Page")
    public void user_get_text_title_in_groupdokumenpage() {
        DriverSingleton.delay(3);
        Assert.assertEquals(masterGroupDokumenPage.getTextTitleGroupDokumen(),"Group Documents");
        extentTest.log(LogStatus.PASS,"User Get Text Title In Group Dokumen Page");
    }

    @When("User Fill Search Field")
    public void user_fill_search_field() {
        masterGroupDokumenPage.inputFieldSearch("logistikkk");
        extentTest.log(LogStatus.PASS,"User Fill Search Field");
    }

    @Then("User Get Text Result Of Search")
    public void user_get_text_result_of_search() {
        DriverSingleton.delay(5);
        Assert.assertEquals(masterGroupDokumenPage.getTextResultOfSearch(),"logistikkk");
        extentTest.log(LogStatus.PASS,"User Get Text Result Of Search");
    }

    @And("User Click Button Search Group Documents")
    public void user_click_button_search_group_documents() {
        masterGroupDokumenPage.clickButtonIconSearch();
        extentTest.log(LogStatus.PASS,"User Click Button Search Group Documents");
        masterGroupDokumenPage.clearInputFieldSearch();
        masterGroupDokumenPage.clickButtonIconSearch();
    }

    @When("User Click Button Input Data Group Dokumen")
    public void user_Click_Button_Input_Data_Group_Dokumen() {
        masterGroupDokumenPage.clickButtonInputData();
        extentTest.log(LogStatus.PASS,"User Click Button Input Data Group Dokumen");
    }

    @And("User Input Kode Group Dokumen")
    public void user_Input_Kode_Group_Dokumen() {
        masterGroupDokumenPage.inputFieldInputDataKode(DriverSingleton.randomString());
        extentTest.log(LogStatus.PASS,"User Click Button Input Data Group Dokumen");
    }

    @And("User Input Nama Group Dokumen")
    public void user_Input_Nama_Group_Dokumen() {
        masterGroupDokumenPage.inputFieldInputDataNama(DriverSingleton.randomString());
        extentTest.log(LogStatus.PASS,"User Input Nama Group Dokumen");
    }

    @And("User Input Retensi Group Dokumen")
    public void user_Input_Retensi_Group_Dokumen() {
        masterGroupDokumenPage.inputFieldInputDataRetensi(DriverSingleton.randomInteger());
        extentTest.log(LogStatus.PASS,"User Input Retensi Group Dokumen");
    }

    @And("User Click Button Simpan Group Dokumen")
    public void user_ClickButtonSimpanGroupDokumen() {
        masterGroupDokumenPage.clickButtonInputDataSimpan();
        extentTest.log(LogStatus.PASS,"User Click Button Simpan Group Dokumen");
    }

    @Then("User Get Text Result Of Group Dokumen")
    public void userGetTextResultOfGroupDokumen() {
        Assert.assertEquals(masterGroupDokumenPage.getTextResultOfDocuments(),"gggggggg");
        extentTest.log(LogStatus.PASS,"User Get Text Result Of Group Dokumen");
        driver.navigate().refresh();
    }

    @And("User Click Button Close Input Data Group Dokumen")
    public void userClickButtonCloseInputDataGroupDokumen() {
        masterGroupDokumenPage.clickButtonInputDataClose();
        extentTest.log(LogStatus.PASS,"User Click Button Close Input Data Group Dokumen");
    }
}

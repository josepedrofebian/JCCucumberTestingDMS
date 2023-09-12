package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.utils.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

public class InternalDokumenPage {
    private WebDriver driver; // atribut kelas HomePage

    public InternalDokumenPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[normalize-space()='Input Data']")
    WebElement btnInputData;
    @FindBy(xpath = "//body/div[@class='wrapper']/aside[@class='main-sidebar']/section[@class='sidebar']/ul[@class='sidebar-menu']/li[4]/a[1]")
    WebElement btnInternalDokumen;
    @FindBy(xpath = "//select[@id='template']")
    WebElement inputDropDownTemplateInternal;
    @FindBy(xpath = "//select[@id='group']")
    WebElement inputDropDownGroupDokumen;
    @FindBy(xpath = "//input[@id='no_dok']")
    WebElement inputNomorDokumen;

    @FindBy(xpath = "//input[@id='nodokint']")
    WebElement inputNomorDokumenFilter;

    @FindBy(xpath = "//input[@id='nama_dok']")
    WebElement inputNamaDokumen;
    @FindBy(id = "deskripsi")
    WebElement inputDeskripsiDokumen;
    @FindBy(xpath = "//input[@id='owner']")
    WebElement inputOwnerDokumen;
    @FindBy(xpath = "//input[@id='tgl_terbit']")
    WebElement clickStartDate;
    @FindBy(xpath = "//input[@id='masa']")
    WebElement clickEndDate;
    @FindBy(xpath = "//input[@id='tgl_dok']")
    WebElement clickDokumenDate;
    @FindBy(xpath = "//select[@id='lokasi']")
    WebElement clickLokasiArsip;
    @FindBy(xpath = "//input[@id='tgl_reminder']")
    WebElement clickReminderDate;
    @FindBy(xpath = "//select[@id='media']")
    WebElement clickDropDownJenisMedia;
    @FindBy(xpath = "//select[@id='file_exist']")
    WebElement clickKetersediaanFileBelumAda;
    @FindBy(xpath = "//select[@id='file_exist']")
    WebElement clickKetersediaanFileAda;
    @FindBy(xpath = "//input[@id='file']")
    WebElement uploadFile;
    @FindBy(xpath = "//select[@id='share']")
    WebElement dropDownShareYa;
    @FindBy(xpath = "//input[@value=' cvbcvcnvb']")
    WebElement checkBoxShareYa;
    @FindBy(xpath = "//button[@id='singlebutton']")
    WebElement btnSimpan;
    @FindBy(xpath = "//button[@id='btnFilter']")
    WebElement btnFilter;
    @FindBy(xpath ="//select[@name='vintdoc_length']")
    WebElement btnShorting;

    @FindBy(xpath = "//td[normalize-space()='1']")
    WebElement iconPlus;
    @FindBy(xpath ="//i[@class='fa fa-md fa-search']")
    WebElement btnView;
    @FindBy(xpath ="//span[@class='btn btn-xs btn-warning']")
    WebElement btnEdit;
    @FindBy(xpath ="//span[@class='btn btn-xs btn-primary']")
    WebElement btnViewFile;
    @FindBy(xpath ="//button[@id='delfilego']")
    WebElement btnHapus;

    @FindBy(xpath ="//span[@class='glyphicon glyphicon-remove']")
    WebElement iconSilang;

    @FindBy(xpath = "//h1[normalize-space()='Dokumen Internal']")
    WebElement getTxtDokumentInternal;
    @FindBy(xpath = "//h1[normalize-space()='Internal Dokumen']")
    WebElement getTxtInternalDokumen;
    @FindBy(xpath = "//td[@class='dataTables_empty']")
    WebElement txtNoDataAvailableInTable;
    @FindBy(xpath = "//b[normalize-space()='Data berhasil di saved!']")
    WebElement getTxtDataBerhasilDiSaved;
    @FindBy(xpath = "//b[normalize-space()='Data berhasil di update!']")
    WebElement getTxtDataBerhasilDiUpdate;
    @FindBy(xpath = "//td[normalize-space()='25']")
    WebElement txtShowingEntries25;
    @FindBy(xpath = "//td[normalize-space()='50']")
    WebElement txtShowingEntries50;
    @FindBy(xpath = "//td[normalize-space()='100']")
    WebElement txtShowingEntries100;
    @FindBy(xpath = "//h3[@class='box-title']")
    WebElement textViewData;

    public void clickBtnInternalDokumen() {
        btnInternalDokumen.click();
    }

    public String getTxtDokumenInternal() {
        return getTxtDokumentInternal.getText();
    }

    public String getTxtInternalDokumen() {
        return getTxtInternalDokumen.getText();
    }
    public String getTxtNoDataAvailableInTable() {
        return txtNoDataAvailableInTable.getText();
    }
    public String getTxtDataBerhasilDiSaved() {
        return getTxtDataBerhasilDiSaved.getText();
    }
    public String getTxtDataBerhasilDiUpdate() {
        return getTxtDataBerhasilDiUpdate.getText();
    }

    public String getTextViewData() {
        return textViewData.getText();
    }
    public String getTextShowing25() {
        return txtShowingEntries25.getText();
    }
    public String getTextShowing50() {
        return txtShowingEntries50.getText();
    }
    public String getTextShowing100() {
        return txtShowingEntries100.getText();
    }
    public void clickBtnInputData() {
        btnInputData.click();
    }

    public void clickDropDownTemplateInternal() {
        inputDropDownTemplateInternal.click();
        inputDropDownTemplateInternal.sendKeys("USER1_TEMPLATE");
    }

    public void clickDropDownGroupDokumen() {
        inputDropDownGroupDokumen.click();
        inputDropDownGroupDokumen.sendKeys("USER DOKUMEN - USER2023");
    }
    public void clickKetersediaanFileBelumAda() {
        clickKetersediaanFileBelumAda.sendKeys("Belum Ada");
    }
    public void clickKetersediaanFileAda() {
        clickKetersediaanFileAda.sendKeys("Ada");
    }

    public void clickBtnShorting25() {
        btnShorting.sendKeys("25");
    }
    public void clickBtnShorting50() {
        btnShorting.sendKeys("50");
    }
    public void clickBtnShorting100() {
        btnShorting.sendKeys("100");
    }

    public void inputNomorDokumen() {
        inputNomorDokumen.sendKeys(DriverSingleton.randomString());
    }

    public void inputNomorDokumenFilter() {
        inputNomorDokumenFilter.sendKeys("USER1_TEMPLATE_2023ESLZHSC");
    }
    public void inputNamaDokumen() {
        inputNamaDokumen.click();
        inputNamaDokumen.sendKeys("USER1_NAMA_DOKUMEN");
    }

    public void inputDeskripsiDokumen() {
        inputDeskripsiDokumen.click();
        inputDeskripsiDokumen.sendKeys("user deskipsi dokumen 2023");
    }

    public void clickStartDate() {
        clickStartDate.click();
        clickStartDate.sendKeys("2023-09-05");
    }

    public void clickEndDate() {
        clickEndDate.click();
        clickEndDate.sendKeys("2023-09-07");
    }

    public void inputOwnerDokumen() {
        inputOwnerDokumen.click();
        inputOwnerDokumen.sendKeys("User Owner");
    }

    public void clickDokumenDate() {
        clickDokumenDate.click();
        clickDokumenDate.sendKeys("2023-09-09");
    }

    public void clickLokasiArsip() {
        clickLokasiArsip.click();
        clickLokasiArsip.sendKeys("gudang data");
    }

    public void clickReminderDate() {

        clickReminderDate.sendKeys("2023-09-10");
    }

    public void clickDropDownJenisMedia() {
        clickDropDownJenisMedia.sendKeys("Digital");
    }
    public void clickBtnFilter() {
        btnFilter.click();
    }

    public void uploadFile() {
        String currentDirectory = System.getProperty("user.dir");
        String relativeFilePath = "contoh\\Astra_International_Test.pdf";
        String fullPath = currentDirectory + "\\" + relativeFilePath;
        uploadFile.sendKeys(fullPath);
    }

    public void dropDownShareYa() {
        Select objSelect = new Select(driver.findElement(By.id("share")));
        objSelect.selectByValue("1");
    }

    public void dropDownShareTidak() {
        Select objSelect = new Select(driver.findElement(By.id("share")));
        objSelect.selectByValue("0");
    }

    public void checkBoxShareYa() {
        checkBoxShareYa.click();
    }

    public String alertInternal(){
       String required = inputDropDownTemplateInternal.getAttribute("required");
       return required;
    }
    public void btnSimpan() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,3000)");
        btnSimpan.click();
    }
    public void iconPlus() {
        iconPlus.click();
    }

    public void btnView() {
        btnView.click();
    }
    public void btnEdit() {
        btnEdit.click();
    }
    public void btnViewFile() {


        driver.findElement(By.xpath("//span[@class='btn btn-xs btn-primary']")).click();
        ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTb.get(1));
        String page = driver.getTitle();
        System.out.println(page);
        delay(5);
        driver.close();
        driver.switchTo().window(newTb.get(0));
        String pageKosong = driver.getTitle();
        System.out.println(pageKosong);
    }
    public void btnHapus() {
        btnHapus.click();
    }
    public void  iconSilang() {
        iconSilang.click();
    }
    public void delay(long sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}

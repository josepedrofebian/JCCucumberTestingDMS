package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterLokasiPenyimpananPage {
    private WebDriver driver; // atribut kelas HomePage

    public MasterLokasiPenyimpananPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//span[normalize-space()='Data Master']")
    WebElement sideBarMasterData;
    @FindBy(xpath = "//a[normalize-space()='Lokasi Penyimpanan']")
    WebElement sideBarLokasiPenyimpanan;
    @FindBy(xpath = "//h1[normalize-space()='Data Lokasi Arsip']")
    WebElement txtDataLokasiArsip;
    @FindBy(xpath = "//input[@name='katakunci']")
    WebElement fieldSearch;
    @FindBy(xpath = "//i[@class='glyphicon glyphicon-search']")
    WebElement buttonSearch;
    @FindBy(xpath = "//td[normalize-space()='test']")
    WebElement txtResultSearch;
    @FindBy(xpath = "//button[normalize-space()='Input Data']")
    WebElement btnInputData;
    @FindBy(xpath ="//input[@id='nama']")
    WebElement inputDataField;
    @FindBy(xpath ="//div[@id='addlok']//button[@type='button'][normalize-space()='Close']")
    WebElement btnClose;
    @FindBy(xpath ="//button[@id='addlokgo']")
    WebElement btnSimpan;
    @FindBy(xpath ="//div[@id='addlok']//span[@aria-hidden='true'][normalize-space()='×']")
    WebElement btnX;
    @FindBy(xpath ="//div[@id='addlok']//h4[@class='modal-title'][normalize-space()='Tambah Data']")
    WebElement textModalTitleTambahData;
    @FindBy(xpath = "//div[@id='editlok']//h4[@class='modal-title'][normalize-space()='Update Data']")
    WebElement textModalTitleEditData;
    @FindBy(xpath = "(//div[@class='form-group has-error'])[1]")
    WebElement textErrorMessage;
    @FindBy(xpath = "//a[@id='21']//span[@class='btn btn-xs btn-warning'][normalize-space()='Edit']")
    WebElement btnEdit;
    @FindBy(xpath = "//input[@id='enama']")
    WebElement editDataField;
    @FindBy(xpath = "//div[@id='editlok']//h4[@class='modal-title'][normalize-space()='Update Data']")
    WebElement txtUpdateData;
    @FindBy(xpath = "//div[@id='editlok']//button[@type='button'][normalize-space()='Close']")
    WebElement btnCloseEdit;
    @FindBy(xpath = "//button[@id='edkode']")
    WebElement btnSimpanEdit;
    @FindBy(xpath = "//div[@id='editlok']//span[@aria-hidden='true'][normalize-space()='×']")
    WebElement btnXEdit;
    public void clickButtonXInput(){
        btnX.click();
    }
    public String getTextModalTitleTambahData(){
        return textModalTitleTambahData.getText();
    }
    public String getTextModalTitleEditData(){
        return textModalTitleEditData.getText();
    }
    public void clickInputData(){
        btnInputData.click();
    }
    public void inputDataNamaLokasi(String name){
        inputDataField.sendKeys(name);
    }
    public void clickButtonCloseInput(){
        btnClose.click();
    }
    public void clickButtonSimpanInput(){
        btnSimpan.click();
    }
    public String getAlertText(){
        return driver.switchTo().alert().getText();
    }
    public void clickSideBarMasterData(){
        sideBarMasterData.click();
    }
    public void clickSideBarLokasiPenyimpanan(){
        sideBarLokasiPenyimpanan.click();
    }
    public String getTextDataLokasiArsip(){
        return txtDataLokasiArsip.getText();
    }
    public void inputFieldSearch(String input){
        fieldSearch.sendKeys(input);
    }
    public void clickButtonSearch(){
        buttonSearch.click();
    }
    public String getTextResultSearch(){
        return txtResultSearch.getText();
    }
    public String getTextErrorMessage(){
        return textErrorMessage.getText();
    }
    public void clickButtonEdit(){
        btnEdit.click();
    }
    public void editDataField(String name){
        editDataField.sendKeys(name);
    }
    public void clickButtonXEdit(){
        btnXEdit.click();
    }
    public void clickButtonCloseEdit(){
        btnCloseEdit.click();
    }
    public void clickButtonSimpanEdit(){
        btnSimpanEdit.click();
    }
}

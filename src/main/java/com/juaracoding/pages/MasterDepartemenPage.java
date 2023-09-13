package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterDepartemenPage {
    private WebDriver driver; // atribut kelas LoginPage

    public MasterDepartemenPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //Locator @FindBy

    @FindBy(xpath = "//i[@class='fa fa-angle-left pull-right']")
    WebElement btnScrollDown;

    @FindBy(xpath = "//h1[normalize-space()='Data Departemen']")
    WebElement txtDepartement;

    @FindBy(xpath = "//input[@name='katakunci']")
    WebElement searchDepartementField;

    @FindBy(xpath = "//i[@class='glyphicon glyphicon-search']")
    WebElement btnSearchDepartement;

    @FindBy(xpath = "//button[normalize-space()='Input Data']")
    WebElement btnInputDepartement;

    @FindBy(xpath = "//form[@id='form']//input[@id='nama']")
    WebElement inputFieldDepartemen;

    @FindBy(xpath = "//button[@id='adddept']")
    WebElement btnAddDepartement;

    @FindBy(xpath = "//a[@id='178']//span[@class='btn btn-xs btn-warning'][normalize-space()='Edit']")
    WebElement btnEditDepartement;

    @FindBy(xpath = "//button[@id='eddept']")
    WebElement btnSaveEditDepartement;

    @FindBy(xpath = "//div[@id='addpenc']//button[@type='button'][normalize-space()='Close']")
    WebElement btnCancelInputDepartement;

    @FindBy(xpath = "//div[@id='addpenc']//h4[@class='modal-title'][normalize-space()='Tambah Data']")
    WebElement txtTitleTambahData;

    @FindBy(xpath ="//div[@id='addlok']//button[@type='button'][normalize-space()='Close']")
    WebElement btnClose;

    @FindBy(xpath = "//div[@id='editdept']//button[@type='button'][normalize-space()='Close']")
    WebElement btnCancelEditDepartement;

    @FindBy(xpath = "//div[@id='editdept']//span[@aria-hidden='true'][normalize-space()='×']")
    WebElement btnXEditDepartement;

    @FindBy(xpath = "//div[@id='addpenc']//span[@aria-hidden='true'][normalize-space()='×']")
    WebElement btnXInputDepartement;

    @FindBy(xpath = "//div[@id='addpenc']//span[@aria-hidden='true'][normalize-space()='×']")
    WebElement btnHome;

    @FindBy(xpath = "//a[normalize-space()='Departemen']")
    WebElement sideBarDepartemen;

    @FindBy(xpath = "//span[normalize-space()='Data Master']")
    WebElement sideBarMasterData;

    @FindBy(xpath = "//h1[normalize-space()='Data Departemen']")
    WebElement txtDataDepartemen;

    @FindBy(xpath = "//td[normalize-space()='Legall']")
    WebElement txtResultSearch;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")
    WebElement editDataField;

    @FindBy(xpath = "//form[@id='form']//span[@class='help-block'][normalize-space()='Nama harus diisi']")
    WebElement textErrorMessage;

    @FindBy(xpath = "//div[@id='addpenc']//div[@class='modal-header']")
    WebElement txtModalTitleTambahData;

    @FindBy(xpath = "//form[@id='form']//span[@class='help-block'][normalize-space()='Nama Departemen sudah ada']")
    WebElement textErrorMessageSudahAda;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/span[1]")
    WebElement textErrorMessageEditDepartemenSudahAda;

    public void clickInputData(){
        btnInputDepartement.click();
    }

    public void clickBtnCloseInput(){
        btnCancelInputDepartement.click();
    }

    public void clickXInputDepartement(){
        btnXInputDepartement.click();
    }

    public void clickBtnSimpanInput(){
        btnAddDepartement.click();
    }

    public String getAlertText(){
        return driver.switchTo().alert().getText();
    }

    public void clickSideBarMasterData(){
        sideBarMasterData.click();
    }

    public void clickSideBarDepartement(){
        sideBarDepartemen.click();
    }

    public String getTextDataDepartemen() {
        return txtDataDepartemen.getText();
    }

    public void inputFieldSearch(String input){
        searchDepartementField.sendKeys(input);
    }

    public void inputDataNamaDepartemen(String name){
        inputFieldDepartemen.sendKeys(name);
    }

    public void clearInputFieldSearch(){
        searchDepartementField.clear();
    }

    public void clickBtnSearch(){
        btnSearchDepartement.click();
    }

    public String getTextResultSearch(){
        return txtResultSearch.getText();
    }

    public String getTextErrorMessage(){
        return textErrorMessage.getText();
    }

    public String getTextErrorMessageSudahAda(){
        return textErrorMessageSudahAda.getText();
    }

    public void clickButtonEdit(){
        btnEditDepartement.click();
    }

    public void editDataField(String name){
        editDataField.sendKeys(name);
    }

    public void clearEditDataField() {
        editDataField.clear();
    }

    public String isRequiredEditDepartemenField(){
        return textErrorMessageEditDepartemenSudahAda.getText();
    }

    public void clickBtnXEdit(){
        btnXEditDepartement.click();
    }

    public void clickBtnCancelEdit(){
        btnCancelEditDepartement.click();
    }

    public void clickBtnSimpanEdit(){
        btnSaveEditDepartement.click();
    }

    public void clickIconHome(){
        btnHome.click();
    }

    public String getTextModalTitleTambahData(){
        return txtTitleTambahData.getText();
    }
}

package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterGroupDokumenPage {
    private WebDriver driver;

    public MasterGroupDokumenPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//span[normalize-space()='Data Master']")
    WebElement sideBarDataMaster;
    @FindBy(xpath = "//a[normalize-space()='Group Dokumen']")
    WebElement sideBarGroupDokumen;
    @FindBy(xpath = "//h1[normalize-space()='Group Documents']")
    WebElement txtTitleGroupDocuments;
    @FindBy(xpath = "//input[@name='katakunci']")
    WebElement fieldSearch;
    @FindBy(xpath = "//i[@class='glyphicon glyphicon-search']")
    WebElement btnIconSearch;
    @FindBy(xpath = "//button[normalize-space()='Input Data']")
    WebElement btnInputData;
    @FindBy(xpath = "//input[@id='adkode']")
    WebElement fieldInputDataKode;
    @FindBy(xpath = "//input[@id='nama']")
    WebElement fieldInputDataNama;
    @FindBy(xpath = "//input[@id='retensi']")
    WebElement fieldInputDataRetensi;
    @FindBy(xpath = "//div[@id='addkode']//button[@type='button'][normalize-space()='Close']")
    WebElement btnInputDataClose;
    @FindBy(xpath = "//button[@id='addkode']")
    WebElement btnInputDataSimpan;
    @FindBy(xpath = "//div[@id='addkode']//span[@aria-hidden='true'][normalize-space()='×']")
    WebElement btnInputDataX;
    @FindBy(xpath = "(//td[contains(text(),'logistikkk')])[1]")
    WebElement txtResultOfSearch;
    @FindBy(xpath = "//td[normalize-space()='gggggggg']")
    WebElement txtResultOfGroupDocuments;

    public void clickSideBarDataMaster(){
        sideBarDataMaster.click();
    }
    public void clickSideBarGroupDokumen(){
        sideBarGroupDokumen.click();
    }
    public String getTextTitleGroupDokumen(){
        return txtTitleGroupDocuments.getText();
    }
    public void inputFieldSearch(String input){
        fieldSearch.sendKeys(input);
    }
    public void clearInputFieldSearch(){
        fieldSearch.clear();
    }
    public void clickButtonIconSearch(){
        btnIconSearch.click();
    }
    public void clickButtonInputData(){
        btnInputData.click();
    }
    public void inputFieldInputDataKode(String input){
        fieldInputDataKode.sendKeys(input);
    }
    public void inputFieldInputDataNama(String input){
        fieldInputDataNama.sendKeys(input);
    }
    public void inputFieldInputDataRetensi(String input){
        fieldInputDataRetensi.sendKeys(input);
    }
    public void clickButtonInputDataClose(){
        btnInputDataClose.click();
    }
    public void clickButtonInputDataSimpan(){
        btnInputDataSimpan.click();
    }
    public void clickButtonInputDataX(){
        btnInputDataX.click();
    }
    public String getTextResultOfSearch(){
        return txtResultOfSearch.getText();
    }
    public String getTextResultOfDocuments(){
        return txtResultOfGroupDocuments.getText();
    }
}

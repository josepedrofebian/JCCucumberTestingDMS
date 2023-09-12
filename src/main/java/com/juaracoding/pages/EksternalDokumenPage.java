package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EksternalDokumenPage {

    private WebDriver driver;

    public EksternalDokumenPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//body[1]/div[1]/aside[1]/section[1]/ul[1]/li[5]/a[1]")
    WebElement sideBarEksternalDokumen;
    @FindBy(xpath = "(//h1[normalize-space()='Dokumen Eksternal'])[1]")
    WebElement txtTitleEksternalDokumen;
    @FindBy(xpath = "//input[@id='nodokext']")
    WebElement fieldNomorDokumenSearch;
    @FindBy(xpath = "//input[@id='nama']")
    WebElement fieldNamaDokumenSearch;
    @FindBy(xpath = "//button[@id='btnFilter']")
    WebElement btnFilter;
    @FindBy(xpath = "//td[normalize-space()='045/PKS/DIKA-BCA DIGITAL/IX/2022']")
    WebElement txtResultOfSearch;
    @FindBy(xpath = "//button[normalize-space()='Input Data']")
    WebElement buttonInputData;
    @FindBy(xpath = "//h1[normalize-space()='Eksternal Dokumen']")
    WebElement txtTitleInputDataEksternal;
    @FindBy(xpath = "//input[@id='nadoc']")
    WebElement fieldInputNamaDokumen;
    @FindBy(xpath = "//input[@id='namaklien']")
    WebElement fieldInputNamaKlien;
    @FindBy(xpath = "//input[@id='diterbitkan']")
    WebElement fieldDiterbitkanOleh;
    @FindBy(xpath = "//textarea[@id='deskripsi']")
    WebElement fieldDeskripsi;
    @FindBy(xpath = "//input[@id='owner']")
    WebElement fieldPemilikDokumen;
    @FindBy(xpath = "//input[@id='dibuat']")
    WebElement fieldDibuatOleh;
    @FindBy(xpath = "//input[@id='tim']")
    WebElement fieldTimTerkait;
    @FindBy(xpath = "//input[@id='tgl_terbit']")
    WebElement fieldTanggalMulai;
    @FindBy(xpath = "//input[@id='masa']")
    WebElement fieldTanggalBerakhir;
    @FindBy(xpath = "//input[@id='tgl_reminder']")
    WebElement fieldTanggalReminder;
    @FindBy(xpath = "//button[@id='singlebutton']")
    WebElement btnSimpanInputEksternal;
    @FindBy(xpath = "//b[normalize-space()='Data berhasil di saved!']")
    WebElement txtDataBerhasilDiSaved;
    public String getTextResultOfSearchEksternal(){
        return txtResultOfSearch.getText();
    }
    public void clickButtonFilter(){
        btnFilter.click();
    }
    public void inputFieldNomorDokumenSearch(String input){
        fieldNomorDokumenSearch.sendKeys(input);
    }
    public void inputFieldNamaDokumenSearch(String input){
        fieldNamaDokumenSearch.sendKeys(input);
    }
    public void clickSideBarEksternalDokumen(){
        sideBarEksternalDokumen.click();
    }
    public String getTextTitleEksternalDokumen(){
        return txtTitleEksternalDokumen.getText();
    }
    public void clearFieldSearchEksternal(){
        fieldNomorDokumenSearch.clear();
        fieldNamaDokumenSearch.clear();
    }
    public void clickButtonInputEksternal(){
        buttonInputData.click();
    }
    public String getTextTitleInputDataEksternal(){
        return txtTitleInputDataEksternal.getText();
    }
    public void chooseDropdownTemplateEksternal(){
        Select objSelect = new Select(driver.findElement(By.id("template")));
        objSelect.selectByValue("79");
    }
    public void inputNamaDokumen(String input){
        fieldInputNamaDokumen.sendKeys(input);
    }
    public void inputNamaKlien(String input){
        fieldInputNamaKlien.sendKeys(input);
    }
    public void inputDiterbitkanOleh(String input){
        fieldDiterbitkanOleh.sendKeys(input);
    }
    public void inputDeksripsi(String input){
        fieldDeskripsi.sendKeys(input);
    }
    public void inputPemilikDokumen(String input){
        fieldPemilikDokumen.sendKeys(input);
    }
    public void inputDibuatOleh(String input){
        fieldDibuatOleh.sendKeys(input);
    }
    public void inputTimTerkait(String input){
        fieldTimTerkait.sendKeys(input);
    }
    public void inputTanggalMulai(){
        fieldTanggalMulai.sendKeys("2023-09-10");
    }
    public void inputTanggalBerakhir(){
        fieldTanggalBerakhir.sendKeys("2023-09-10");
    }
    public void inputTanggalReminder(){
        fieldTanggalReminder.sendKeys("2023-09-10");
    }
    public void chooseDropdownMediaEksternal(){
        Select objSelect = new Select(driver.findElement(By.id("media")));
        objSelect.selectByValue("36");
    }
    public void clickButtonSimpanInputEksternal(){
        btnSimpanInputEksternal.click();
    }
    public String getTxtDataBerhasilDiSaved(){
        return txtDataBerhasilDiSaved.getText();
    }
}

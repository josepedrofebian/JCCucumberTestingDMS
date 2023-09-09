package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class HomePage {
    private WebDriver driver;

    public HomePage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    public static String valueInternalDocument = "";
    public static String valueEksternalDocument = "";
    public static String valuePerizinan="";

    @FindBy(xpath = "//a[@href='https://dev.ptdika.com/dokumen/admin/list_internal_dokumen'][normalize-space()='More info']")
    WebElement btnMoreInfoDirectToInternalPage;
    @FindBy(xpath = "//a[@href='https://dev.ptdika.com/dokumen/admin/list_eksternal_dokumen'][normalize-space()='More info']")
    WebElement btnMoreInfoDirectToEksternalPage;
    @FindBy(xpath = "//a[@href='https://dev.ptdika.com/dokumen/admin/list_perizinan'][normalize-space()='More info']")
    WebElement btnMoreInfoDirectToPerizinanPage;
    @FindBy(xpath = "//h1[normalize-space()='Dokumen Internal']")
    WebElement txtDokumenInternal;
    @FindBy(xpath = "//h1[normalize-space()='Dokumen Eksternal']")
    WebElement txtDokumenEksternal;
    @FindBy(xpath = "//h1[normalize-space()='Perizinan']")
    WebElement txtPerizinan;
    @FindBy(xpath = "//span[normalize-space()='Home']")
    WebElement sideBarMenuHome;
    @FindBy(xpath = "//h1[normalize-space()='Home']")
    WebElement txtHome;
    @FindBy(xpath = "//a[contains(text(),'Home')]")
    WebElement iconHome;
    @FindBy(xpath = "//i[@id='jml']")
    WebElement txtValueOfDocuments;
    @FindBy(xpath = "//div[@class='small-box bg-aqua']//div[@class='inner']/h3")
    WebElement txtValueOfDocumentsInCardInternal;
    @FindBy(xpath = "//div[@class='small-box bg-green']//div[@class='inner']/h3")
    WebElement txtValueOfDocumentsInCardEksternal;
    @FindBy(xpath = "//div[@class='small-box bg-yellow']//div[@class='inner']/h3")
    WebElement txtValueOfDocumentsInCardPerizinan;

    public void clickMoreInfoToInternalPage() {
        btnMoreInfoDirectToInternalPage.click();
    }

    public void clickMoreInfoToEksternalPage() {
        btnMoreInfoDirectToEksternalPage.click();
    }

    public void clickMoreInfoToPerizinanPage() {
        btnMoreInfoDirectToPerizinanPage.click();
    }

    public String getTextDokumenEksternal() {
        return txtDokumenEksternal.getText();
    }

    public String getTextDokumenInternal() {
        return txtDokumenInternal.getText();
    }

    public String getTextPerizinan() {
        return txtPerizinan.getText();
    }

    public String getTextHome() {
        return txtHome.getText();
    }

    public void clickSideBarMenuHome() {
        sideBarMenuHome.click();
    }

    public void clickIconHome() {
        iconHome.click();
    }
    public String getTextValueOfDocuments(){return txtValueOfDocuments.getText();}
    public void getTextValueOfDocumentsInCardInternal(){
            valueInternalDocument += txtValueOfDocumentsInCardInternal.getText();
    }
    public String getValueOfCardInternal(){
        return valueInternalDocument;
    }
    public void getTextValueOfDocumentsInCardEksternal(){
        valueEksternalDocument += txtValueOfDocumentsInCardEksternal.getText();
    }
    public String getValueOfCardEksternal(){
        return valueEksternalDocument;
    }
    public void getTextValueOfDocumentsInCardPerizinan(){
        valuePerizinan += txtValueOfDocumentsInCardPerizinan.getText();
    }
    public String getValueOfCardPerizinan(){
        return valuePerizinan;
    }
}

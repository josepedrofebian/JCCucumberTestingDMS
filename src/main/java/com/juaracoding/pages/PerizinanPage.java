package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PerizinanPage {
    private WebDriver driver;

    public PerizinanPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    // List Perizinan
    @FindBy(xpath = "//button[normalize-space()='Input Data']")
    WebElement btnInputData;
    @FindBy(xpath = "//button[normalize-space()='Send Selected Email']")
    WebElement btnSendEmail;
//    @FindBy(xpath = "//tr[@role='row']//td[1]")
//    List<WebElement> listDokumenPerizinan;

    //Pencarian
    @FindBy(xpath = "//input[@id='nodokizin']")
    WebElement cariNoPerizinan;
    @FindBy(xpath = "//input[@id='nama']")
    WebElement cariNamaPerizinan;
    @FindBy(xpath = "//select[@id='dept_id']")
    WebElement cariDepartemen;
    @FindBy(xpath = "//select[@id='file_exist']")
    WebElement cariKetersediaan;
    @FindBy(xpath = "//button[@id='btnFilter']")
    WebElement btnFilter;

    //Header
    @FindBy(xpath = "//span[normalize-space()='Perizinan']")
    WebElement menuPerizinan;
    @FindBy(xpath = "//li[contains(text(),'Perizinan')]")
    WebElement txtListPerizinan;
    @FindBy(xpath = "//li[normalize-space()='Input Perizinan']")
    WebElement txtInputPerizinan;


    public void clickMenuPerizinan(){
        menuPerizinan.click();
    }
    public void clickBtnInputData(){
        btnInputData.click();
    }

    public String getTxtListPerizinan(){
        return txtListPerizinan.getText();
    }
    public String getTxtInputPerizinan() {
        return txtInputPerizinan.getText();
    }


}

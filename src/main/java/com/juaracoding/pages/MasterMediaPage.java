package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterMediaPage {

    static WebDriver driver;
    public MasterMediaPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//button[normalize-space()='Input Data'])[1]")
    WebElement btnInputData;
    @FindBy(xpath = "i[@class='glyphicon glyphicon-search']")
    WebElement ikonSearch;
    @FindBy(xpath = "a[@id='26']//span[@class='btn btn-xs btn-warning'][normalize-space()='Edit']")
    WebElement btnEdit;
    @FindBy(xpath = "//button[@id='addmedgo']")
    WebElement btnSimpan;
    @FindBy(xpath = "//div[@id='addmed']//button[@type='button'][normalize-space()='Close']")
    WebElement btnClose;
    @FindBy(xpath = "//a[normalize-space()='Media']")
    WebElement sidebarMasterMenu;
    @FindBy(xpath = "//span[normalize-space()='Data Master']")
    WebElement masterData;
    @FindBy(xpath = "//input[@id='nama']")
    WebElement inputNama;

    @FindBy(xpath = "//h1[normalize-space()='Data Media Arsip']")
    WebElement txtDataMediaArsip;


    public void clickButtonInputData()
    {
        btnInputData.click();
    }
    public void clickButtonEdit()
    {
        btnEdit.click();
    }
    public void clickButtonSimpan()
    {
        btnSimpan.click();
    }
    public void clickButtonClose()
    {
        btnClose.click();
    }
    public void clickIkonSearch()
    {
        ikonSearch.click();
    }
    public void clickSidebarMaster()
    {
        sidebarMasterMenu.click();
    }

    public void clickDataMaster()
    {
        masterData.click();
    }
    public void userInputNama(String input)
    {
        inputNama.sendKeys(input);
    }
    public String getTxtDataMediaArsip()
    {
        return txtDataMediaArsip.getText();
    }

}
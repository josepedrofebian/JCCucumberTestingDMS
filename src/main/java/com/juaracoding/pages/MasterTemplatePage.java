package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.juaracoding.drivers.DriverSingleton.delay;

public class MasterTemplatePage {
static WebDriver driver;
    public MasterTemplatePage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//span[normalize-space()='Data Master']")
    WebElement sideBarDataMaster;
    @FindBy(xpath = "//a[normalize-space()='Template']")
    WebElement sideBarTemplate;
    @FindBy(xpath = "//input[@name='katakunci']")
    WebElement fieldSearch;
    @FindBy(xpath = "//i[@class='glyphicon glyphicon-search']")
    WebElement iconSearch;
    @FindBy(xpath = "//h1[normalize-space()='Data Template Nomor Surat']")
    WebElement textDataTemplateNomorSurat;
    @FindBy(xpath = "//td[normalize-space()='BD1']")
    WebElement txtResultSearch;
    @FindBy(xpath = "//button[normalize-space()='Input Data']")
    WebElement btnInputData;
    @FindBy(xpath = "//input[@id='nama']")
    WebElement fieldNamaTemplate;
    @FindBy(xpath = "//input[@id='nomor']")
    WebElement fieldFormatNomorSurat;
    @FindBy(xpath = "//input[@id='enama']")
    WebElement fieldNamaTemplateEdit;
    @FindBy(xpath = "//input[@id='enomor']")
    WebElement fieldFormatNomorSuratEdit;
    @FindBy(xpath = "//button[@id='addtempgo']")
    WebElement btnSimpan;
    @FindBy(xpath = "//button[@id='editusergo']")
    WebElement btnSimpanEdit;
    @FindBy(xpath = "//div[@id='addtemp']//button[@type='button'][normalize-space()='Close']")
    WebElement btnClose;
    @FindBy(xpath = "//div[@id='addtemp']//span[@aria-hidden='true'][normalize-space()='×']")
    WebElement btnX;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/a[1]/span[1]")
    WebElement btnEdit;
    @FindBy(xpath = "//div[@id='editemp']//button[@type='button'][normalize-space()='Close']")
    WebElement btnCloseEdit;
    @FindBy(xpath = "//div[@id='editemp']//span[@aria-hidden='true'][normalize-space()='×']")
    WebElement btnXEdit;

    public void clickSideBarDataMaster(){sideBarDataMaster.click();}
    public void clickSideBarTemplate(){
        sideBarTemplate.click();
    }
    public String getTextTitleTemplatePage(){
        return textDataTemplateNomorSurat.getText();
    }
    public void inputFieldSearch(String input){fieldSearch.sendKeys(input);}
    public void clickIconSearch(){iconSearch.click();}
    public String getTextResultSearch(){return txtResultSearch.getText();}
    public void clearInputFieldSearch(){fieldSearch.clear();}
    public void clickButtonSearch(){
        iconSearch.click();
    }
    public void clickInputData(){btnInputData.click();}
    public void kategoryChooseInternal(){
        delay(5);
        Select objSelect = new Select(driver.findElement(By.id("kategori")));
        delay(5);
        objSelect.selectByValue("internal");
    }
    public void kategoryChooseEksternal(){
        delay(5);
        Select objSelect = new Select(driver.findElement(By.id("kategori")));
        delay(5);
        objSelect.selectByValue("eksternal");
    }
    public void departementChooseBusinessDevelopment(){
        Select objSelect = new Select(driver.findElement(By.id("departemen")));
        objSelect.selectByValue("Business Development");
    }
    public void departementChooseDireksi(){
        Select objSelect = new Select(driver.findElement(By.id("departemen")));
        objSelect.selectByValue("Direksi");
    }
    public void departementChooseHRD(){
        Select objSelect = new Select(driver.findElement(By.id("departemen")));
        objSelect.selectByValue("HRD");
    }
    public void inputFieldNamaTemplate(String name){
        fieldNamaTemplate.sendKeys(name);
    }
    public void inputFieldFormatNomorSurat(String nomor){
        fieldFormatNomorSurat.sendKeys(nomor);
    }
    public void clickButtonSimpanTambahData(){
        btnSimpan.click();
    }
    public String getAlertText(){
        return driver.switchTo().alert().getText();
    }
    public void closeModalInputDataTemplateWithButtonClose(){
        btnClose.click();
    }
    public void closeModalInputDataTemplateWithButtonX(){
        btnX.click();
    }
    public void kategoryChooseInternalEdit(){
        delay(10);
        Select objSelect = new Select(driver.findElement(By.id("ekategori")));
        delay(10);
        objSelect.selectByValue("internal");
    }
    public void kategoryChooseEksternalEdit(){
        delay(10);
        Select objSelect = new Select(driver.findElement(By.id("ekategori")));
        delay(10);
        objSelect.selectByValue("eksternal");
    }
    public void departementChooseDireksiEdit(){
        Select objSelect = new Select(driver.findElement(By.id("edepartemen")));
        objSelect.selectByValue("Direksi");
    }
    public void departementChooseHRDEdit(){
        Select objSelect = new Select(driver.findElement(By.id("edepartemen")));
        objSelect.selectByValue("HRD");
    }
    public void departementChooseBusinessDevelopmentEdit(){
        Select objSelect = new Select(driver.findElement(By.id("edepartemen")));
        objSelect.selectByValue("Business Development");
    }
    public void inputFieldNamaTemplateEdit(String name){
        fieldNamaTemplateEdit.clear();
        fieldNamaTemplateEdit.sendKeys(name);
    }
    public void inputFieldFormatNomorSuratEdit(String nomor){
        fieldFormatNomorSuratEdit.clear();
        fieldFormatNomorSuratEdit.sendKeys(nomor);
    }
    public void clickButtonSimpanEditData(){
        btnSimpanEdit.click();
    }
    public void clickButtonEdit(){
        btnEdit.click();
    }
    public void clickButtonCloseEdit(){
        btnCloseEdit.click();
    }
    public void clickButtonXEdit(){
        btnXEdit.click();
    }


}

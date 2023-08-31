package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
    private WebDriver driver; // atribut kelas LoginPage

    public LoginPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    // Locator @FindBy
    @FindBy(xpath = "//input[@id='username']")
    WebElement username;
    @FindBy(xpath = "//input[@id='password']")
    WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnLogin;
    @FindBy(xpath = "//b[normalize-space()='DIKA | DOKUMEN']")
    WebElement txtLoginPage;
    @FindBy(xpath = "//h1[normalize-space()='404 Page Not Found']")
    WebElement txt404NotFound;
    // Custom Method
    public void login(String username, String password){
        try {
            this.username.clear();
            this.password.clear();
        }catch (Exception ignored){
        }
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        btnLogin.click();
    }
    public String getTextLoginPage(){
        return txtLoginPage.getText();
    }
    public String getErrorText404NotFound(){
        return txt404NotFound.getText();
    }
}

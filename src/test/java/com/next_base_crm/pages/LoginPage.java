package com.next_base_crm.pages;

import com.next_base_crm.utilities.ConfigurationReader;
import com.next_base_crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(name = "USER_LOGIN")
    public WebElement userName;

    @FindBy(xpath="//input[@name='USER_PASSWORD']")
    public WebElement userPassword;

    @FindBy(xpath="//input[@class='login-btn']")
    public WebElement loginButton;

    @FindBy (xpath = "//span[.='Send message …']")
    public WebElement messageField;

    @FindBy(xpath = "//a[@title='Mail']")
    public WebElement mailtab;

    @FindBy(xpath = "//body[@style='min-height: 184px;']")
    public WebElement bodyField;


    public void Hr_login(){
        this.userName.sendKeys(ConfigurationReader.getProperty("username_hr1"));
        this.userPassword.sendKeys(ConfigurationReader.getProperty("password"));
        this.loginButton.click();
    }
    public void marketing_login(){
        this.userName.sendKeys(ConfigurationReader.getProperty("username_marketing"));
        this.userPassword.sendKeys(ConfigurationReader.getProperty("password"));
        this.loginButton.click();
    }
    public void helpDesk_login(){
        this.userName.sendKeys(ConfigurationReader.getProperty("username_help_desk"));
        this.userPassword.sendKeys(ConfigurationReader.getProperty("password"));
        this.loginButton.click();
    }


}

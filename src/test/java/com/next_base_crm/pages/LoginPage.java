package com.next_base_crm.pages;

import com.next_base_crm.utilities.ConfigurationReader;
import com.next_base_crm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "USER_LOGIN")
    public WebElement userName;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement userPassword;

    @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement loginButton;

    @FindBy(xpath = "//span[.='Send message …']")
    public WebElement messageField;

    @FindBy(xpath = "//a[@title='Mail']")
    public WebElement mailtab;

    @FindBy(xpath = "//body[@style='min-height: 184px;']")
    public WebElement bodyField;

    @FindBy(xpath = "//div[.='Incorrect login or password']")
    public WebElement IncorrocetLoginOrPassword;

    @FindBy(xpath = "//label[@class='login-item-checkbox-label']")
    public WebElement rememberMe;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement bulletSign;

    @FindBy(xpath = "//span[@class='user-name']")
    public WebElement userNameDropDown;

    @FindBy(xpath = "//span[.='Log out']")
    public WebElement logOutButton;

    @FindBy(xpath = "//div[@id='left-menu-more-btn']")
    public WebElement moreDropdownButton;

    @FindBy(xpath = "//a[@title='Applications']")
    public WebElement applicationButton;

    @FindBy(xpath = "//span[@class='menu-popup-item-text']")
    public List<WebElement> profilOptions;

//        public List<WebElement> options() {
//
//        return actualOption;
//
//    }

    public void Hr_login() {
        this.userName.sendKeys(ConfigurationReader.getProperty("username_hr1"));
        this.userPassword.sendKeys(ConfigurationReader.getProperty("password"));
        this.loginButton.click();
    }

    public void marketing_login() {
        this.userName.sendKeys(ConfigurationReader.getProperty("username_marketing"));
        this.userPassword.sendKeys(ConfigurationReader.getProperty("password"));
        this.loginButton.click();
    }

    public void helpDesk_login() {
        this.userName.sendKeys(ConfigurationReader.getProperty("username_help_desk"));
        this.userPassword.sendKeys(ConfigurationReader.getProperty("password"));
        this.loginButton.click();
    }


}

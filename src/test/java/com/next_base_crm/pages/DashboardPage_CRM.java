package com.next_base_crm.pages;

import com.next_base_crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage_CRM {
    public DashboardPage_CRM(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

        // Login

    @FindBy(name = "USER_LOGIN")
    public WebElement userName;

    @FindBy(xpath="//input[@name='USER_PASSWORD']")
    public WebElement userPassword;

    @FindBy(xpath="//input[@class='login-btn']")
    public WebElement loginButton;




        // Dashboard
    @FindBy(xpath="//span[@id='user-name']")
    public WebElement userDropdown;

    @FindBy(xpath="//*[@id=\"popup-window-content-menu-popup-user-menu\"]/div/div/a[1]")
    public WebElement profile;

    @FindBy(xpath="//*[@id=\"profile-menu-filter\"]/a[1]")
    public WebElement general;

    @FindBy(xpath="//*[@id=\"profile-menu-filter\"]/a[2]")
    public WebElement drive;

    @FindBy(xpath="//*[@id=\"profile-menu-filter\"]/a[3]")
    public WebElement tasks;

    @FindBy(xpath="//*[@id=\"profile-menu-filter\"]/a[4]")
    public WebElement calendar;

    @FindBy(xpath="//*[@id=\"profile-menu-filter\"]/a[5]")
    public WebElement conversations;

    @FindBy(xpath="//*[@id=\"pagetitle\"]")
    public WebElement emailUnderGeneral;

}

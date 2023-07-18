package com.next_base_crm.pages;

import com.next_base_crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Ac {
    public LoginPage_Ac(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath="//input[@placeholder=\"Login\" ]")
    public WebElement loginField;
    @FindBy(xpath="//input[@placeholder=\"Password\" ]")
    public WebElement passwordField;
    @FindBy(xpath="//input[@type=\"submit\" ]")
    public WebElement submit;
    public void login(String userName, String password){
        loginField.sendKeys(userName);
        passwordField.sendKeys(password);
        submit.click();
    }
}

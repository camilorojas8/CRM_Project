package com.next_base_crm.runners;

import com.next_base_crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    // Login Verificatin
    @FindBy(name = "USER_LOGIN")
    public WebElement userName;

    @FindBy(xpath="//input[@name='USER_PASSWORD']")
    public WebElement userPassword;

    @FindBy(xpath="//input[@class='login-btn']")
    public WebElement loginButton;




    // Dashboard verification
    @FindBy(xpath="//span[@id='user-name']")
    public WebElement userDropdown;




    public void login(String userName, String userPassword){
        this.userName.sendKeys(userName);
        this.userPassword.sendKeys(userPassword);
        this.loginButton.click();
    }


}

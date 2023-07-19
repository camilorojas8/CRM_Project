package com.next_base_crm.pages;

import com.next_base_crm.utilities.ConfigurationReader;
import com.next_base_crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static java.awt.SystemColor.window;

public class LoginPage {

    public void LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

  /*  @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement usernameBox;

    @FindBy(name = "USER_PASSWORD" )
    public WebElement passwordBox;

    @FindBy(name = "USER_REMEMBER")
    public WebElement rememberBox;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement logInButton;

    public void login(String username, String password){

       usernameBox.sendKeys(username);
       passwordBox.sendKeys(password);
       logInButton.click();

    }
    public void loginDynamic(String userType) {
        userType=userType.replace(" ","_");
        String username= ConfigurationReader.getProperty("username_" + userType);
        String password=ConfigurationReader.getProperty("password" + userType );

        login(username,password);
    }*/



       // Login Verificatin
       @FindBy(name = "USER_LOGIN")
       public WebElement userName;

       @FindBy(xpath="//input[@name='USER_PASSWORD']")
       public WebElement userPassword;

       @FindBy(xpath="//input[@class='login-btn']")
       public WebElement loginButton;






   }





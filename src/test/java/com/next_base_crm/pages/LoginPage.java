package com.next_base_crm.pages;

import com.next_base_crm.utilities.BrowserUtils;
import com.next_base_crm.utilities.ConfigurationReader;
import com.next_base_crm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    //    ....................
    @FindBy(name = "USER_LOGIN")
    public WebElement Usernamebox;
    @FindBy(name = "USER_PASSWORD")
    public WebElement passwordbox;
    @FindBy(xpath = "//input[@type='submit']")
    public WebElement signInButton;
    //@FindBy (id="feed-add-post-form-tab-message")
    @FindBy(xpath = "//*[@id=\"feed-add-post-form-tab-message\"]")
    public WebElement MessageButton;

    @FindBy(xpath = ("//span[@class='bxhtmled-top-bar-btn bxhtmled-button-link']"))

    public WebElement insertButton;
    @FindBy(id = "linkidPostFormLHE_blogPostForm-href")
    public WebElement Linktextfield;
    @FindBy(className = "adm-btn-save")
    public WebElement SaveButton;
    @FindBy(xpath = "//button[@class='ui-btn ui-btn-lg ui-btn-primary']")
    public WebElement SendButton;


    public WebElement dynamicUrl() {
        String url="//a[.='" + ConfigurationReader.getProperty("LinkUrl") + "']";
        WebElement DynamicUrl=Driver.getDriver().findElement(By.xpath(url));
        return DynamicUrl;
    }

    public void multiple_windows_test() {
        WebDriver driver=Driver.getDriver();

        String mainHandle=Driver.getDriver().getWindowHandle();

        for (String each : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(each);

        }


    }
}

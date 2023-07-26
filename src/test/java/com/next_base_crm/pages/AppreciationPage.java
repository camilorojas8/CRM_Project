package com.next_base_crm.pages;

import com.next_base_crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppreciationPage {
    public AppreciationPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath="//span[@id='feed-add-post-form-link-text']")

    public WebElement moreDropDown;

    @FindBy(xpath="//button[@id='blog-submit-button-cancel']")
    public WebElement cancelBtn;

    @FindBy(xpath="//button[@id='blog-submit-button-save']")
    public WebElement submitBtn;

    @FindBy(xpath = "//span[text()='Appreciation']" )
    public WebElement appreciationButton;

    @FindBy(xpath="//a[text()='Add employee'][1]")
    public WebElement recipient;

    @FindBy(xpath="//div[text()='Thank you for your freat work!']")
    public WebElement activityStreamMessage;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement message;
}

package com.next_base_crm.pages;

import com.next_base_crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage_AC {
    public BasePage_AC(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id="feed-add-post-form-link-text")
    public WebElement moreDropdown;
    @FindBy(xpath="//span[text()=\"Appreciation\"]")
    public WebElement Appreciation;
    @FindBy(xpath="//iframe[@class=\"bx-editor-iframe\"]")
    public WebElement iframeAppreciation;
    @FindBy(id="bx-b-uploadfile-blogPostForm")
    public WebElement uploadFilesIcon;
    @FindBy(xpath="//input[@class='diskuf-fileUploader wd-test-file-light-inp ']")
    public WebElement uploadFilesButton;

    @FindBy(xpath="//span[@id=\"check-in-text-n1946\"]")
    public WebElement InsertInTextButton;
    @FindBy(xpath="//td[@class=\"files-del-btn\"]")
    public WebElement crossButton;

    @FindBy(xpath="//table[@class=\"files-list\"]/tbody/tr/td[4]/span")
    public WebElement loadFile;
    @FindBy(xpath="//td[@class='files-info']")
    public WebElement insertInTextButton;

    @FindBy(id="bxid577634329")
    public WebElement TextField;


}

package com.next_base_crm.pages;

import com.next_base_crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ActivityStreamPage {

    public ActivityStreamPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@id='feed-add-post-form-tab']")
    public List<String> actualModules;



    @FindBy(xpath = "//a[@href='/stream/']")
    public WebElement streamPage;

    @FindBy(xpath = "//*[@id=\"feed-add-post-form-tab\"]")
    public List<WebElement> moreModules;

    @FindBy(xpath="//span[@id='feed-add-post-form-link-text']")
    public WebElement moreDropDown;

    @FindBy(xpath = "//span[@class='menu-item-link-text\']")
    public WebElement ActivityStreamPage;


   @FindBy(xpath = "//*[@id=\"popup-window-content-menu-popup-feed-add-post-form-popup\"]/div/div/span[1]/span[2]")
    public WebElement fileDrop;

   @FindBy(xpath = "//*[@id=\"popup-window-content-menu-popup-feed-add-post-form-popup\"]/div/div/span[2]/span[2]")
    public WebElement appraciationDrop;

   @FindBy(xpath = "//*[@id=\"popup-window-content-menu-popup-feed-add-post-form-popup\"]/div/div/span[3]/span[2]")
    public WebElement annocuenmentDrop;

   @FindBy(xpath = "//*[@id=\"popup-window-content-menu-popup-feed-add-post-form-popup\"]/div/div/span[4]/span[2]")
    public WebElement workflow;

}


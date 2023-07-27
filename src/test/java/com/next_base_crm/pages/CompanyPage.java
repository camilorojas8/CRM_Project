package com.next_base_crm.pages;

import com.next_base_crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CompanyPage {

    public CompanyPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@title='Company']")
    public WebElement companyBtn;

    @FindBy(xpath = "//a[@class='main-buttons-item-link']")
    public List<WebElement> allTopModules;

}


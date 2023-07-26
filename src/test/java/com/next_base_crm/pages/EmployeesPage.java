package com.next_base_crm.pages;

import com.next_base_crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EmployeesPage {

    public EmployeesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id=\"bx_left_menu_menu_company\"]/a/span")
    public WebElement employeesButton;

    @FindBy(xpath = "//*[@id=\"top_menu_id_company_3271504278\"]/a/span[2]/span[2]")
    public WebElement companyStructureBttn;

    @FindBy(xpath = "//*[@id=\"top_menu_id_company_342409671\"]/a/span[2]/span[2]")
    public WebElement findEmployeeBttn;

    @FindBy(xpath = "//*[@id=\"top_menu_id_company_2000783151\"]/a/span[2]/span[2]")
    public WebElement telephoneDirectoryBttn;

    @FindBy(xpath = "//*[@id=\"top_menu_id_company_1210526945\"]/a/span[2]/span[2]")
    public WebElement staffChangesBttn;

    @FindBy(xpath = "//*[@id=\"top_menu_id_company_3998073650\"]/a/span[2]/span[2]")
    public WebElement efficiencyReportBttn;

    @FindBy(xpath = "//*[@id=\"top_menu_id_company_1597013884\"]/a/span[2]/span[2]")
    public WebElement honoredEmployeesBttn;

    @FindBy(xpath = "//*[@id=\"top_menu_id_company_1125184122\"]/a/span[2]/span[2]")
    public WebElement birthdaysBttn;

    @FindBy(xpath = "//*[@id=\"top_menu_id_company_27577212\"]/a/span[2]/span[2]")
    public WebElement newPageBttn;

    @FindBy(xpath = "//span[@class='main-buttons-item-text-title']")
    public List<WebElement> allTopModules;

    //Hi


}

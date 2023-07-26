package com.next_base_crm.step_definitions;

import com.next_base_crm.pages.BasePage_AC;
import com.next_base_crm.pages.LoginPage;
import com.next_base_crm.pages.LoginPage_Ac;
import com.next_base_crm.utilities.BrowserUtils;
import com.next_base_crm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CRM_login_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    BasePage_AC basePageAc = new BasePage_AC();

    @Given("user on login page")
    public void user_on_login_page() {
        Driver.getDriver().get("https://qa.nextbasecrm.com/");
        loginPage.Hr_login();
    }

    @When("user press More dropdown")
    public void userPressDropdown() {
        BrowserUtils.sleep(3);
        basePageAc.moreDropdown.click();
    }

    @Then("user choose Appreciation option")
    public void userChooseAppreciationOption() {
        basePageAc.Appreciation.click();
    }

    @Then("user press Upload files icon")
    public void userPressUploadFilesIcon() {
        basePageAc.uploadFilesIcon.click();
        BrowserUtils.sleep(2);
    }

    @Then("user choose Upload: {string}")
    public void userChooseUploadImage(String file) {
        basePageAc.uploadFilesButton.sendKeys(file);
        BrowserUtils.sleep(2);
    }

    @And("user able to see Input in texy button")
    public void userAbleToSeeInputInTexyButton() {
        BrowserUtils.sleep(2);
        Assert.assertTrue(basePageAc.insertInTextButton.isDisplayed());
    }

    @Then("user choose the button Insert in text")
    public void userChooseTheButtonInsertInText() {
        basePageAc.insertInTextButton.click();
    }


    @And("user choose delete icon")
    public void userChooseDeleteIcon() {
        BrowserUtils.sleep(2);
        basePageAc.crossButton.click();
    }

    @Then("user able to see in text on the button")
    public void userAbleToSeeInTextOnTheButton() {
        BrowserUtils.sleep(2);
        Assert.assertTrue(basePageAc.insertInTextButton.getText().contains("In text"));
    }

    @Then("user able to see Insert in text on the button")
    public void userAbleToSeeInsertInTextOnTheButton() {
        BrowserUtils.sleep(2);
        Assert.assertTrue(basePageAc.insertInTextButton.getText().contains("Insert in text"));
    }

    @Then("user able not to see Insert in text on the button")
    public void userAbleNotToSeeInsertInTextOnTheButton() {
        try{
        Assert.assertFalse(basePageAc.insertInTextButton.isDisplayed());
    }catch (NoSuchElementException n){
            System.out.println("Not Displayed");
            Assert.assertTrue(true);
        }
    }
}

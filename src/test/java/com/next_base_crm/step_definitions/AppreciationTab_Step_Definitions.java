package com.next_base_crm.step_definitions;

import com.next_base_crm.pages.AppreciationPage;
import com.next_base_crm.pages.LoginPage;
import com.next_base_crm.utilities.BrowserUtils;
import com.next_base_crm.utilities.ConfigurationReader;
import com.next_base_crm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Map;

public class AppreciationTab_Step_Definitions {
    LoginPage loginPage = new LoginPage();
    private WebDriver driver;
    AppreciationPage appreciation=new AppreciationPage();

    @When("user is logged in")
    public void userIsLoggedIn() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        loginPage.Hr_login();
    }
    @Then("I click on the more tab")
    public void i_click_on_the_more_tab() {
        appreciation.moreDropDown.click();
    }

    @Then("I am able to select the Appreciation tab from the dropdown")
    public void i_am_able_to_select_the_appreciation_tab_from_the_dropdown() {
        appreciation.appreciationButton.click();
    }
    @Then("user sees {string} in the title")
    public void userSeesInTheTitle(String expectedInTitle) {

        BrowserUtils.verifyTitleContains(expectedInTitle);
    }

    @Then("the delivery option should be set to {string} by default")
    public void the_delivery_option_should_be_set_to_by_default(String option) {

    }
    @Then("I enter a message expressing appreciation")
    public void i_enter_a_message_expressing_appreciation() {
        //switch to iframe
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        appreciation.message.sendKeys("Thank you for your great work!");
    }
   /*
    @Then("I enter email of recipient")
    public void i_enter_email_of_recipient() {
       //select from drop down
        Driver.getDriver().switchTo().parentFrame();
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//*[@id=\"tasks-iframe-wrap\"]/iframe")));
        BrowserUtils.waitFor(10);
        appreciation.recipient.click();
        //pop-up
      driver.findElement(By.xpath("//div[text()='hr12@cybertekschool.com']")).click();

    }

    */
    @Then("I click on the {string}")
    public void i_click_on_the(String string) {
        Driver.getDriver().switchTo().parentFrame();
        appreciation.submitBtn.click();
        BrowserUtils.waitFor(10);
    }
    @Then("the appreciation should appear in the Activity Stream.")
    public void the_appreciation_should_appear_in_the_activity_stream() {

        Assert.assertTrue(appreciation.activityStreamMessage.isDisplayed());

    }

    @And("user sees the {string} button")
    public void userSeesTheButton(String arg0) {
        Driver.getDriver().switchTo().parentFrame();
        Assert.assertTrue(appreciation.cancelBtn.isDisplayed());
    }


    @When("I click on the {string} button")
    public void i_click_on_the_button(String string) {
        appreciation.cancelBtn.click();
    }

   /* @Then("the appreciation should not appear in the Activity Stream.")
    public void the_appreciation_should_not_appear_in_the_activity_stream() {
        Assert.assertFalse(appreciation.activityStreamMessage.isDisplayed());

    }


    */


}


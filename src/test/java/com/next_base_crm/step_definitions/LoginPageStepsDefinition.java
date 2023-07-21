package com.next_base_crm.step_definitions;

import com.next_base_crm.pages.LoginPage;
import com.next_base_crm.utilities.BrowserUtils;
import com.next_base_crm.utilities.ConfigurationReader;
import com.next_base_crm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.List;

public class LoginPageStepsDefinition {
    LoginPage loginPage = new LoginPage();

    @Given("User should navigate to the webPage")
    public void userShouldNavigateToTheWebPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }


    @And("user should enter the {string}")
    public void userShouldEnterThe(String password) {
        loginPage.userPassword.sendKeys(password);
    }

    @Then("Helpdesk user should enter {string}")
    public void helpdeskUserShouldEnter(String username) {
        loginPage.userName.sendKeys(username);

    }

    @Then("Marketing user should enter {string}")
    public void marketingUserShouldEnter(String username) {
        loginPage.userName.sendKeys(username);

    }

    @When("user should enter {string}")
    public void UserShouldEnter(String username) {
        loginPage.userName.sendKeys(username);

    }
    @And("user should click for login button")
    public void userShouldClickForLoginButton() {
        loginPage.loginButton.click();
    }


    @Then("user should be on the activity stream")
    public void userShouldBeOnTheHomePage() {
        BrowserUtils.verifyTitleContains("Portal");
    }




    @And("User  click on the link user to navigate to the correct URL.")
    public void userClickOnTheLinkUserToNavigateToTheCorrectURL() {
        loginPage.Linktextfield.click();
    }

    @And("User enter the links")
    public void userEnterTheLinks() {
        loginPage.Linktextfield.sendKeys(ConfigurationReader.getProperty("LinkUrl"));

    }

    @And("user click on save button")
    public void userClickOnSaveButton() {
        loginPage.SaveButton.click();
    }

    @And("user click on send button")
    public void userClickOnSendButton() {
        loginPage.SendButton.click();
    }

    @Then("user open the link in a new tab")
    public void userOpenTheLinkInANewTab() {
        BrowserUtils.waitFor(5);
        loginPage.dynamicUrl().click();

    }



    @And("marketing User click on message button")
    public void marketingUserClickOnMessageButton() {
        loginPage.marketing_login();
        loginPage.MessageButton.click();
        loginPage.insertButton.click();
    }

    @And("help desk User click on message button")
    public void helpDeskUserClickOnMessageButton() {
        loginPage.helpDesk_login();
        loginPage.MessageButton.click();
        loginPage.insertButton.click();
    }

   @And("hr User click on message button")
   public void hrUserClickOnMessageButton() {
        loginPage.Hr_login();
       loginPage.MessageButton.click();
       loginPage.insertButton.click();
    }




    @Then("user verify new tab")
    public void userVerifyNewTab() {
        BrowserUtils.waitFor(5);
        BrowserUtils.verifyTitleContains("Portal");
        BrowserUtils.waitFor(5);
        loginPage.multiple_windows_test();
        BrowserUtils.waitFor(5);
        BrowserUtils.verifyTitleContains("Google");
    }

//    @Then("Then user verify new tab")
//    public void thenUserVerifyNewTab() {
//        List<String> browserTabs = new ArrayList<String>(Driver.getDriver().getWindowHandles());
//        Driver.getDriver().switchTo().window(browserTabs.get(1));
//
//        BrowserUtils.verifyTitleContains("Google");
//        String expectedTitle = "Expected Page Title";
//        String actualTitle = Driver.getDriver().getTitle();
//        if (actualTitle.equals(expectedTitle)) {
//            System.out.println("Correct page is opened. Title: " + actualTitle);
//        } else {
//            System.out.println("Incorrect page is opened. Actual Title: " + actualTitle);
//        }
//    }
//

  }




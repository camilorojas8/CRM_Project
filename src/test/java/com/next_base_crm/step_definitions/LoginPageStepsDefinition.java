package com.next_base_crm.step_definitions;

import com.next_base_crm.pages.LoginPage;
import com.next_base_crm.utilities.BrowserUtils;
import com.next_base_crm.utilities.ConfigurationReader;
import com.next_base_crm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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


    @Given("User should navigate to the homepage")
    public void userShouldNavigateToTheHomepage() {

    }

    @And("User able to go to mailBox page")
    public void userclickOnMailtab() {
        loginPage.helpDesk_login();
        loginPage.mailtab.click();

    }


    @Then("user land into the Mailbox page")
    public void userLandIntoTheMailboxPage() {
        BrowserUtils.verifyTitleContains("Mailbox");
    }
}



package com.next_base_crm.step_definitions;

import com.next_base_crm.pages.LoginPage;
import com.next_base_crm.utilities.BrowserUtils;
import com.next_base_crm.utilities.ConfigurationReader;
import com.next_base_crm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

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

    @And("user enter a username {string}")
    public void userEnterAUsername(String username) {
        loginPage.userName.sendKeys(username);
    }

    @And("user enter a password  {string}")
    public void userEnterAPassword(String password) {
        loginPage.userPassword.sendKeys(password);
    }


    @Then("Incorrect login or password should be displayed")
    public void incorrectLoginOrPasswordShouldBeDisplayed() {
        loginPage.IncorrocetLoginOrPassword.isDisplayed();

    }

    @When("user able to see Remember Me link")
    public void userAbleToSeeLink() {
        loginPage.rememberMe.isDisplayed();
    }


    @Then("User should be able to click on Remember Me link")
    public void userShouldBeAbleToClickOnRememberMeLink() {
        loginPage.rememberMe.click();
        loginPage.rememberMe.isSelected();
    }

    @Then("use User should see the password in bullet signs by default")
    public void useUserShouldSeeThePasswordInBulletSignsByDefault() {
        loginPage.bulletSign.isDisplayed();
    }

    @And("Hr User click on the Log out button")
    public void hrUserClickOnTheLogOutButton() {
        loginPage.Hr_login();
        loginPage.userNameDropDown.click();
        loginPage.logOutButton.click();


    }

    @And("Marketing User click on the Log out button")
    public void marketingUserClickOnTheLogOutButton() {
        loginPage.marketing_login();
        loginPage.userNameDropDown.click();
        loginPage.logOutButton.click();
    }


    @And("Hr User click on More")
    public void hrUserClickOnMore() {
        loginPage.Hr_login();
        loginPage.moreDropdownButton.click();
    }

    @Then("User choose application")
    public void userChooseApplication() {
        loginPage.applicationButton.click();
    }

    @Given("User should navigate to the webPage {string},{string}")
    public void userShouldNavigateToTheWebPage(String username, String password) {
        loginPage.userName.sendKeys(username);
        loginPage.userPassword.sendKeys(password);
        loginPage.loginButton.click();
    }

    @And("User click on the Log out button")
    public void userClickOnTheLogOutButton() {
        loginPage.userNameDropDown.click();
        loginPage.logOutButton.click();

    }

    @Then("User land to the Login page")
    public void userLandToTheLoginPage() {
        BrowserUtils.verifyTitleContains("Authorization");
    }

    @And("Hr User click on the profile name")
    public void userClickOnTheProfileName() {
        loginPage.Hr_login();
        loginPage.userNameDropDown.click();

    }

    @Then("User can see the {string} under the profile name")
    public void userCanSeeTheUnderTheProfileName(String expectedOptions) {

        for (WebElement each : loginPage.profilOptions) {
            Assert.assertTrue(expectedOptions.equals(each.getText()));
        }

//        List<String> actualOption = new ArrayList<>();
//
//        for (WebElement eachElement : loginPage.profilOptions) {
//            actualOption.add(eachElement.getText());
//        }
//
//        Assert.assertEquals(expectedOptions, actualOption);

    }

    @And("Help desk User click on the profile name")
    public void helpDeskUserClickOnTheProfileName() {
        loginPage.helpDesk_login();
        loginPage.userNameDropDown.click();

    }

    @And("Marketing User click on the profile name")
    public void marketingUserClickOnTheProfileName() {
        loginPage.marketing_login();
        loginPage.userNameDropDown.click();
    }



    @Then("User can see the following options under the profile name")
    public void userCanSeeTheFollowingOptionsUnderTheProfileName(List<String> expectedModules) {
        List<String> actualOptions = new ArrayList<>();

        for (WebElement eachElement : loginPage.profilOptions) {
            actualOptions.add(eachElement.getText());
        }

        Assert.assertEquals(expectedModules, actualOptions);
    }
}

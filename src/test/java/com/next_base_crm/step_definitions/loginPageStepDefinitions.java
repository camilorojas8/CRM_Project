package com.next_base_crm.step_definitions;

import com.next_base_crm.pages.LoginPage;
import com.next_base_crm.utilities.ConfigurationReader;
import com.next_base_crm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.devtools.v85.indexeddb.model.Key;

public class loginPageStepDefinitions {
    LoginPage loginPage = new LoginPage();

  /*  @Given("User is on the login page")
    public void userIsOnTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    @When("user enters the a valid username {string}")
    public void userEntersTheAValidUsername(String username) {
        loginPage.usernameBox.sendKeys(ConfigurationReader.getProperty("username_hr1"));
    }


    @And("user enters the a valid password {string}")
    public void userEntersTheAValidPassword(String password) {
        loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("password") + Keys.ENTER);
    }

    @Then("user should be able to login")
    public void userShouldBeAbleToLogin() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertEquals(Driver.getDriver().getTitle(),"Portal");
    }*/

    @Given("user should navigate to the webPage")
    public void user_should_navigate_to_the_web_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    @Then("User should enter {string}")
    public void userShouldEnter(String username_hr1) {
        loginPage.userName.sendKeys(ConfigurationReader.getProperty("username_hr1"));
    }

    @And("User should enter the {string}")
    public void userShouldEnterThe(String password) {
        loginPage.userPassword.sendKeys(ConfigurationReader.getProperty("password"));
    }

    @And("User should click for login button")
    public void userShouldClickForLoginButton() {
        loginPage.loginButton.click();
    }




}
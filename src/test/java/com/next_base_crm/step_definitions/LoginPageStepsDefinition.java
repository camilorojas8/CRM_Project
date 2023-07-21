package com.next_base_crm.step_definitions;

import com.next_base_crm.pages.EmployeesPage;
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

    EmployeesPage employeesPage = new EmployeesPage();

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


    @Given("the user is on the Activity Stream page")
    public void the_user_is_on_the_activity_stream_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        loginPage.Hr_login();

        BrowserUtils.verifyTitleContains("Portal");
    }


    @When("the user clicks on the Employees module")
    public void the_user_clicks_on_the_employees_module() {

        employeesPage.employeesButton.click();

    }
    @Then("the Company Structure tab is open by default")
    public void the_company_structure_tab_is_open_by_default() {

        BrowserUtils.verifyTitleContains("Company Structure");

    }
    @Then("the user should see the following modules:")
    public void the_user_should_see_the_following_modules(List<String> expectedModules) {

        List<String> actualModules = new ArrayList<>();

        for (WebElement eachModule : employeesPage.allTopModules) {

            actualModules.add(eachModule.getText());
            System.out.println(eachModule.getText());
        }

        Assert.assertEquals(expectedModules,actualModules);

    }


}



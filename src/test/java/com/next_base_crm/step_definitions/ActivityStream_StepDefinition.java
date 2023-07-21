package com.next_base_crm.step_definitions;

import com.next_base_crm.pages.ActivityStreamPage;
import com.next_base_crm.pages.LoginPage;
import com.next_base_crm.utilities.BrowserUtils;
import com.next_base_crm.utilities.ConfigurationReader;
import com.next_base_crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class ActivityStream_StepDefinition {

    LoginPage loginPage = new LoginPage();
    ActivityStreamPage activityStreamPage = new ActivityStreamPage();

    @Given("I am logged in as a user")
    public void iAmLoggedInAsAUser() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    @When("Hr user navigate to the Activity stream page")
    public void hrUserNavigateToTheActivityStreamPage() {
        loginPage.Hr_login();
    }

    @When("Marketing user navigate to the Activity stream page")
    public void marketingUserNavigateToTheActivityStreamPage() {
        loginPage.marketing_login();
    }

    @When("Helpdesk user navigate to the Activity stream page")
    public void helpdeskUserNavigateToTheActivityStreamPage() {
        loginPage.helpDesk_login();
    }


    @When("I navigate to the Activity stream page")
    public void iNavigateToTheActivityStreamPage() {
        BrowserUtils.verifyTitleContains("Portal");
    }


    @Then("I should able to see the following options:")
    public void i_should_able_to_see_the_following_options(List<String> expectedOptions) {

        List<String> actualOptions = new ArrayList<>();


        for (String eachModule : expectedOptions) {
            actualOptions.add(eachModule);
            System.out.print(eachModule);
        }

        Assert.assertEquals(expectedOptions, actualOptions);

    }


    @When("I navigate to the More tab")
    public void i_navigate_to_the_more_tab() {
        loginPage.Hr_login();
        activityStreamPage.moreDropDown.click();
    }

    @Then("I should see the following options:")
    public void i_should_see_the_following_options(List<String> expectedOptions) {

        List<String> actualOptions = new ArrayList<>();


        for (String eachModule : expectedOptions) {
            actualOptions.add(eachModule);
            System.out.print(eachModule);
        }

        Assert.assertEquals(expectedOptions, actualOptions);

    }
}













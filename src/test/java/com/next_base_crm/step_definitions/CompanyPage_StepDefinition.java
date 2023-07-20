package com.next_base_crm.step_definitions;

import com.next_base_crm.pages.CompanyPage;
import com.next_base_crm.pages.LoginPage;
import com.next_base_crm.utilities.BrowserUtils;
import com.next_base_crm.utilities.ConfigurationReader;
import com.next_base_crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class CompanyPage_StepDefinition {

   LoginPage user = new LoginPage();

   CompanyPage page = new CompanyPage();


    @Given("user is already logged in to The Home page")
    public void user_is_already_logged_in_to_the_home_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        user.Hr_login();

    }


    @When("User click on Company page button")
    public void user_click_on_company_page_button() {

      page.companyBtn.click();

    }


    @Then("User see the following modules in the Company page")
    public void user_see_the_following_modules_in_the_company_page(List<String> expectedModules) {

        BrowserUtils.waitFor(5);

        List<String> actualModules = new ArrayList<>();

        for (WebElement eachModule : page.allTopModules) {

            actualModules.add(eachModule.getText());

        }

        // Compare the strings
        Assert.assertEquals(expectedModules,actualModules);

    }





}

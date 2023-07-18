package com.next_base_crm.step_definitions;

import com.next_base_crm.pages.DashboardPage_CRM;
import com.next_base_crm.utilities.ConfigurationReader;
import com.next_base_crm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage_CRM {

    DashboardPage_CRM dashboardPageCrm = new DashboardPage_CRM();



    @Given("user should navigate to the webPage")
    public void user_should_navigate_to_the_web_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    @Then("User should enter {string}")
    public void userShouldEnter(String arg0) {
    }

    @And("User should enter the {string}")
    public void userShouldEnterThe(String arg0) {
    }

    @And("User should click for login button")
    public void userShouldClickForLoginButton() {
    }

//    @Then("User should enter {string}")
//    public void user_should_enter(String username_hr1) {
//        dashboardPageCrm.userName.sendKeys(ConfigurationReader.getProperty("username_hr1"));
//
//    }
//
////    @And("User should enter the password {string}")
////    public void userShouldEnterThePassword(String password) {
////        dashboardPageCrm.userPassword.sendKeys(ConfigurationReader.getProperty("password"));
////    }
//
//    @And("User should enter the {string}")
//    public void userShouldEnterThe(String password) {
//        dashboardPageCrm.userPassword.sendKeys(ConfigurationReader.getProperty("password"));
//    }
//
//    @Then("User should click for login button")
//    public void user_should_click_for_login_button() {
//        dashboardPageCrm.loginButton.click();
//    }


}

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

    @When("user clicks on {string} button")
    public void user_clicks_on_button(String string) {

    }
    @Then("user removes {string} default delivery option")
    public void user_removes_default_delivery_option(String string) {

    }
    @Then("user types message title in message title input box")
    public void user_types_message_title_in_message_title_input_box() {

    }
    @Then("user adds question in Question input box")
    public void user_adds_question_in_question_input_box() {

    }
    @Then("user adds multiple answers in Answer input box")
    public void user_adds_multiple_answers_in_answer_input_box() {

    }

    @Then("user sees error delivery message: {string}")
    public void user_sees_error_delivery_message(String string) {

    }

    @Then("user types poll message title in message title input box")
    public void user_types_poll_message_title_in_message_title_input_box() {

    }
    @Then("user sees error question message: {string}")
    public void user_sees_error_question_message(String string) {

    }

    @Then("user sees the delivery {string} by default")
    public void user_sees_the_delivery_by_default(String string) {

    }

    @Then("user clicks on {string} checkbox")
    public void user_clicks_on_checkbox(String string) {

    }

    @Then("user sees error title message: {string}")
    public void user_sees_error_title_message(String string) {

    }

    @Then("user sees error answer message: {string}")
    public void user_sees_error_answer_message(String string) {

    }


}



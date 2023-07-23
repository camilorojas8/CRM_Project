package com.next_base_crm.step_definitions;

import com.next_base_crm.pages.ActivityStreamPage;
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

    ActivityStreamPage activityStreamPage = new ActivityStreamPage();


    @Given("user is on the activity stream")
    public void user_is_on_the_activity_stream() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        //loginPage.Hr_login();
        //loginPage.helpDesk_login();
        loginPage.marketing_login();

    }

    @When("user clicks on the {string} button")
    public void user_clicks_on_the_button(String button1) {
        activityStreamPage.pollButton.click();
    }

    @Then("user sees the delivery {string} by default")
    public void user_sees_the_delivery_by_default(String deliveryByDefault) {
        Assert.assertTrue(activityStreamPage.allEmployeeOption.isDisplayed());

    }

    @Then("user types {string} in message title input box")
    public void user_types_in_message_title_input_box(String messageTitle) {
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        activityStreamPage.messageTitlePollInputBox.sendKeys("poll message");
    }

    @When("user clicks on {string} button")
    public void user_clicks_on_button(String button) {
        activityStreamPage.sendButton.click();

    }

    @Then("user removes {string} default delivery option")
    public void user_removes_default_delivery_option(String removingButton) {
        activityStreamPage.removeAllEmployeeButton.click();
    }


    @Then("user adds {string} in Question input box")
    public void user_adds_in_question_input_box(String question) {
        Driver.getDriver().switchTo().parentFrame();
        activityStreamPage.questionInputBox.sendKeys("what is a maven?");
    }

    @Then("user adds {string} in Answer input box")
    public void user_adds_in_answer_input_box(String answer) {
        Driver.getDriver().switchTo().parentFrame();
        activityStreamPage.answer1InputBox.sendKeys("a");
        activityStreamPage.answer2InputBox.sendKeys("b");
    }


    @Then("user sees error delivery message: {string}")
    public void user_sees_error_delivery_message(String message1) {
        String expectedErrorDeliveryMessage = "Please specify at least one person.";
        String actualErrorDeliveryMessage = activityStreamPage.errorDeliveryPersonMessage.getText();
        Assert.assertEquals(expectedErrorDeliveryMessage, actualErrorDeliveryMessage);
    }


    @Then("user sees error question message: {string}")
    public void user_sees_error_question_message(String question) {
        String actualErrorMessage = activityStreamPage.errorQuestionTextMessage.getText();
        String expectedErrorMessage = "The question text is not specified.";
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }


    @Then("user clicks on {string} checkbox")
    public void user_clicks_on_checkbox(String checkbox) {
        activityStreamPage.allowMultipleChoiceCheckbox.click();

    }

    @Then("user sees error title message: {string}")
    public void user_sees_error_title_message(String errorTitleMessage) {
        String actualErrorTitleMsg = activityStreamPage.errorMessageTitleMessage.getText();
        String expectedErrorTitleMsg = "The message title is not specified";
        Assert.assertEquals(expectedErrorTitleMsg, actualErrorTitleMsg);
    }

    /* @Then("user sees error answer message: {string}")
    public void user_sees_error_answer_message(String question) {
        String actualErrorAnswerMsg = activityStreamPage.errorAnswerMessage.getText();
        String expectedErrorAnswerMsg = "The question " + "\"what is a maven?\"" + " has no answers.";
        Assert.assertEquals(expectedErrorAnswerMsg, actualErrorAnswerMsg);

    }

     */

    @Then("user clicks on a {string} button")
    public void user_clicks_on_a_button(String button3) {
        activityStreamPage.cancelPollButton.click();
    }


    /*@Then("user sees error answer message: {string}  {string} {string}")
    public void user_sees_error_answer_message(String error1, String question, String error2) {
        String actualErrorAnswerMsg = activityStreamPage.errorAnswerMessage.getText();
        String expectedErrorAnswerMsg = "The question" + " what is a maven? " + "has no answers.";
        Assert.assertEquals(expectedErrorAnswerMsg, actualErrorAnswerMsg);
    }

     */

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




    @Then("user sees error answer message: \"The question \"what is maven?{string}")
    public void user_sees_error_answer_message_the_question_what_is_maven(String message2) {
            String actualErrorAnswerMsg = activityStreamPage.errorAnswerMessage.getText();
            String expectedErrorAnswerMsg = "\"what is a maven?\"";
            Assert.assertTrue(actualErrorAnswerMsg.contains(expectedErrorAnswerMsg));
    }





}




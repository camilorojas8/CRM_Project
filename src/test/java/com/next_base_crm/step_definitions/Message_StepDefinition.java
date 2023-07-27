package com.next_base_crm.step_definitions;

import com.next_base_crm.pages.LoginPage;
import com.next_base_crm.pages.MessagePage;
import com.next_base_crm.utilities.BrowserUtils;
import com.next_base_crm.utilities.ConfigurationReader;
import com.next_base_crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class Message_StepDefinition {

    LoginPage user = new LoginPage();
    MessagePage messagePage = new MessagePage();


    //Background
    @Given("User is logged in")
    public void user_is_logged_in() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        user.Hr_login();
        messagePage.messageBtn.click();
    }

    //Scenario 1
    @Given("the user type message into the message box")
    public void the_user_type_message_into_the_message_box() {
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        messagePage.inputMessage.sendKeys("Hello great team");
    }

    @Given("User click send button")
    public void user_click_send_button() {
        Driver.getDriver().switchTo().parentFrame();
        messagePage.sendButton.click();

    }

    //Scenario 2.
    @Then("{string} button is selected by default")
    public void button_is_selected_by_default(String string) {
    }

    //Scenario 3.
    @When("the user type the message into the message field")
    public void the_user_type_the_message_into_the_message_field() {
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        messagePage.inputMessage.sendKeys("Hello great team");


    }

    @When("the user clicks the Cancel button")
    public void the_user_clicks_the_cancel_button() {

        Driver.getDriver().switchTo().parentFrame();
        messagePage.cancelButton.click();
    }

    @Then("the message should not be sent and {string} text is visible again")
    public void the_message_should_not_be_sent_and_text_is_visible_again(String string) {
        messagePage.defaultMessageText.isDisplayed();

    }



}

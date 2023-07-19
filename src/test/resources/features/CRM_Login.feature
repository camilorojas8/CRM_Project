Feature: Login Page Functionality
  Agile story: As a user, I should be able to login

  Background:
    Given User should navigate to the webPage


  @Hr_Login
  Scenario:  Login page function
    Then Hr user should enter "username"
    And user should enter the "password"
    And user should click for login button


  @HelpDesk_Login
  Scenario: Login page function
    Then Helpdesk user should enter "username"
    And user should enter the "password"
    And user should click for login button


  @marketing_Login
  Scenario:  Login page function
    Then Marketing user should enter "username"
    And user should enter the "password"
    And user should click for login button








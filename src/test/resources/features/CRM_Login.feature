@login
Feature: Login Page Functionality
  Agile story: As a user, I should be able to login

  Background:
    Given User should navigate to the webPage

  @Hr_Login
  Scenario Outline:  Login page function
    Then Hr user should enter "<username>"
    And user should enter the "<password>"
    And user should click for login button
    Examples:
      | username                | password |
      | hr1@cybertekschool.com  | UserUser |
      | hr5@cybertekschool.com  | UserUser |
      | hr18@cybertekschool.com | UserUser |


  @HelpDesk_Login
  Scenario Outline: Login page function
    Then Helpdesk user should enter "<username>"
    And user should enter the "<password>"
    And user should click for login button
    Examples:
      | username                      | password |
      | helpdesk1@cybertekschool.com  | UserUser |
      | helpdesk51@cybertekschool.com | UserUser |
      | helpdesk80@cybertekschool.com | UserUser |


  @marketing_Login
  Scenario Outline:  Login page function
    Then Marketing user should enter "<username>"
    And user should enter the "<password>"
    And user should click for login button
    Examples:
      | username                       | password |
      | marketing1@cybertekschool.com  | UserUser |
      | marketing14@cybertekschool.com | UserUser |
      | marketing14@cybertekschool.com | UserUser |












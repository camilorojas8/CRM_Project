Feature: Login Page Functionality
  Agile story: As a user, I should be able to login

  Background:
    Given User should navigate to the webPage

  @User_Login
  Scenario Outline:  Login page
    When user should enter "<username>"
    And user should enter the "<password>"
    And user should click for login button
    Then  user should be on the activity stream

    Examples:
      | username                      | password |
      | hr1@cybertekschool.com        | UserUser |
      | helpdesk1@cybertekschool.com  | UserUser |
      | marketing1@cybertekschool.com | UserUser |














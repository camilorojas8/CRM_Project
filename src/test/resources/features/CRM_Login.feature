
Feature: Default


  @B29G34-283
  Scenario: Users should be able to log in with valid credentials
Feature: Login Page Functionality
  US : Users should be able to log in with valid credentials

  Background:
    Given User should navigate to the webPage

  @Hr_userLogin
  Scenario Outline:  Login page
    When user should enter "<username>"
    And user should enter the "<password>"
    And user should click for login button
    Then  user should be on the activity stream

    Examples:
      | username                 | password |
      | hr80@cybertekschool.com  | UserUser |
      | hr50@cybertekschool.com  | UserUser |
      | hr40@cybertekschool.com  | UserUser |
      | hr78@cybertekschool.com  | UserUser |
      | hr101@cybertekschool.com | UserUser |
      | hr60@cybertekschool.com  | UserUser |
      | hr101@cybertekschool.com | UserUser |
      | hr60@cybertekschool.com  | UserUser |
      | hr10@cybertekschool.com  | UserUser |
      | hr20@cybertekschool.com  | UserUser |
      | hr30@cybertekschool.com  | UserUser |
      | hr40@cybertekschool.com  | UserUser |
      | hr101@cybertekschool.com | UserUser |
      | hr60@cybertekschool.com  | UserUser |
      | hr101@cybertekschool.com | UserUser |
      | hr60@cybertekschool.com  | UserUser |

  @HelpDesk_UserLogin
  Scenario Outline:  Login page
    When user should enter "<username>"
    And user should enter the "<password>"
    And user should click for login button
    Then  user should be on the activity stream

    Examples:
      | username                       | password |
      | helpdesk1@cybertekschool.com   | UserUser |
      | helpdesk52@cybertekschool.com  | UserUser |
      | helpdesk18@cybertekschool.com  | UserUser |
      | helpdesk58@cybertekschool.com  | UserUser |
      | helpdesk30@cybertekschool.com  | UserUser |
      | helpdesk60@cybertekschool.com  | UserUser |
      | helpdesk77@cybertekschool.com  | UserUser |
      | helpdesk10@cybertekschool.com  | UserUser |
      | helpdesk20@cybertekschool.com  | UserUser |
      | helpdesk22@cybertekschool.com  | UserUser |
      | helpdesk2@cybertekschool.com   | UserUser |
      | helpdesk3@cybertekschool.com   | UserUser |
      | helpdesk100@cybertekschool.com | UserUser |
      | helpdesk101@cybertekschool.com | UserUser |
      | helpdesk99@cybertekschool.com  | UserUser |
      | helpdesk8@cybertekschool.com   | UserUser |
      | helpdesk45@cybertekschool.com  | UserUser |
      | helpdesk18@cybertekschool.com  | UserUser |

  @Marketing_UserLogin
  Scenario Outline:  Login page
    When user should enter "<username>"
    And user should enter the "<password>"
    And user should click for login button
    Then  user should be on the activity stream

    Examples:
      | username                        | password |
      | marketing1@cybertekschool.com   | UserUser |
      | marketing15@cybertekschool.com  | UserUser |
      | marketing21@cybertekschool.com  | UserUser |
      | marketing41@cybertekschool.com  | UserUser |
      | marketing60@cybertekschool.com  | UserUser |
      | marketing50@cybertekschool.com  | UserUser |
      | marketing70@cybertekschool.com  | UserUser |
      | marketing80@cybertekschool.com  | UserUser |
      | marketing90@cybertekschool.com  | UserUser |
      | marketing101@cybertekschool.com | UserUser |
      | marketing99@cybertekschool.com  | UserUser |

#    @test1
#    Scenario: User able to go to mailBox page
#      Given User should navigate to the homepage
#      And  User able to go to mailBox page
#      Then user land into the Mailbox page

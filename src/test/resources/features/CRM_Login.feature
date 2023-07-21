@B29G34-298
Feature: Default

  Background:
    Given User should navigate to the webPage

  @B29G34-281
  Scenario: User can see "Remember Me" link exists and is clickable on the login page

    Given User should navigate to the webPage
    When user able to see Remember Me link
    Then User should be able to click on Remember Me link

  @B29G34-282
  Scenario: User should see the password in bullet signs by default
    Given User should navigate to the webPage
    Then use User should see the password in bullet signs by default

  @B29G34-283 @Hr_userLogin
  Scenario Outline:  Users should be able to log in with valid credentials
    Given User should navigate to the webPage
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
      | hr30@cybertekschool.com  | UserUser |
      | hr40@cybertekschool.com  | UserUser |
      | hr101@cybertekschool.com | UserUser |
      | hr101@cybertekschool.com | UserUser |


  @B29G34-283 @HelpDesk_UserLogin
  Scenario Outline:  Users should be able to log in with valid credentials
    Given User should navigate to the webPage
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
      | helpdesk3@cybertekschool.com   | UserUser |
      | helpdesk100@cybertekschool.com | UserUser |
      | helpdesk101@cybertekschool.com | UserUser |
      | helpdesk99@cybertekschool.com  | UserUser |
      | helpdesk8@cybertekschool.com   | UserUser |
      | helpdesk45@cybertekschool.com  | UserUser |
      | helpdesk18@cybertekschool.com  | UserUser |

  @B29G34-283
  Scenario Outline:  Users should be able to log in with valid credentials
    Given User should navigate to the webPage
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
      | marketing50@cybertekschool.com  | UserUser |
      | marketing80@cybertekschool.com  | UserUser |
      | marketing90@cybertekschool.com  | UserUser |
      | marketing101@cybertekschool.com | UserUser |
      | marketing101@cybertekschool.com | UserUser |


  @B29G34-284
  Scenario Outline: "Incorrect login or password" error message should be displayed for invalid credentials
    Given User should navigate to the webPage
    And user enter a username "<username>"
    And user enter a password  "<password>"
    And user should click for login button
    Then Incorrect login or password should be displayed
    Examples: Credentials that will be used for this Scenario
      | username                         | password        |
      | hr1@cybertekschool.com           | InvalidPassword |
      | InavalidEmail@cybertekschool.com | UserUser        |
      | marketing1@cybertekschool.com    | InvalidPassword |
      | helpdesk18@cybertekschool.com    | InvalidPassword |


  @B29G34-285
  Scenario Outline:Verify the users can log out from the app after clicking the “Log out” button.
    Given User should navigate to the webPage "<username>","<password>"
    And User click on the Log out button
    Then User land to the Login page
    Examples:
      | username                      | password |
      | hr80@cybertekschool.com       | UserUser |
      | helpdesk1@cybertekschool.com  | UserUser |
      | marketing1@cybertekschool.com | UserUser |

  @B29G34-287
  Scenario:  Verify users see 5 options under the profile name.
    Given User should navigate to the webPage
    And Hr User click on the profile name
    Then User can see the following options under the profile name
      | My Profile              |
      | Edit Profile Settings   |
      | Themes                  |
      | Configure notifications |
      | Log out                 |

  @B29G34-287
  Scenario: Verify Help desk users see options under the profile name.
    Given User should navigate to the webPage
    And Help desk User click on the profile name
    Then User can see the following options under the profile name
      | My Profile              |
      | Edit Profile Settings   |
      | Themes                  |
      | Configure notifications |
      | Log out                 |

  @B29G34-287
  Scenario:  Verify Marketing user see 5 options under the profile name.
    Given User should navigate to the webPage
    And Marketing User click on the profile name
    Then User can see the following options under the profile name
      | My Profile              |
      | Edit Profile Settings   |
      | Themes                  |
      | Configure notifications |
      | Log out                 |


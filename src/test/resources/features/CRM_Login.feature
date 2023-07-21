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



  @B29G34-302 @test1
  Scenario: username_help_desk


    And help desk User click on message button
    And User  click on the link user to navigate to the correct URL.
    And User enter the links
    And user click on save button
    And user click on send button
    And user open the link in a new tab
    Then  user verify new tab


  @B29G34-303 @test1
  Scenario: username_hr1 user login


    And  hr User click on message button
    And  User  click on the link user to navigate to the correct URL.
    And  User enter the links
    And  user click on save button
    And  user click on send button
    And  user open the link in a new tab
    Then user verify new tab


  @B29G34-304 @test1
  Scenario: username_marketing


    And marketing User click on message button
    And User  click on the link user to navigate to the correct URL.
    And User enter the links
    And user click on save button
    And user click on send button
    And user open the link in a new tab
    Then user verify new tab













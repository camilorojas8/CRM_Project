@B29G34-291
Feature: Default

	
	@B29G34-288
	Scenario:  Send appreciation Functionality
		Scenario: Sending appreciation by clicking on the Appreciation tab 
		        When user is logged in
				Then  user should be on the activity stream
				And I click on the more tab
				And I am able to select the Appreciation tab from the dropdown
				Then user sees "Portal" in the title
				And I enter a message expressing appreciation
				And I click on the "Send"
				Then  user should be on the activity stream
				Then the appreciation should appear in the Activity Stream.	

	
	@B29G34-289
	Scenario:  Appreciation Tab Functionality: The delivery should be to 'All employees' by default.
		Scenario:Appreciation Functionality
		
				When user is logged in
				Then  user should be on the activity stream
				And I click on the more tab
				And I am able to select the Appreciation tab from the dropdown
				Then user sees "Portal" in the title
				Then the delivery option should be set to 'All employees' by default	

	
	@B29G34-290
	Scenario: Appreciation: User should be able to cancel sending appreciation at any time before sending.
		Scenario: Appreciation: User should be able to cancel sending appreciation at any time before sending.
		
				When user is logged in
				Then  user should be on the activity stream
				And I click on the more tab
				And I am able to select the Appreciation tab from the dropdown
				Then user sees "Portal" in the title
				And I enter a message expressing appreciation
				And user sees the "cancel" button
				When I click on the "Cancel" button
				Then user should be on the activity stream
@B29G34-319
Feature: Default
	Background: Given User is on the Activity Stream page
	
	@B29G34-308
	Scenario: Verify the delivery should be to 'All employees' by default.
		Given user should be on the activity stream
		  When user clicks on "POLL" button
		  Then user sees the delivery "All employees" by default

	
	@B29G34-309
	Scenario: Verify user should be able to create a poll by adding questions and multiple answers.
		Given user should be on the activity stream
		  When user clicks on "POLL" button
		  Then user adds question in Question input box
		  And user adds multiple answers in Answer input box

	#   When User clicks on 'POLL' button
	#   Then User clicks on 'Allow multiple choice' checkbox
	@B29G34-310
	Scenario: Verify user should be able to click on “Allow multiple choice” checkbox.
		Given user should be on the activity stream
		   When user clicks on "POLL" button
		   Then user clicks on "Allow multiple choice" checkbox

	
	@B29G34-311
	Scenario: User should see mandatory fields: Message title - Error message: "The message title is not specified"
		Given user should be on the activity stream
		   When user clicks on "POLL" button
		   And user clicks on "Send" button
		   Then user sees error title message: 'The message title is not specified'

	
	@B29G34-312
	Scenario: User should see mandatory fields: recipient - Error message: "Please specify at least one person."
		Given user should be on the activity stream
		    When user clicks on "POLL" button
		    Then user removes "All employees" default delivery option
		    Then user types message title in message title input box
		    Then user adds question in Question input box
		    Then user adds multiple answers in Answer input box
		    And user clicks on "Send" button
		    Then user sees error delivery message: 'Please specify at least one person.'

	
	@B29G34-313
	Scenario: User should see mandatory fields: 1 question-  Error message: "The question text is not specified."
		Given user should be on the activity stream
		   When user clicks on "POLL" button
		   Then user types poll message title in message title input box
		   Then user adds multiple answers in Answer input box
		   And user clicks on "Send" button
		   Then user sees error question message: 'The question text is not specified.'

	
	@B29G34-314
	Scenario: User should see mandatory fields: 1 answer - Error message: "The question "........." has no answers."
		Given user should be on the activity stream
		   When user clicks on "POLL" button
		   Then user types poll message title in message title input box
		   Then user adds question in Question input box
		   And user clicks on "Send" button
		   Then user sees error answer message: "The question ......... has no answers."
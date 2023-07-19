@B29G34-319
Feature: Default
	Background: Given User is on the Activity Stream page
	
	@B29G34-308
	Scenario: The delivery should be to 'All employees' by default.
		Given User is on the Activity Stream page
		  When User clicks on "POLL" button
		  Then User sees the delivery "All employees" by default

	
	@B29G34-309
	Scenario: User should be able to create a poll by adding questions and multiple answers.
		Given User is on the Activity Stream page
		  When User clicks on "POLL" button
		  Then User adds question in Question input box
		  And User adds multiple answers in Answer input box

	#   When User clicks on 'POLL' button
	#   Then User clicks on 'Allow multiple choice' checkbox
	@B29G34-310
	Scenario: User clicks on “Allow multiple choice” checkbox.
		Given User is on the Activity Stream page
		   When User clicks on "POLL" button
		   Then User clicks on "Allow multiple choice" checkbox

	
	@B29G34-311
	Scenario: Mandatory fields: Message title - Error message: "The message title is not specified"
		Given User is on the Activity Stream page
		   When User clicks on "POLL" button
		   And User clicks on "Send" button
		   Then User sees error title message: 'The message title is not specified'

	
	@B29G34-312
	Scenario: Mandatory fields: recipient - Error message: "Please specify at least one person."
		Given User is on the Activity Stream page
		    When User clicks on "POLL" button
		    Then User removes "All employees" default option for delivery
		    Then User types message title in message title input box
		    Then User adds question in Question input box
		    Then User adds multiple answers in Answer input box
		    And User clicks on "Send" button
		    Then User sees error delivery message: 'Please specify at least one person.'

	
	@B29G34-313
	Scenario: Mandatory fields: 1 question-  Error message: "The question text is not specified."
		Given User is on the Activity Stream page
		   When User clicks on "POLL" button
		   Then User types poll message title in message title input box
		   Then User adds multiple answers in Answer input box
		   And User clicks on "Send" button
		   Then User sees error question message: 'The question text is not specified.'

	
	@B29G34-314
	Scenario: Mandatory fields: 1 answer - Error message: "The question "........." has no answers."
		Given User is on the Activity Stream page
		   When User clicks on "POLL" button
		   Then User types poll message title in message title input box
		   Then User adds question in Question input box
		   And User clicks on "Send" button
		   Then User sees error answer message: 'The question "<.........>" has no answers.'
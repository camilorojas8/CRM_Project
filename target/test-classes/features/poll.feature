@B29G34-319
Feature: Default

Background:
	Given user is on the activity stream
	When user clicks on the "POLL" button

	@B29G34-308
	Scenario: Verify the delivery should be to 'All employees' by default.
		  Then user sees the delivery "All employees" by default

	


	#   When User clicks on 'POLL' button
	#   Then User clicks on 'Allow multiple choice' checkbox
	@B29G34-310
	Scenario: Verify user should be able to click on “Allow multiple choice” checkbox.
		   Then user clicks on "Allow multiple choice" checkbox

	
	@B29G34-311
	Scenario: Verify user should see mandatory fields: Message title - Error message: "The message title is not specified"
		   And user clicks on "Send" button
		   Then user sees error title message: 'The message title is not specified'

	
	@B29G34-312
	Scenario: Verify user should see mandatory fields: recipient - Error message: "Please specify at least one person."
		    Then user removes "All employees" default delivery option
		    Then user types "message" in message title input box
		    Then user adds "question" in Question input box
		    Then user adds "answers" in Answer input box
		    And user clicks on "Send" button
		    Then user sees error delivery message: 'Please specify at least one person.'
		    And user clicks on a "cancel" button

	
	@B29G34-313
	Scenario: Verify user should see mandatory fields: 1 question-  Error message: "The question text is not specified."
		   Then user types "message" in message title input box
		   Then user adds "answers" in Answer input box
		   And user clicks on "Send" button
		   Then user sees error question message: 'The question text is not specified.'
		   And user clicks on a "cancel" button

	
	@B29G34-309
	Scenario: Verify user should see mandatory fields: 1 answer - Error message: "The question "........." has no answers."
		   Then user types "message" in message title input box
		   Then user adds "question" in Question input box
		   And user clicks on "Send" button
		   Then user sees error answer message: "The question ......... has no answers."
		   And user clicks on a "cancel" button

	@B29G34-314
	Scenario: Verify user should be able to create a poll by adding questions and multiple answers.
		Then user types "message" in message title input box
		Then user adds "question" in Question input box
		Then user adds "answers" in Answer input box
		And user clicks on "Send" button

		#expected:<The question [what is a maven?] has no answers.>
  #               <The question ["what is a maven?"] has no answers.>
@US_269
Feature: Sending messages via Message tab under Active Stream

	Background:
		Given User is logged in
		When user clicks on the "MESSAGE" button

	Scenario: Verify user is able to send message on Active Stream
			And the user type message into the message box


		Scenario: Message delivery should be to 'All employees' by default
			Then 'All employees' button is selected by default
			And User click send button


		Scenario: User is able to cancel the message
			And the user type the message into the message field
			And the user clicks the Cancel button
			Then the message should not be sent and 'Send message ...' text is visible again
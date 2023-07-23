@employeesTest
Feature: Employee Page Modules
	Agile story: As a user
	I want to view the modules on the Employees page
	So that I can access the required functionalities

		
		  Scenario: Verify the modules displayed on the Employees page
		    Given the user is on the Activity Stream page
		    When the user clicks on the Employees module
		    Then the Company Structure tab is open by default
		    Then the user should see the following modules:
		      | Company Structure     |
		      | Find Employee         |
		      | Telephone Directory   |
		      | Staff Changes         |
		      | Efficiency Report     |
		      | Honored Employees     |
		      | Birthdays             |
		      | New page              |
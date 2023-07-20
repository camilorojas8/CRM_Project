@US_278
Feature: Company page

	User story - As a user, I should be able to access to the Company page.

	Scenario: Verify users can access to Company page
		    Given user is already logged in to The Home page
		    When User click on Company page button
		    Then User see the following modules in the Company page
		    |Official Information|
			|Our Life|
			|About Company|
			|Photo Gallery|
			|Video|
			|Career|
			|Business News (RSS)|
			|More               |


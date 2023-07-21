@Sezgin
Feature: Activity stream page
	Agile Story: As a user, I should be able to see all the options on the Activity stream page
Background:
	Given  I am logged in as a user

	@B29G34-305
	Scenario: User views the some options on the Activity stream page
		When Hr user navigate to the Activity stream page
		Then I should able to see the following options:
			| MESSAGE  |
			| TASK     |
			| EVENT    |
			| POLL     |
			| MORE     |

	@B29G34-305
	Scenario: User views the some options on the Activity stream page
		When Marketing user navigate to the Activity stream page
		Then I should able to see the following options:
			| MESSAGE  |
			| TASK     |
			| EVENT    |
			| POLL     |
			| MORE     |

	@B29G34-305
	Scenario: User views the some options on the Activity stream page
		When Helpdesk user navigate to the Activity stream page
		Then I should able to see the following options:
			| MESSAGE  |
			| TASK     |
			| EVENT    |
			| POLL     |
			| MORE     |

	@B29G34-307
	Scenario:  Users view 4 options under the MORE tab
		When I navigate to the More tab
		Then I should see the following options:
			|File        |
			|Appreciation|
			|Announcement|
			|Workflow    |


@B29G34-332
Feature: Default
	#*US:* As a user, I should be able to upload files and pictures to appreciation
	#
	#*AC-1:* User should be able to upload files and pictures.
	@B29G34-292
	#Scenario : AC-1: User should be able to upload files and pictures.
		Scenario Outline: upload file to appreciation
	        When user on login page
		    When user press More dropdown
		    Then user choose Appreciation option
		    Then user press Upload files icon
		    Then user choose Upload: "<p>"
		    And user able to see Input in texy button
		   # And user able to see "<name>" of file as attached file

		    Examples:
		    |p|
			|C:\\Users\\chupi\\Desktop\\stu\\sample\\Sample_DocX.docx|
			|C:\\Users\\chupi\\Desktop\\stu\\sample\\sample_JPEG.jpg|
			|C:\\Users\\chupi\\Desktop\\stu\\sample\\sample_PNG.png|
			|C:\\Users\\chupi\\Desktop\\stu\\sample\\Sample_TXT.txt|

	#*US:* As a user, I should be able to upload files and pictures to appreciation
	#
	#*AC-2:*  User should be able to insert the files and images into the text
	@B29G34-293
	#Scenario: AC-2: User should be able to insert the files and images into the text
		Scenario Outline: insert the files and images into the text
		When user on login page
		      When user press More dropdown
		      Then user choose Appreciation option
			  Then user press Upload files icon
		      Then user choose Upload: "<p>"
			  Then user choose the button Insert in text
		      Then user able to see in text on the button

		Examples:
			|p|
			|C:\\Users\\chupi\\Desktop\\stu\\sample\\Sample_DocX.docx|
			|C:\\Users\\chupi\\Desktop\\stu\\sample\\sample_JPEG.jpg|
			|C:\\Users\\chupi\\Desktop\\stu\\sample\\sample_PNG.png|
			|C:\\Users\\chupi\\Desktop\\stu\\sample\\Sample_TXT.txt|

	#*US:* As a user, I should be able to upload files and pictures to appreciation
	#
	#*AC-3:* User should be able to remove files and images at any time before sending.
	@B29G34-294
	#Scenario: AC-3: User should be able to remove files and images at any time before sending.
		Scenario Outline: remove files before sending
			When user on login page
		    When user press More dropdown
		    Then user choose Appreciation option
		    Then user press Upload files icon
		    Then user choose Upload: "<p>"
		    Then user able to see Insert in text on the button
		    Then user choose delete icon
		    Then user able not to see Insert in text on the button
			Then user choose Upload: "<p>"
		    Then user choose the button Insert in text
		    Then user choose delete icon
		    Then user able not to see Insert in text on the button

		Examples:
			|p|
			#|C:\\Users\\chupi\\Desktop\\stu\\sample\\Sample_DocX.docx|
			#|C:\\Users\\chupi\\Desktop\\stu\\sample\\sample_JPEG.jpg|
			#|C:\\Users\\chupi\\Desktop\\stu\\sample\\sample_PNG.png|
			|C:\\Users\\chupi\\Desktop\\stu\\sample\\Sample_TXT.txt|
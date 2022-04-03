Feature: validation of facebook
Scenario: validation of facebook with correct username and correct password
Given user must launch the facebook url
When user enters the correct username and correct password
And user clicks on the login button
Then user validates url is navigated to hoome page

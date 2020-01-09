Feature: TestMeApp validation

Scenario: Login
Given Application is up and running and is launched
Then User clicks on SignIn link
And User provides valid creds
Then user clicks on submit button

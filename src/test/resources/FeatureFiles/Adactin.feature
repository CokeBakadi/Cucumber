@smoke
Feature: To validate Adactin HotelApp login functionality

Background: 
Given user is in Adactin login page


Scenario: To check the credentials

When user enter invalid username and invalid password
|username|password|
|java|haddop|
|mava|premam|
|python|sql|

And user click login button
Then user gets the Error message

Scenario: To check user enter valid credentials
When user enter valid username and valid password
And user click login button
Then user gets passed to next page


Feature: To verify the login page functionality

Scenario:Load the Object Repo for Web Application
Given Load Object Repo for Web Application


Scenario: Login with Valid username & Password

Given Navigate to Orange website
When Verify that Orange.com Page is opened
And Enter valid username
And Enter valid Password
And Click on the Login Button
Then Verify user able to view the Orange.com Home page

Scenario: Verify the Login Functionality with invalid username & valid password

Given Navigate to Orange website
When Verify that Orange.com Page is opened
And Enter Invalid username
And Enter valid Password
And Click on the Login Button
Then Verify user not able to view the Orange.com Home page

Scenario: Verify the Login Functionality with valid username & invalid password

Given Navigate to Orange website
When Verify that Orange.com Page is opened
And Enter valid username
And Enter Invalid Password
And Click on the Login Button
Then Verify user not able to view the Orange.com Home page


Feature: To verify the login page functionality

Scenario:Load the Object Repo for Web Application
Given Load Object Repo for Web Application

Scenario: Login with Valid username & Password

Given Open the Orange.com page
When Verify that Orange.com Page is opened
And Enter valid username
And Enter Valid Password
And Click on the Login Button
Then Verify user able to view the Orange.com Home page


Feature: create test for registration - TestMeApp

Scenario: Registration test

Given user should navigates to TestMeApp on chrome browser
When users should click on signUp link
And user enter with the username as "pranali123"
And user enter with first name as "Pranali"
And user enter with last name as "Mankar"
And user enter with password as "password123"
And user enter with confirm password as "password123"
And user selects the gender 
And user enter with email as "ppm@gmail.com"
And user enter the mobile number as "9934257578"
And user enter the date of Birth as "12/02/1997"
And user enter with address as "Mumbai"
And user enter with security question
And user enter with answer as "Purple"
And user clicks on register button
Then user should verify registration success
 
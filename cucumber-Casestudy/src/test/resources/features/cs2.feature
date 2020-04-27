Feature: create test for registration - TestMeApp

Scenario Outline: Registration test

Given user should navigates to TestMeApp on chrome browser
When users should click on signUp link
And user enter with the username as "<user>"
And user enter with first name as "<firstn>"
And user enter with last name as "<lastn>"
And user enter with password as "<pass>"
And user enter with confirm password as "<confirm>"
And user selects the gender 
And user enter with email as "<email>"
And user enter the mobile number as "<mob>"
And user enter the date of Birth as "<birth>"
And user enter with address as "<add>"
And user enter with security question
And user enter with answer as "<color>"
And user clicks on register button
Then user should verify registration success
 
 Examples:
 |user||firstn||lastn||pass||confirm||email||mob||birth||add||color|
 |ppm123||Pranali||Mankar||pass@123||pass@123||email@gmail.com||9765674567||02/12/1997||Mumbai||Purple|
 |ppm1234||pranali||Mankar1||pass@1231||pass@1231||email1@gmail.com||9765674567||02/12/1997||Pune||Pink|
 
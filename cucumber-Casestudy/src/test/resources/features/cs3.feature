Feature: Search the Product --TestMeApp

Scenario: Search
Given user should navigates to TestMeApp on chrome browser
And user should click on SignIn link
And user enters with username as "lalitha"
And username enters with password as "password123"
And user clicks on Lgn button
And user searches for product
And user adds the product to cart
Then user should verify product is added on cart or not
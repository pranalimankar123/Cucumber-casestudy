Feature: move to the cart without adding item- TestMeApp
Scenario: The one where the user moves to cart without adding any item in it 

Given Alex has registered in to TestMeApp
When Alex search a particular product like headphone
And try to proceed to payment 
Then TestMeApp verify the success page
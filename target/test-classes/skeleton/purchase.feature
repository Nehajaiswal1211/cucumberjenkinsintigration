Feature: user story
Scenario: To purchase a product in testmeapp

Given TestMeApp opened by user 
When User enter username as "Lalitha" in username field
When user enter password as "Password123" in password3 field
And user press Login button
And Login done successfully
When user points to all categories
And user selects Electronics
Then user selects Headphone
Then user searches for headphone
Then user adds headphone to cart
Then user click on cart
Then user clicks on checkout
Then appliance bought
 

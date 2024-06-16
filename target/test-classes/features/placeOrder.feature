Feature: Ecom place Order validations

Scenario Outline:
	Given User is on Landing Page
	When User search for "<name>" product
	And User Select 3 Quantity of product
	And User add  product to cart
	And User click on Checkout page
	Then placeOrder button is enabled
	And User click on placeOrder Button
	And User Select Country "India"
	And User Click on Agree Terms and Conditions
	And User place the order
	Examples:
	|name|
	|tom|
	
	
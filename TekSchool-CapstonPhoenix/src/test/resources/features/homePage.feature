@HomePageFeature
Feature: HomePage Feature
@SmokeTest
Scenario: User verify currency values change
	Given User is on Retail website
	When User click on Currency
	And User Chose Euro from dropdown
	Then Currency value should change to Euro
	@SmokeTest
	Scenario: User empty Shopping cart message displays
	Given User is on Retail website
	When User click on shopping cart
	Then "Your shopping cart is emty" message should display
	
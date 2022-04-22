@RetailFeature
Feature: Retail Page Feature (for this feature you have to have an existing account)

Background: User is logged in and on My Account page
Given User is on Retail website
And User click on My Account
When User click on Login
And User enter username "q.mehry@gmail.com" and password "abc@123"
And User clicks on Login button
Then User should be logged in to My Account dashboard

@SmokeTest
Scenario Outline: Register as an Affiliate user with Cheque Payment Method
When User click on ‘Register for an Affiliate Account’ link
And User fill affiliate form with below information <company>, <website>, <taxID>, <paymentMethod> and <Cheque Payee Name>
And User check on About us check box
And User click on Continue button
Then User should see a success message

Examples:
|company	|website		|taxID		|paymentMethod	|Cheque Payee Name	|
|Mircrosoft		|www.microsoft.com	|55112233	|Cheque			|Bill Gates		|

@SmokeTest
Scenario Outline: Edit your affiliate information from Cheque payment method to Bank Transfer
When User click on ‘Edit your affiliate information' link
And user click on Bank Transfer radio button
And User fill Bank information with below information <bankName>, <abaNumber>, <swiftCode>, <accountName> and <accountNumber>
And User click on Continue button
Then User should see a success message

Examples:
|bankName		|abaNumber	|swiftCode	|accountName|accountNumber	|
|City Bank	|1111111111	|2222222222	|Mark Selby |3333333333	|
@SmokeTest
Scenario Outline: Edit your account Information
When User click on ‘Edit your account information’ link
And User modify below information <firstname>, <lastName>, <email> and <telephone>
And User click on Continue button
Then User should see a message ‘Success: Your account has been successfully updated.’

Examples:
|firstname	|lastName	|email				|telephone	|
|Qais		|Mehry	|q.mehry@gmail.com	|4444444444	|
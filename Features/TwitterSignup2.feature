Feature: Twitter signup2(email)

Scenario Outline:
Given user visit twitter signup page

When user clicks signup with phone or email and click use email instead

When user type valid name "<Name>",  valid "<email>" , Select month, date & year

When user clicks Next and click next and click signup

Then user able to sign up twitter account


Examples:

|Name|email|
|Ghalib|gasadullah1@gmail.com|
 
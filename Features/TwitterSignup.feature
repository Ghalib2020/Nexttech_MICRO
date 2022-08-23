Feature: Signup Twitter


Scenario Outline:
Given user visit twitter signup pag

When user clicks signup with phone or emails

When user type "<Name>", "<Phone Number>" , Select month, date & year

When user click Next and click next and click signup

Then user able to signs up twitter account

Examples:
|Name  |Phone Number|
|Ghalib|2149388318|
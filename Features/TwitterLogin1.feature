Feature: Twitter Login with phone no

Scenario Outline: 
Given user visit twitter login page

When user type valid "<Phone Number>" and click next

When user type valid "<Password>" and click login

Then user able to login twitter account 

Examples:
|Phone Number|Password|
|2149388318|Bdd@2020|
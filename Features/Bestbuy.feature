Feature: Bestbuy

Scenario Outline:

Given user go to bestbuy home page
When user click deal of the day and click bestbuyhome 
When user Search "<Product name>" product name and click search and click to beast by home
When user go to More and click gift cards
When user type another "<P name>" P name and click search
Then user able to see the product list page

Examples:
|Product name|P name | 
|Drone       |speaker|
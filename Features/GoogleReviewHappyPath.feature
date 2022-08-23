Feature: Google happy path



Scenario Outline:
Given user visit google homepage

When user type "<Business Name>" in search and click search icon

When user click write a review

When user click star icon and write a "<Review>" in review field

When user click post

Then user able to post a review 

Examples:
|Business Name|Review|
|nexttech Itc|Nexttech itc is one of the best It training center in usa.|
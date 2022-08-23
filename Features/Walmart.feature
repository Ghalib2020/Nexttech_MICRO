Feature: walmart

Scenario Outline: visit walmart
Given user visit walmart homepage
When user typess "<product name>"
When user click search item icon
Then user able to see products

Examples:
|product name|
|Whole milk|
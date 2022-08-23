Feature: Validate Amazon Search

Scenario Outline: Validate Amazon Bestseller

Given user visits Amazon homepages
When user type "<productname>" 
When user click search icon
Then user should be able to see the product

Examples: 
|productname|
|I Phone 12|
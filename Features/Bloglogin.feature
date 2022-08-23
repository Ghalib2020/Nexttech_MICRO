Feature: Blog logins

Scenario Outline: blog login
Given user visits blog homepage
When user types "<user name>"
When user types "<pw>" and click login
Then user ables to login

Examples:
|user name|pw  |
|1234    |abcd|

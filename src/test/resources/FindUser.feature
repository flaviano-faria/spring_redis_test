Feature: find user in redis

Scenario Outline: Find user
Given Given  I have users in database:
| id   | name      |
| <id> | <name>    |
When  When send find all user request
Then  Then I should have retrieved correctly all users

Examples:
| id   | name      |
| 12   | testname1 |
| 20   | testname2 |

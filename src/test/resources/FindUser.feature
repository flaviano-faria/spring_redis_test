Scenario Outline: Find user
Given Given  I have users in database:

When  When send find all user request
Then  Then I should have retrieved correctly all users

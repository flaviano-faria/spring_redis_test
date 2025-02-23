
Feature: create user in redis

  Scenario Outline: Maker starts a game
    Given Given  I have user infos <id> and <name>
    When  When send create user request
    Then  Then I should have a user object retrieved

    Examples:
      | id | name      |
      | 12 | testname1 |
      | 20 | testname2 |
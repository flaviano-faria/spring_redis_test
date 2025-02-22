
Feature: create user in redis

  Scenario Outline: Maker starts a game
    Given There are user infos <id> and <name>
    When  I send create user request
    Then  I should have a user object retrieved

    Examples:
      | id | name      |
      | 12 | testname1 |
      | 20 | testname2 |
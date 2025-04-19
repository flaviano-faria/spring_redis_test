Feature: create user in redis

  Scenario Outline: User creation
    Given Given  I have user infos:
      | id   | name      |
      | <id> | <name>    |
    When  When send create user request
    Then  Then I should have a user object retrieved

    Examples:
      | id   | name      |
      | 12   | testname1 |
      | 20   | testname2 |
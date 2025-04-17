# Spring Redis Test Project

This project demonstrates integration testing of Redis with Spring Boot using Cucumber for BDD (Behavior Driven Development) testing.

## Project Structure

```
spring_redis_test/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/springredis/
│   │       └── com/springredis/global/
│   │       ├── CreateUserTest.java
│   │       ├── CucumberConfiguration.java
│   │       └── User.java
│   └── resources/
│       └── CreateUser.feature
```

## Prerequisites

- Java 8 or higher
- Maven
- Redis Server
- Spring Boot

## Setup

1. Clone the repository:
```bash
git clone https://github.com/yourusername/spring_redis_test.git
cd spring_redis_test
```

2. Make sure Redis server is running on your local machine

3. Build the project:
```bash
mvn clean install
```

## Running Tests

To run the Cucumber tests:

```bash
mvn test
```

### Test Scenarios

The project includes BDD tests written in Gherkin syntax. The main test scenario is creating users in Redis:

```gherkin
Feature: create user in redis

  Scenario Outline: Maker starts a game
    Given Given I have user infos:
      | id   | name      |
      | <id> | <name>    |
    When When send create user request
    Then Then I should have a user object retrieved
```

## Project Components

### User Model
- Represents a user entity with `id` and `name` fields
- Uses Lombok annotations for builder pattern and getter/setter generation

### Test Configuration
- `CucumberConfiguration`: Handles data table type conversion for Cucumber tests
- Converts feature file data tables into User objects

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

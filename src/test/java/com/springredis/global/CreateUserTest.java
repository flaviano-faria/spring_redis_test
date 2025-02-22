package com.springredis.global;
import io.cucumber.java.StepDefinitionAnnotation;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CreateUserTest {


    @Given("There are user infos {Number} and {string}")
    public void createUserTest(String id, String name) {
        int x = 0;
        assert x == 0;
    }



    @When("I send create user request")
    public void sendUserCreationTest(){
        int x = 0;
        assert x == 0;
    }

    @Then( "I should have a user object retrieved")
    public void retrieveUser(){
        int x = 0;
        assert x == 0;
    }

    @Given("There are user infos {int} and {string}")
    public void thereAreUserInfosAnd(String arg0, String arg1) {
    }
}

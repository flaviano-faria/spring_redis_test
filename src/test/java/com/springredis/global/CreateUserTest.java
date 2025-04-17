package com.springredis.global;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.StepDefinitionAnnotation;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;


public class CreateUserTest {


    @Given("Given  I have user infos:")
    public void givenIHaveUserInfosAnd(List<User> listUser) {
        for (User user : listUser) {
            System.out.println(user.getId() + " " + user.getName()
            );
        }
        int x = 0;
        assert x == 0;
    }



    @When("When send create user request")
    public void whenSendCreateUserRequest() {
        int x = 0;
        assert x == 0;
    }

    @Then( "I should have a user object retrieved")
    public void retrieveUser(){
        int x = 0;
        assert x == 0;
    }


    @Then("Then I should have a user object retrieved")
    public void thenIShouldHaveAUserObjectRetrieved() {
        int x = 0;
        assert x == 0;
    }
}

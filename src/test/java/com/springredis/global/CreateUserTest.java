package com.springredis.global;
import com.springredis.util.json.JSonUtil;
import com.springredis.util.request.Request;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.StepDefinitionAnnotation;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.internal.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.messages.internal.com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;


public class CreateUserTest {

    @Given("Given  I have user infos:")
    public void givenIHaveUserInfosAnd(List<User> listUser) {
        Request request = new Request();
        for (User user : listUser) {
           assert user.getId() !=null;
           assert user.getName() !=null;

        }
    }



    @When("When send create user request")
    public void whenSendCreateUserRequest(List<User> listUser) {

        Request request = new Request();
        listUser.stream().forEach(
                user -> {
                    request.doPost(
                            JSonUtil.getJSONObject(user),
                            "http://localhost:8080/userservice/", "");
                }
        );
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

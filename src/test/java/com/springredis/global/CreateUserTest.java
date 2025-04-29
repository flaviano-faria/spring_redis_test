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

    public static final String URL = "http://localhost:8080/userservice";
    public static final String FIND_BY_ID = "/findbyid/";
    private List<User> userList;

    @Given("Given  I have user infos:")
    public void givenIHaveUserInfosAnd(List<User> listUser) {
        Request request = new Request();
        for (User user : listUser) {
           assert user.getId() !=null;
           assert user.getName() !=null;
        }
        this.userList = listUser;
    }

    @When("When send create user request")
    public void whenSendCreateUserRequest() {
        Request request = new Request();
        userList.stream().forEach(
                user -> {
                    request.doDeleteById(String.valueOf(user.getId()), "http://localhost:8080/userservice", "/delete/"+user.getId());
                    request.doPost(
                            JSonUtil.getJSONObject(user),
                            URL, "");
                }
        );
    }

    @Then("Then I should have a user object retrieved")
    public void thenIShouldHaveAUserObjectRetrieved() {
        Request request = new Request();
        userList.stream().forEach(
                user -> {
                    String response = request.doGet(
                        URL, FIND_BY_ID +user.getId());
                    assert response != null && response.length() > 0;
                }
        );
    }
}

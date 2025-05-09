package com.springredis.global;

import com.springredis.util.request.Request;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.List;


public class FindUserTest {

    private int numberOfRecords;

    @Given("Given  I have users in database:")
    public void given_I_have_users_in_database(List<User> listUser) {
        Request request = new Request();
        String response = request.doGet("http://localhost:8080/userservice/", "");
        System.out.println();
    }

    @When("When send find all user request")
    public void when_send_find_all_user_request(List<User> listUser) {
        Request request = new Request();
        String response = request.doGet("http://localhost:8080/userservice/", "");
    }

    @Then("Then I should have retrieved correctly all users")
    public void then_I_have_retrieved_correctly_all_users() {
        Request request = new Request();
        System.out.println();
    }

}

package com.springredis.global;

import com.springredis.util.json.JSonUtil;
import com.springredis.util.request.Request;
import io.cucumber.java.en.Given;

public class FindUserTest {

    private int numberOfRecords;

    @Given("Given  I have users in database:")
    public void given_I_have_users_in_database() {
        Request request = new Request();
        String response = request.doGet("http://localhost:8080/userservice/", "");

    }

}

package com.springredis.util.request;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Request {

    public String doGet(String url, String path) {
        Response response = given()
                .when()
                .get(path)
                .then()
                .extract()
                .response();
        return response.getBody().asString();
    }
}

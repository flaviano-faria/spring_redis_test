package com.springredis.util.request;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Request {

    public String doGet(String url, String path) {
        Response response = given()
                .when()
                .get(url + path)
                .then()
                .extract()
                .response();
        return response.getBody().asString();
    }

    public String doPost(String body, String url, String path) {
        Response response  = given()
                .header("Content-type", "application/json")
                .and()
                .body(body)
                .when()
                .post(url + path)
                .then()
                .extract().response();
        return response.getBody().asString();
    }

    public String doDeleteById(String id, String url, String path) {
        Response response = given()
                .when()
                .delete(url + path)
                .then()
                .extract()
                .response();
        return response.getBody().asString();
    }
}

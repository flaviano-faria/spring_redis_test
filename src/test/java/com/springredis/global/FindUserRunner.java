package com.springredis.global;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/FindUser.feature",
    glue = "com.springredis.global"
)
public class FindUserRunner {
} 
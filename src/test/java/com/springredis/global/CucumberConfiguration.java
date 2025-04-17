package com.springredis.global;

import io.cucumber.java.DataTableType;
import java.util.Map;

public class CucumberConfiguration {

    @DataTableType
    public User userEntry(Map<String, String> entry) {
        return User.builder()
                .id(entry.get("id"))
                .name(entry.get("name"))
                .build();
    }
} 
package com.example.project.controller;

import com.example.project.api.TestAPI;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController implements TestAPI {

    public String testApplication() {
        return "Application is up and running!!!";
    }
}

package com.cicd.pipeline.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @GetMapping
    public String testEndpoint() {

        System.out.println("testEndpoint() method called");

        return "Test endpoint is working and it is deployed mazaa aa raha bidu kasa kai mumbai jgvhkjdhkh!";
    }
}

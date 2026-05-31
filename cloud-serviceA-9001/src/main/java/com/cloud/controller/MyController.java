package com.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloud")
public class MyController {
    @GetMapping("/hello")
    public String Hello() {
        return "Hello!";
    }

    @Value("${spring.application.name}")
    String serviceName;

    @GetMapping("/whoami")
    public String WhoAmI() {
        return serviceName;
    }
}

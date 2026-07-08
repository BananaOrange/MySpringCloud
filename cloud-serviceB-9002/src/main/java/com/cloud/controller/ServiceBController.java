package com.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service-b")
public class ServiceBController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello B!";
    }

    @Value("${spring.application.name}")
    String serviceName;

    @GetMapping("/whoami")
    public String whoAmI(){
        return serviceName;
    }
}

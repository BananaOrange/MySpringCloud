package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceA9001Application {
    public static void main(String[] args) {
        SpringApplication.run(ServiceA9001Application.class, args);
    }
}

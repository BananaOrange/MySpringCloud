package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceC9003Application {
    public static void main(String[] args) {
        SpringApplication.run(ServiceC9003Application.class, args);
    }
}

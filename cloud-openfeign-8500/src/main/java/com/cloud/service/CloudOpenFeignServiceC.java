package com.cloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(value = "service-C")
public interface CloudOpenFeignServiceC {
    @GetMapping("/service-c/hello")
    public String hello();
}

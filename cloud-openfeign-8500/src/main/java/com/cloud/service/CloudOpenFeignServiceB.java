package com.cloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(value = "service-B")
public interface CloudOpenFeignServiceB {
    @GetMapping("/service-b/hello")
    public String hello();
}

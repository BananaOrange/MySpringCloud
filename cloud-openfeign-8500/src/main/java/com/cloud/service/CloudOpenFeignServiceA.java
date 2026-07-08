package com.cloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(value = "service-a") // 这里大小写似乎不敏感
public interface CloudOpenFeignServiceA {
    @GetMapping("/service-a/hello") // 注意这里的地址要写正确，是接口的完整地址
    public String hello();
}

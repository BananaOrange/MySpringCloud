package com.cloud.controller;

import com.cloud.service.CloudOpenFeignServiceA;
import com.cloud.service.CloudOpenFeignServiceB;
import com.cloud.service.CloudOpenFeignServiceC;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/openfeign")
public class CloudOpenFeignController {
    @Resource
    CloudOpenFeignServiceA feignServiceA;

    @Resource
    CloudOpenFeignServiceB feignServiceB;

    @Resource
    CloudOpenFeignServiceC feignServiceC;


    @GetMapping("/hello-all")
    public String helloAll() {
        String resA = feignServiceA.hello();
        String resB = feignServiceB.hello();
        String resC = feignServiceC.hello();

        return String.join(" | ", resA, resB, resC);
    }
}

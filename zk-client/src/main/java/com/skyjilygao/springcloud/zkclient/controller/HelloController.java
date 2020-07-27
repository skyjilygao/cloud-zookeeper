package com.skyjilygao.springcloud.zkclient.controller;

import com.skyjilygao.springcloud.zkclient.service.ServiceFeign;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {
    @Autowired
    private ServiceFeign serviceFeign;

    @Value("${server.port}")
    String port;
    @RequestMapping("hello")
    public String hello(String name){
        log.info("param -> name: " + name);
        return serviceFeign.hello(name);
    }
}

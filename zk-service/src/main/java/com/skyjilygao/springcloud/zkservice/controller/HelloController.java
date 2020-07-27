package com.skyjilygao.springcloud.zkservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@Slf4j
@RestController
public class HelloController {

    @Value("${server.port}")
    String port;

    @RequestMapping("hello")
    public String hello(@RequestParam("name") String name){
        log.info("param: name -> " + name);
        return "hello " + name+", the port: "+port+". time:"+ LocalDateTime.now();
    }
}

package com.skyjilygao.springcloud.zkclient.service;

import com.skyjilygao.springcloud.zkclient.service.fallback.ServiceFeignImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "zk-service", fallback = ServiceFeignImpl.class)
public interface ServiceFeign {

    @RequestMapping("hello")
    String hello(@RequestParam("name") String name);
}

package com.skyjilygao.springcloud.zkclient.service.fallback;

import com.skyjilygao.springcloud.zkclient.service.ServiceFeign;
import org.springframework.stereotype.Service;

@Service
public class ServiceFeignImpl implements ServiceFeign {

    @Override
    public String hello(String name) {
        return "error, this defaul return. name -> " + name;
    }
}

package com.daguo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.daguo.HelloService;
import org.springframework.stereotype.Component;

@Component
@Service
public class HelloServiceImpl  implements HelloService {
    @Override
    public String sayHello(String name) {
        return "provider2_Hello" + name;
    }
}

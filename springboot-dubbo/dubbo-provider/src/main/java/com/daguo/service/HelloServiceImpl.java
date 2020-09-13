package com.daguo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.daguo.HelloService;
import org.springframework.stereotype.Component;

/**
 * @author
 */
@Component
@Service //注意这个是dubbo提供的的而不是Spring提供的！！！

public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello" + name;
    }
}

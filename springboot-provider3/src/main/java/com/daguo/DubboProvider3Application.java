package com.daguo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class DubboProvider3Application {
    public static void main(String[] args) {
        SpringApplication.run(DubboProvider3Application.class,args);
    }
}

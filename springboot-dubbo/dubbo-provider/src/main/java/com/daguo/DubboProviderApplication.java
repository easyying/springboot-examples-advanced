package com.daguo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 */
@SpringBootApplication
@EnableDubboConfiguration//@EnableDubboConfiguration 注解开启Dubbo的自动配置，表示要开启dubbo功能. (dubbo provider服务可以使用或者不使用web容器)
public class DubboProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboProviderApplication.class, args);
	}

}

package com.cxy.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: microservice
 * @description: 启动类
 * @author: CuiXiangYu
 * @create: 2020-01-28 09:52
 **/
@SpringBootApplication
@EnableEurekaClient
public class Provider6003 {
    public static void main(String[] args) {
        SpringApplication.run(Provider6003.class,args);
    }
}

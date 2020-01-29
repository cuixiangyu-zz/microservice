package com.cxy.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

/**
 * @program: microservice
 * @description: 启动类
 * @author: CuiXiangYu
 * @create: 2020-01-28 19:46
 **/

/**
 * 有@ComponentScan注解，@SpringBootApplication会失效
 * @EnableFeignClients注解 basePackages定位的是feign接口的位置
 */
@SpringBootApplication
@EnableFeignClients(basePackages={"com.cxy.api"})
@EnableEurekaClient
@ComponentScan({"com.cxy.api","com.cxy.consumer"})
public class FeignConsumer {
    public static void main(String[] args) {
        SpringApplication.run(FeignConsumer.class,args);
    }
}

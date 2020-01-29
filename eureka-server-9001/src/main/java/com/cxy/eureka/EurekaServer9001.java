package com.cxy.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: microservice
 * @description: qidonglei
 * @author: CuiXiangYu
 * @create: 2020-01-27 21:56
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer9001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer9001.class,args);
    }
}

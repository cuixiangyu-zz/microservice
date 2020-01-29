package com.cxy.consumer;

import com.cxy.ribbonrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @program: microservice
 * @description: 启动类
 * @author: CuiXiangYu
 * @create: 2020-01-28 10:37
 **/
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="PROVIDER",configuration= MySelfRule.class)
public class Consumer5001 {
    public static void main(String[] args) {
        SpringApplication.run(Consumer5001.class,args);
    }
}

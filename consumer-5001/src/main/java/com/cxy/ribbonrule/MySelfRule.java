package com.cxy.ribbonrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 65797
 */
@Configuration
public class MySelfRule {
    //Ribbon默认是轮询，我自定义为随机
    @Bean
    public IRule myRule() {
        return new RandomRule();
    }
}
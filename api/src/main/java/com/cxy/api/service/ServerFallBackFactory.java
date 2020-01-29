package com.cxy.api.service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @program: microservice
 * @description: 服务降级
 * @author: CuiXiangYu
 * @create: 2020-01-29 09:47
 **/
@Component
public class ServerFallBackFactory implements FallbackFactory<ServerService> {
    @Override
    public ServerService create(Throwable throwable) {
        return new ServerService() {
            @Override
            public String getServerName() {
                return "服务器暂停服务！！";
            }
        };
    }
}

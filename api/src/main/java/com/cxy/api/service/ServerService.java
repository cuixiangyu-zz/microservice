package com.cxy.api.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "PROVIDER",fallbackFactory = ServerFallBackFactory.class)
public interface ServerService {
    @GetMapping("/server/getServerName")
    public String getServerName();
}

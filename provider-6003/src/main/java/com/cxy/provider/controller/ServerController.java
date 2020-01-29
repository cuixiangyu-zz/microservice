package com.cxy.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: microservice
 * @description: 获取当前服务器
 * @author: CuiXiangYu
 * @create: 2020-01-28 17:38
 **/
@RestController
@RequestMapping("/server")
public class ServerController {

    @GetMapping("/getServerName")
    public String getServerName(){
        return "Provider6003";
    }
}

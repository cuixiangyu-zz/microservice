package com.cxy.consumer.controller;

import com.cxy.api.service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/server")
public class ConsumerController
{
    @Autowired
    ServerService serverService;

    @GetMapping("/getServer")
    public String getServer(){
        System.out.println("aaaaaaaaaa");
        return serverService.getServerName();
    }
}
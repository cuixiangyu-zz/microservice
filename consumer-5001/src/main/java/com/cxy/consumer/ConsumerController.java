package com.cxy.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/server")
public class ConsumerController
{
    private static final String REST_URL_PREFIX = "http://PROVIDER";
    
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getServer")
    public String getServer(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/server/getServerName", String.class);
    }
}
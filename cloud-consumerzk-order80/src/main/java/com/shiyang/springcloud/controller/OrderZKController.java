package com.shiyang.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author shiyang
 * @create 2020-03-15 9:53 下午
 */
@RestController
public class OrderZKController {
    // zk中注册的服务名
    private static final String INVOKE_URL = "http://cloud-provider-payment";

    private final RestTemplate restTemplate;

    @Autowired
    public OrderZKController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping(value = "/consumer/payment/zk")
    public String paymentInfo() {
        return restTemplate.getForObject(INVOKE_URL + "/payment/zk", String.class);
    }
}

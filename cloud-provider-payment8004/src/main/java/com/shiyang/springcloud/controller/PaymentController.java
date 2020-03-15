package com.shiyang.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author shiyang
 * @create 2020-03-15 8:31 下午
 */
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/payment/zk")
    public String paymentZK() {
        return "spring cloud with zookeeper: " + serverPort + "\t" + UUID.randomUUID();
    }
}

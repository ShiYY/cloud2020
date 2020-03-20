package com.shiyang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author shiyang
 * @create 2020-03-15 9:52 下午
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZKApplication80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderZKApplication80.class, args);
    }
}

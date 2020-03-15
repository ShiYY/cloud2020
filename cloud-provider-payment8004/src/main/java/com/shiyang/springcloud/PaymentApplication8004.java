package com.shiyang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author shiyang
 * @create 2020-03-15 8:29 下午
 */
@SpringBootApplication
@EnableDiscoveryClient // 该注解用于向使用eureka, consul或者zookeeper做为注册中心时注册服务
public class PaymentApplication8004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication8004.class, args);
    }
}

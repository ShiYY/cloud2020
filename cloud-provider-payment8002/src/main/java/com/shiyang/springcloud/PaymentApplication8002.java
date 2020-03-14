package com.shiyang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author shiyang
 * @create 2020-03-11 11:42 下午
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentApplication8002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication8002.class, args);
    }
}

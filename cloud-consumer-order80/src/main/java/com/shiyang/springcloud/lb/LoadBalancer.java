package com.shiyang.springcloud.lb;

import java.util.List;

import org.springframework.cloud.client.ServiceInstance;

/**
 * @author shiyang date: 2020/3/18
 */
public interface LoadBalancer {
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}

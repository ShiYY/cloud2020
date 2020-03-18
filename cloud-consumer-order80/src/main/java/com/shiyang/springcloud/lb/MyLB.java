package com.shiyang.springcloud.lb;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

/**
 * @author shiyang date: 2020/3/18
 */
@Component
public class MyLB implements LoadBalancer {

    private static final Logger logger = LoggerFactory.getLogger(MyLB.class);

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    /**
     * 自旋锁实现并发安全
     * 
     * @return
     */
    public final int getAndIncrement() {
        int current;
        int next;
        do {
            current = atomicInteger.get();
            next = current >= Integer.MAX_VALUE ? 0 : current + 1;
        } while (!atomicInteger.compareAndSet(current, next));
        logger.info("MyLB index: {}", atomicInteger.get());
        return next;
    }

    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
        int index = getAndIncrement() % serviceInstances.size();
        return serviceInstances.get(index);
    }
}

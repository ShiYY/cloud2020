package com.shiyang.springcloud.service;

import org.apache.ibatis.annotations.Param;

import com.shiyang.springcloud.entities.Payment;

/**
 * @author shiyang date: 2020/3/13
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}

package com.shiyang.springcloud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shiyang.springcloud.dao.PaymentDao;
import com.shiyang.springcloud.entities.Payment;
import com.shiyang.springcloud.service.PaymentService;

/**
 * @author shiyang date: 2020/3/13
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}

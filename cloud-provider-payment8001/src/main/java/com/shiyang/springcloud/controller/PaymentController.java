package com.shiyang.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.shiyang.springcloud.entities.CommonResult;
import com.shiyang.springcloud.entities.Payment;
import com.shiyang.springcloud.service.PaymentService;

/**
 * @author shiyang date: 2020/3/13
 */
@RestController
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        if (result > 0) {
            // 200 约定好的成功吗
            return new CommonResult(200, "插入数据库成功", result);
        }
        // 404 约定好的错误码
        return new CommonResult(404, "插入数据库失败", null);
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        if (null != payment) {
            // 200 约定好的成功吗
            return new CommonResult(200, "查询成功", payment);
        }
        // 404 约定好的错误码
        return new CommonResult(404, "没有对应记录, 查询id: " + id, null);
    }
}

package com.xiaoluban.springbootconsumer.controller;

import com.example.dubbospringbootinterface.service.OrderService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @author txb
 * @version 1.0.0
 * @since 2022/9/15 23:10
 */

@RestController
@RequestMapping("order")
public class OrderController {

    //服务调用方使用的注解，不需要写到配置文件
    @DubboReference
    private OrderService orderService;

    @GetMapping("initOrder")
    public String initOrder(){
        orderService.initOrder();
        return "订单创建成功"+ LocalDateTime.now();
    }
}

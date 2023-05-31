package com.xiaoluban.springbootprovider.service.impl;

import com.example.dubbospringbootinterface.service.OrderService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author txb
 * @version 1.0.0
 * @since 2022/9/15 23:40
 */
public class OrderServiceImpl implements OrderService {

    public void initOrder() {
        System.out.println("真正服务实现方，initOrder");
    }


}

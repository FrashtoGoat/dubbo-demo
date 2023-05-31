package com.xiaoluban.springbootconsumer.controller;

import com.example.dubbospringbootinterface.service.HelloService;
import com.example.dubbospringbootinterface.service.OrderService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @author txb
 * @version 1.0.0
 * @since 2022/9/15 23:10
 */

@RestController
@RequestMapping("hello")
public class HelloController {

    //服务调用方使用的注解，不需要写到配置文件
    @DubboReference
    private HelloService helloService;

    @GetMapping("helloWorld/{somethings}")
    public String helloWorld(@PathVariable String somethings){
        return helloService.helloWorld(somethings);
    }


}

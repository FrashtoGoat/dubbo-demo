package com.xiaoluban.springbootprovider.configuration;

import com.example.dubbospringbootinterface.service.OrderService;
import com.xiaoluban.springbootprovider.service.impl.OrderServiceImpl;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProviderConfiguration {
  
   @Bean
   @DubboService(group="order")
   public OrderService orderServiceImpl() {
       return new OrderServiceImpl();
   }


}

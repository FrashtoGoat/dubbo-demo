package com.xiaoluban.springbootprovider.service.impl;

import com.example.dubbospringbootinterface.service.HelloService;

public class HelloWorldServiceImpl implements HelloService {

    @Override
    public String helloWorld(String printThings) {
        return "hello World," + printThings;
    }


}

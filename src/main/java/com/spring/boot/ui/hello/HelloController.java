package com.spring.boot.ui.hello;

import com.spring.boot.service.hello.impl.HelloServiceImpl;
import org.springframework.boot.SpringApplication;

public class HelloController
{
    public static void main(String[] args) throws Exception
    {
        SpringApplication.run(HelloServiceImpl.class, args);
    }
}

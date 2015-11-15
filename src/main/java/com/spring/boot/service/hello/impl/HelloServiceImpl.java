package com.spring.boot.service.hello.impl;

import com.spring.boot.service.hello.HelloService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class HelloServiceImpl implements HelloService
{
    @RequestMapping("/")
    @ResponseBody
    String home()
    {
        return "Hello World!";
    }

    @RequestMapping("/index")
    @ResponseBody
    String index()
    {
        return "This is index page";
    }

    public static void main(String[] args) throws Exception
    {
        SpringApplication.run(HelloServiceImpl.class, args);
    }
}

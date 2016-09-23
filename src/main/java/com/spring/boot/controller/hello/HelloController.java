package com.spring.boot.controller.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController
{
    @RequestMapping("/")
    @ResponseBody
    public String home()
    {
        return "Hello World!";
    }

    @RequestMapping("/index")
    @ResponseBody
    public String index()
    {
        return "This is index page";
    }
}

package com.neusoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "user")
public class HelloController
{
    @RequestMapping(path = "one")
    public String test1()
    {
        System.out.println("11111");
        return "success";
    }
}



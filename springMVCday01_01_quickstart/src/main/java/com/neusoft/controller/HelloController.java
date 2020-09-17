package com.neusoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/user")
public class HelloController
{

    @RequestMapping(path = "/hello")
    public String sayHello()
    {
        System.out.println("Hello Controller ");
        return "success";
    }

    @RequestMapping("/hehe")
    public String sayHello3(){
        System.out.println("Hello Controller ");
        // 调用service
        // req.setattribute
        System.out.println("hehe");
        return "success";
    }
    @RequestMapping(path = "/hello2")
    public String sayHello1(){
        System.out.println("sayHello1 ");
        return "success";
    }

    @RequestMapping(value = "/testRequestMapping", params = {"username=hehe"}, headers = {"Accept"})
    public String testRequestMapping()
    {
        System.out.println("testRequestMapping。。。");
        return "success";
    }

}
package com.neusoft.controller;


import com.neusoft.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class ParamController
{
    @RequestMapping("/test")
    public String test(User user){
        System.out.println("test执行");
        System.out.println(user);
        return "success";
    }
}

package com.neusoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/anno")
public class AnnoController
{
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String body)
    {
        System.out.println("RequestBody");
        System.out.println(body);
        return "success";
    }

    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam(name = "name",required = false)String username)
    {
        System.out.println("RequestParam");
        System.out.println(username);
        return "success";
    }

@RequestMapping("/testPathVariable/{name}")
public String testPathVariable(@PathVariable(name = "name")String name)
{
    System.out.println("PathVariable");
    System.out.println(name);
    return "success";
}

}
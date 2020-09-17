package com.neusoft.controller;

import com.neusoft.domain.Account;
import com.neusoft.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/param")
public class ParamController {
    @RequestMapping("/testParam")
    public String testParam(String username, String password ){
        System.out.println("testParam执行了、、、、");
        System.out.println("username" +username);
        System.out.println("password" +password);
        return "success";
    }
    // JavaBean

    @RequestMapping("/saveAccount")
    public String saveAccount(Account account){
        System.out.println("saveAccount");
        System.out.println(account);
        return "success";
    }

    //JavaBean
    //自定义类型转换器
    @RequestMapping("/saveUser")
    public String testParam(User user)
    {
        System.out.println("saveUser执行了");
        System.out.println(user);
        return "success";
    }

    //原生servletapi
    @RequestMapping("/testServlet")
    public String testServlet(HttpServletRequest request, HttpServletResponse response)
    {
        System.out.println("testServlet......");
        System.out.println(request);
        String hehe = request.getParameter("hehe");
        System.out.println(hehe);
        return "success";
    }
}

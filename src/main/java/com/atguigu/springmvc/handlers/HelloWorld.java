package com.atguigu.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by King on 2018/8/17 17:40.
 */
@Controller
public class HelloWorld {
    @RequestMapping("/hello")
    public String Hello(){
        System.out.println("hello world");
        return "success";
    }
}

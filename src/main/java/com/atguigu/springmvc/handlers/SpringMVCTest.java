package com.atguigu.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by King on 2018/9/26 16:36.
 */
@Controller
@RequestMapping("/springmvc")
public class SpringMVCTest {

    public static final String SUCCESS = "success";

    @RequestMapping("/testRequestMapping")
    public String testRequestMapping(){
        System.out.println("testRequestMapping");
        return SUCCESS;
    }

}

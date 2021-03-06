package com.atguigu.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by King on 2018/9/26 16:36.
 */
@Controller
@RequestMapping("/springmvc")
public class SpringMVCTest {

    public static final String SUCCESS = "success";



    /**
     * Rest 风格的 URL. 以 CRUD 为例: 新增: /order POST 修改: /order/1 PUT update?id=1 获取:
     * /order/1 GET get?id=1 删除: /order/1 DELETE delete?id=1
     *
     * 如何发送 PUT 请求和 DELETE 请求呢 ? 1. 需要配置 HiddenHttpMethodFilter 2. 需要发送 POST 请求
     * 3. 需要在发送 POST 请求时携带一个 name="_method" 的隐藏域, 值为 DELETE 或 PUT
     *
     * 在 SpringMVC 的目标方法中如何得到 id 呢? 使用 @PathVariable 注解
     *
     */
    @RequestMapping(value = "/testRest/{id}", method = RequestMethod.PUT)
    public String testRestPut(@PathVariable Integer id) {
        System.out.println("testRest Put: " + id);
        return SUCCESS;
    }

    @RequestMapping(value = "/testRest/{id}", method = RequestMethod.DELETE)
    public String testRestDelete(@PathVariable Integer id) {
        System.out.println("testRest Delete: " + id);
        return SUCCESS;
    }

    @RequestMapping(value = "/testRest", method = RequestMethod.POST)
    public String testRest() {
        System.out.println("testRest POST");
        return SUCCESS;
    }

    /**
     * @PathVariable 可以来映射 URL 中的占位符到目标方法的参数中.
     * @param id
     * @return
     */
    @RequestMapping(value = "/testRest/{id}",method = RequestMethod.GET)
    public String testRest(@PathVariable Integer id){
        System.out.println("testRest GET,id = " + id);
        return SUCCESS;
    }

    @RequestMapping(value = "/testAntPath/*/abc")
    public String testAntPath(){
        System.out.println("testAntPath");
        return SUCCESS;
    }

    /**
     * 了解: 可以使用 params 和 headers 来更加精确的映射请求.
     * params 和 headers 支持简单的表达式.
     * @return
     */
    @RequestMapping(value = "/testParamsAndHeaders",
            params = {"username","age!10"},headers = {"Accept-Language=en-US,zh;q=0.8"})
    public String testParamsAndHeaders() {
        System.out.println("testParamsAndHeaders");
        return SUCCESS;
    }

    /**
     * 常用: 使用 method 属性来指定请求方式
     */
    @RequestMapping(value = "/testMethod",method = RequestMethod.POST)
    public String testMethod(){
        System.out.println("test Method");
        return SUCCESS;
    }

    @RequestMapping("/testRequestMapping")
    public String testRequestMapping(){
        System.out.println("testRequestMapping");
        return SUCCESS;
    }

}

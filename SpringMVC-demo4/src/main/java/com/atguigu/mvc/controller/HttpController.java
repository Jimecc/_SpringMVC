package com.atguigu.mvc.controller;

import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Jim
 * @Description
 * @createTime 2022年08月09日
 */
@Controller
public class HttpController {

    @RequestMapping(value="/testRequestBody",method = RequestMethod.POST)
    public String testRequestBody(@RequestBody String requestBody){
        System.out.println("requestBody:\t" + requestBody.toString());
        return "success";
    }

    @RequestMapping(value="/testRequestEntity")
    public String testRequestEntity(RequestEntity<String> request){
        System.out.println("请求头："+request.getHeaders());
        System.out.println("请求体:"+request.getBody());
        return "success";
    }
}

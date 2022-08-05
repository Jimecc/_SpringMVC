package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Jim
 * @Description
 * @createTime 2022年08月05日
 */
@Controller
@RequestMapping("/hello")
public class RequestMappingController {
    @RequestMapping("/success")
    public String testRequestController(){
        return "success";
    }

    @RequestMapping(value={"/test","/post"},method = {RequestMethod.POST,RequestMethod.GET})
    public String success(){
        return "success";
    }
}

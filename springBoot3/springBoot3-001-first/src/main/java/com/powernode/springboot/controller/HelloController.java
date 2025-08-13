package com.powernode.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.service.annotation.GetExchange;

/**
 * ClassName:HelloController
 * Description:
 * Author:dwj@
 * Datetime:2025/8/217:42
 * version:1.0
 */
@Controller
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody   //直接返回字符串
    public  String  hello(){
        return "springboot HAHA";
    }
}

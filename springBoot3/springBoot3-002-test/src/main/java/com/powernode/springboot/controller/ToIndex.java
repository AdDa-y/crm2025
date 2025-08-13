package com.powernode.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:ToIndex
 * Description:
 * Author:dwj@
 * Datetime:2025/8/222:46
 * version:1.0
 */
@RestController
public class ToIndex {
    @GetMapping("/hehe")
    public  String index(){
        return "hehe";
    }
}

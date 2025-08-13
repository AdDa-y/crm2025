package com.powernode.springboot.controller;

import com.powernode.springboot.bean.Vip;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ClassName:VipController
 * Description:
 * Author:dwj@
 * Datetime:2025/8/1112:29
 * version:1.0
 */
@RestController
public class VipController {
    //restFul编程风格
    @GetMapping("/list/{pageNo}")
    public List<Vip> list(@PathVariable int pageNo){
        // 1.设置当前页码和每页显示的记录条数
        pageH
    }
}

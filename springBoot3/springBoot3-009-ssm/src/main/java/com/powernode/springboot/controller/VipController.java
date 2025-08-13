package com.powernode.springboot.controller;

import com.powernode.springboot.bean.Vip;
import com.powernode.springboot.service.VipService;
import jakarta.servlet.http.PushBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:VipController
 * Description:
 * Author:dwj@
 * Datetime:2025/8/616:31
 * version:1.0
 */
@RestController
public class VipController {
    @Autowired
    private VipService vipService;
    @GetMapping("/detail")
    public Vip detail(@RequestParam("cardNumber") String cardNumber){
        return  vipService.findByCardNumber(cardNumber);
    }
}

package com.powernode.springboot.controller;

import com.powernode.springboot.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import javax.xml.transform.TransformerException;

/**
 * ClassName:AccountController
 * Description:
 * Author:dwj@
 * Datetime:2025/8/1122:22
 * version:1.0
 */
@Controller
public class AccountController {
    @Autowired
    private AccountService accountService;
    @PostMapping("/transfer")
    public   String transfer( String fromActNo, String toActNo, double money) throws TransformerException {

        accountService.transfer(fromActNo ,toActNo ,money);

        return "success";
    }
}

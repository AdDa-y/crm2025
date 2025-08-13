package com.powernode.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * ClassName:service
 * Description:
 * Author:dwj@
 * Datetime:2025/8/321:20
 * version:1.0
 */
@Service("userService01")
public class UserService01 {

    @Value("${user.username}")
    private  String username;

    @Value("${user.password}")
    private String password;

    public  void display(){
        System.out.println(username+"::::"+password);
    }
}

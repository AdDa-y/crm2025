package com.powernode.springboot.service.impl;

import com.powernode.springboot.bean.User;
import com.powernode.springboot.service.UserService;
import org.springframework.stereotype.Service;

/**
 * ClassName:UserServiceImpl
 * Description:
 * Author:dwj@
 * Datetime:2025/8/314:31
 * version:1.0
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public User findUser() {
       return  new User("DEW","12344");
    }
}

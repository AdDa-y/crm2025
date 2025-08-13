package com.powernode.springboot3006aop.service.Impl;

import com.powernode.springboot3006aop.service.UserService;
import org.springframework.stereotype.Service;

/**
 * ClassName:UserServiceImpl
 * Description:
 * Author:dwj@
 * Datetime:2025/8/511:35
 * version:1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public void doSome() {
        System.out.println("服务正在运行当中，清使用。。。。。");
    }
}

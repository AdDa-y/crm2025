package com.powernode.springboot3006aop.component;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * ClassName:LoggingAop
 * Description:
 * Author:dwj@
 * Datetime:2025/8/511:38
 * version:1.0
 */
@Component
@Aspect
public class LoggingAop {

    @Before("execution( * com.powernode.springboot3006aop.service..*(..))")
    public   void serviceBefore(){
        System.out.println("在服务之前的aop启动了");
    }
}

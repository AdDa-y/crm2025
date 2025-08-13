package com.powernode.springboot3006aop;

import com.powernode.springboot3006aop.service.Impl.UserServiceImpl;
import com.powernode.springboot3006aop.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBoot3006AopApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(SpringBoot3006AopApplication.class, args);
        UserService bean = run.getBean(UserServiceImpl.class);
        bean.doSome();
        run.close();

    }

}
